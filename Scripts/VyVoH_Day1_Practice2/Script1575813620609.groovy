import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Login page/txtEmail'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('VyVoH_Day1_Practice2/Login page/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('VyVoH_Day1_Practice2/Login page/btnLogin'))

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtBusinessName'), 'YourCompany')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtSiteURL'), 'yourcompany.com')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtLicenseKey'), '123456789')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlDateFormate'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlUsersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlUsersRegApproval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlSuppliersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlReviews'), 'Yes', true)

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtBookingExpiry'), '5')

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlCouponcodeType'), 'alnum', true)

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtCouponcodeLength'), '8')

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlOffline'), '1', true)

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txaOfflineMesssage'), 'This is the offline message')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtHomeTitle'), 'YourCompany | The Future')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txtGoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('VyVoH_Day1_Practice2/Settings page/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlRSSEnabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('VyVoH_Day1_Practice2/Settings page/ddlCheckUpdates'), '0', true)

WebUI.click(findTestObject('VyVoH_Day1_Practice2/Settings page/btnSubmit'))

WebUI.click(findTestObject('VyVoH_Day1_Practice2/Settings page/btnLogout'))

