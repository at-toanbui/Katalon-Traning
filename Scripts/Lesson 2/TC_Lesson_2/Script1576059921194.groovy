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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('Lesson 2/Page_Administator Login/input_Login Panel_email'), 'abc@gmail.com')

WebUI.setText(findTestObject('Lesson 2/Page_Administator Login/input_Email Address_password'), 'sdasdasdasd')

WebUI.click(findTestObject('Lesson 2/Page_Administator Login/button_Login'))

WebUI.verifyTextPresent('Invalid Login Credentials\n', false)

WebUI.clearText(findTestObject('Lesson 2/Page_Administator Login/input_Login Panel_email'))

WebUI.setText(findTestObject('Lesson 2/Page_Administator Login/input_Login Panel_email'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('Lesson 2/Page_Administator Login/input_Email Address_password'))

WebUI.setText(findTestObject('Lesson 2/Page_Administator Login/input_Email Address_password'), 'demoadmin')

WebUI.click(findTestObject('Lesson 2/Page_Administator Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Lesson 2/Page_Dashboard/strong_Logout'), 0)

WebUI.click(findTestObject('Lesson 2/Page_Modules/a_Modules'))

WebUI.verifyElementChecked(findTestObject('Lesson 2/Page_Modules/div_Travelport hotels                                               Settings'), 
    0)

WebUI.click(findTestObject('Lesson 2/Page_Modules/a_Travelhope Hotels'))

WebUI.click(findTestObject('Lesson 2/Page_Modules/a_Settings'))

WebUI.back()

Url = WebUI.getUrl()

WebUI.verifyMatch(Url, ' https://www.phptravels.net/admin/settings/modules/', false)

