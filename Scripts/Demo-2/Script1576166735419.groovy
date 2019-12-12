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

WebUI.setText(findTestObject('Example/Page_Administator Login/txtEmail'), 'leminhthai@gmail.com')

WebUI.setText(findTestObject('Example/Page_Administator Login/txtPassword'), '123456')

WebUI.click(findTestObject('Example/Page_Administator Login/btnLogin'))

InvalidLoginCredentials = WebUI.getText(findTestObject('Example/Page_Administator Login/lblLoginFail'))

WebUI.verifyTextPresent('Invalid Login Credentials', true)

WebUI.setText(findTestObject('Example/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.setText(findTestObject('Example/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('Example/Page_Administator Login/btnLogin'))

RevenueChart = WebUI.getText(findTestObject('Example/Page_Administator Login/lblRevenueChart'))

WebUI.verifyMatch(RevenueChart, 'REVENUE CHART', true)

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/ ')

WebUI.verifyElementChecked(findTestObject('Example/Page_Administator Login/chkTravelhope'), 0)

WebUI.click(findTestObject('Example/Page_Administator Login/btnSettings'))

WebUI.click(findTestObject('Page_TravelhopeHotels Settings/btnBack'))

WebUI.verifyTextPresent('HOTEL', true)

