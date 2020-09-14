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

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

Date date = new Date()
String datePart = date.format("yyyy/MMMM/dd")
String timePart = date.format("HH:mm:ss")

String[] split = timePart.split(':')
String jam = split[0]
String menit = split[1]
String detik = split[2]

strGlbVar.strCaptureFolder = strGlbVar.strCaptureFolder + jam +"_"+ menit +"_"+ detik + "/"

WebUI.openBrowser('https://flip.id/login')

WebUI.delay(1)

WebUI.maximizeWindow()

