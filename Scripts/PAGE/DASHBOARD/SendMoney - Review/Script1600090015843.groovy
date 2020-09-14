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

WebUI.click(findTestObject('Object Repository/DASHBOARD/menuKirimUang'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")

WebUI.click(findTestObject('Object Repository/DASHBOARD/menuPopUpKirimUang'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/SEND_MONEY/btnOkDataSudahBenar'), 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/SEND_MONEY/btnOkDataSudahBenar'), 10)

CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")


WebUI.selectOptionByLabel(findTestObject('Object Repository/SEND_MONEY/selRekeningYangDigunakan'), p_strNoRekeningUsed, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/SEND_MONEY/selRekeningTujuan'), p_strNoRekeningTujuan, false)

WebUI.setText(findTestObject('Object Repository/SEND_MONEY/txtNoRekeningTujuan'), p_strNoRekening)

WebUI.setText(findTestObject('Object Repository/SEND_MONEY/txtNominal'), p_strNominal)

WebUI.clearText(findTestObject('Object Repository/SEND_MONEY/txtBerita'))
WebUI.setText(findTestObject('Object Repository/SEND_MONEY/txtBerita'), "")
WebUI.setText(findTestObject('Object Repository/SEND_MONEY/txtBerita'), p_strBerita)

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/SEND_MONEY/btnOkDataSudahBenar'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForJQueryLoad(20)
WebUI.delay(5)
CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")

