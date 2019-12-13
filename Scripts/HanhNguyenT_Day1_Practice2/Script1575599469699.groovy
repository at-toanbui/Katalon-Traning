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

WebUI.openBrowser('https://www.phptravels.net/admin/settings')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Administator Login/txtLoginPanelEmail'), 'admin@phptravels.com')

WebUI.click(findTestObject('HanhNguyenT_Day1_Practice2/Page_Administator Login/txtSpanPassword'))

WebUI.setEncryptedText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Administator Login/txtEmailAddressPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('HanhNguyenT_Day1_Practice2/Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtBusinessNameSiteTitle'), 'YourCompany')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtSiteUrl'), 'yourcompany.com')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtLicense Key'), 'abcd1234')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbDateFormate'), 'm/d/Y', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbMulti Language'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbDefaultLanguage'), 'vi', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbMultiCurrency'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbRestrictWebsite'), 'Yes', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbUsersRegistration'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbUsersRegApproval'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbSuppliersRegistration'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbReviews'), 'Yes', true)

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtBookingExpiryBookingExpiry'), '2')

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbAlphabets'), 'alnum', 
    true)

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtCouponCode'), '8')

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbOffline'), '1', true)

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txaOurWebsiteIsOfflineCurrently'), 'This is my Offline Message')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtHomeTitle'), 'YourCompany | The Future')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txtGoogleMapApi'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbRSS Enabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/cbbCheckUpdates'), '0', true)

WebUI.click(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('HanhNguyenT_Day1_Practice2/Page_Application Settings/btnLogout'))

WebUI.closeBrowser()

