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

WebUI.setText(findTestObject('Page_Administator Login/txtLoginEmail'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('Page_Administator Login/txtLoginPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('Page_Application Settings/txtBusinessName'), 'YourCompany')

WebUI.setText(findTestObject('Page_Application Settings/txtSiteURL'), 'yourcompany.com')

WebUI.setText(findTestObject('Page_Application Settings/txtLicenseKey'), '12946127846912746')

WebUI.setText(findTestObject('Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlDateFormate'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlUsersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlUsersRegApproval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlSuppliersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlReviews'), 'Yes', true)

WebUI.setText(findTestObject('Page_Application Settings/txtBookingExpiry'), '14')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlCouponCodeType'), 'alnum', true)

WebUI.setText(findTestObject('Page_Application Settings/txtCouponCodeLength'), '8')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlOffline'), '1', true)

WebUI.setText(findTestObject('Page_Application Settings/txaOfflineMessage'), 'This is the offline message')

WebUI.setText(findTestObject('Page_Application Settings/txtHomeTitle'), 'YourCompany | The Future')

WebUI.setText(findTestObject('Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('Page_Application Settings/txtGoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('Page_Application Settings/txtTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/dllRSSEnabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddlCheckUpdates'), '0', true)

WebUI.click(findTestObject('Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('Page_Application Settings/btnLogout'))

WebUI.closeBrowser()

