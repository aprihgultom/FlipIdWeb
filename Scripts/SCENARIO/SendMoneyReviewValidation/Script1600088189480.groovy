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
import internal.GlobalVariable as GlobalVariable


WebUI.callTestCase(findTestCase('URL/tcOpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PAGE/LOGIN/tcLogin'), [
														 ('p_intNo') 		 : 1,
														('p_strEmail')  	: 'qualitycontrol.aab@gmail.com',
													   ('p_strPassword')   : 'P@ssw0rd'
													], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PAGE/DASHBOARD/SendMoney - Review'), [
													 ('p_intNo') 		 		: 1,
													('p_strNoRekeningUsed')    : 'BCA',
												   ('p_strNoRekeningTujuan')  : 'BCA',
												  ('p_strNoRekening')   	 : '0663189040',
												 ('p_strNominal')   		: '25000',
												('p_strBerita')   		   : 'Review Test'
											], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PAGE/DASHBOARD/tcLogOut'), [('p_intNo') : 1], FailureHandling.STOP_ON_FAILURE)