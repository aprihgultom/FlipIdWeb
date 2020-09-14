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

CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")

WebUI.click(findTestObject('Object Repository/REGISTER/btnDaftar'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/REGISTER/valNama'), 'Nama harus diisi')

WebUI.verifyElementText(findTestObject('Object Repository/REGISTER/valEmail'), 'Email harus diisi')

WebUI.verifyElementText(findTestObject('Object Repository/REGISTER/valPassword'), 'Password harus diisi')

WebUI.verifyElementText(findTestObject('Object Repository/REGISTER/valNoHandphone'), 'Nomor handphone harus diisi')

WebUI.click(findTestObject('Object Repository/REGISTER/btnDaftar'), FailureHandling.STOP_ON_FAILURE)


CustomKeywords.'com.fl.flipwebsite.general.screenCapture'(p_intNo, "FlipIdWebsite")

WebUI.deleteAllCookies()

WebUI.closeBrowser()
