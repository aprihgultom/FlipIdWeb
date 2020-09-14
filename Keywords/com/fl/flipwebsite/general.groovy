package com.fl.flipwebsite

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.exception.StepErrorException as StepErrorException

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.openqa.selenium.support.ui.Select

import org.openqa.selenium.By as By
import org.openqa.selenium.interactions.Actions

import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import internal.GlobalVariable

public class general {
	
	def WaitLoadProcessing(String findBy, String objectToWait) {
		
				WebDriver driver = DriverFactory.getWebDriver()
		
				if (findBy == "xpath") {
		
					WebDriverWait wait = new WebDriverWait(driver, 300)
					WebElement element = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.xpath(objectToWait)))
				}
		
				if (findBy == "name") {
		
					WebDriverWait wait = new WebDriverWait(driver, 300)
					WebElement element = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.name(objectToWait)))
				}
		
				if (findBy == "id") {
		
					WebDriverWait wait = new WebDriverWait(driver, 300)
					WebElement element = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.id(objectToWait)))
				}
			}
		
		
			@Keyword
			def Boolean waitProcessingCommand(){
				Integer stale = 0
				int countTO
				//wait until element appear
				//while(!WebUI.verifyElementClickable(objectToFind, FailureHandling.OPTIONAL)){}
				//element appear but processing command too
				WebUI.switchToFrame(findTestObject('frame'), 5)
				WebDriver myDriver = DriverFactory.getWebDriver()
				try
				{
					while(true){
						//what if there isnt blocker? > done with try catch
						//Watchout for stale element error
						//need timeout parameter?
						//findTestObject has default 30s timeout > changed to driverfactory
						//for multiple processing command > "display: none" only appear once in last
						String result = myDriver.findElement(By.xpath("//*[contains(@id,'Blocker_Box')]")).getAttribute("style")
						//String result = WebUI.getAttribute(findTestObject('Page_a2is Retail/blocker'), 'style').toString()
						if(result.contains('display: none;'))
							break
						WebUI.delay(1)
						WebUI.println('Found')
						countTO = countTO+1
						if(countTO == 30 ){
							throw new Exception("Freeze Processing Command")
						}
					}
				}
				catch(Exception ex)
				{
					WebUI.println('Not Found')
					WebUI.println(ex)
				}
				finally
				{
					WebUI.switchToDefaultContent()
					return true
				}
			}
		
			def screenCapture(int NoData, String filename) {
		
				GlobalVariable.numCaptureSequence = GlobalVariable.numCaptureSequence + 1
		
				String fullpath = GlobalVariable.strCaptureFolder + NoData + "-" + filename + "_" + GlobalVariable.numCaptureSequence + ".jpg"
		
				WebUI.takeScreenshot(fullpath)
			}
	
}
