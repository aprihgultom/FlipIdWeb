import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as strGlbVar
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.exception.StepErrorException as StepErrorException

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions


WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('Object Repository/LOGIN/txtEmail'), p_strEmail)

WebUI.setText(findTestObject('Object Repository/LOGIN/txtPassword'), p_strPassword)

CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LOGIN/btnSubmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/DASHBOARD/btnKirimUang'), 10)
WebUI.waitForElementVisible(findTestObject('Object Repository/DASHBOARD/btnKirimUang'), 10)

CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")
