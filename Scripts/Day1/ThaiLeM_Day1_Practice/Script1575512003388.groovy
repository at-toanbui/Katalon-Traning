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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Administator Login/bntLogin'), 'admin@phptravels.com')

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Administator Login/txtPassword'))

WebUI.setEncryptedText(findTestObject('ThaiLeM_Day1_Practice2/Page_Administator Login/txtEmail'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Administator Login/span_Login'))

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txxBusinessName'), 'YourCompany')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtSite URL'), 'yourcompany.com')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtLicense Key_license'), '')

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtLicense Key_license'))

WebUI.doubleClick(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtLicense Key_license'))

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtLicense Key_license'), 'asiantech1234')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlDateFormat'), 
    'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlMulti Currency'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlDefault Language'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlMulti Language'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlRestrict Website'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlUsers Registration'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlReviews'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlSuppliers Registration'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlUsers Reg. Approval'), 
    'Yes', true)

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtBooking Expiry'), '5')

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlCouponcode Type'), 
    'alnum', true)

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtCouponcode'), '8')

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlOffline'), 
    '1', true)

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txaOfflineMessage'), 
    'This is the offline message')

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtHome Title'))

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtHomeTitle'), 'YourCompany | The Future')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtDefault Keywords'), 'This is my default keywords')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txaDefault Description'), 
    'This is my default description')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txtGoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlMultiCurrency'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/ddlCheck Updates'), 
    '0', true)

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/bntSubmit'))

WebUI.click(findTestObject('ThaiLeM_Day1_Practice2/Page_Application Settings/bntLogout'))

WebUI.closeBrowser()

