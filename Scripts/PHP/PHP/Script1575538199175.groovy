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

WebUI.openBrowser('https://www.phptravels.net/admin')

WebUI.sendKeys(findTestObject('Page_Administator Login/input_Login Panel_email'), 'loppe@gmail.com')

WebUI.sendKeys(findTestObject('Page_Administator Login/input_Email Address_password'), 'abcd123')

WebUI.click(findTestObject('Page_Administator Login/span_Login'))

WebUI.verifyElementText(findTestObject('Page_Administator Login/errorText'), 'Invalid Login Credentials')

WebUI.clearText(findTestObject('Page_Administator Login/input_Login Panel_email'))

WebUI.clearText(findTestObject('Page_Administator Login/input_Email Address_password'))

WebUI.sendKeys(findTestObject('Page_Administator Login/input_Login Panel_email'), 'admin@phptravels.com')

WebUI.sendKeys(findTestObject('Page_Administator Login/input_Email Address_password'), 'demoadmin')

WebUI.click(findTestObject('Page_Administator Login/span_Login'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.verifyElementChecked(findTestObject('Page_Modules/chbTravelhope'), 2)

WebUI.click(findTestObject('Page_Modules/button_Settings'))

WebUI.back()

