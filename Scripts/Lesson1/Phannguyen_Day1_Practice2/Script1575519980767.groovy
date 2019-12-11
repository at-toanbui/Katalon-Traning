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

WebUI.openBrowser('https://www.phptravels.net/admin/settings/')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('Lession1/PhpTravels_Admin/Page_Administator Login/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Lession1/PhpTravels_Admin/Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtBusinessName'), 'Yourcompany')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtSiteURL'), 'yourcompany.com')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtLicenseKey'), 'phannguyen')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by Yourcompany')

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlDayFormat'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlUserRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlUserRegApproval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlSuppliersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlReviews'), 'Yes', true)

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtBookingExpiry'), '5')

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlCouponCodeType'), 'alnum', true)

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtCouponLength'), '8')

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlOffline'), '1', true)

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txaOfflineMessage'), 'This is the offline message')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtHomeTitleSlogan'), 'Your Company | The Future')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txtGoogleMapApi'), 'http://endpoint-s3.api.awsamazone.com')

WebUI.setText(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlRSS'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/ddlCheckUpdate'), '0', true)

WebUI.click(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Lession1/PhpTravels_Admin/Page_Application Settings/btnLogout'))

WebUI.delay(3)

WebUI.closeBrowser()

