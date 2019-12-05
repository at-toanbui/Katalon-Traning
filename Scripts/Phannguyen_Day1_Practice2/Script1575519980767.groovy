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

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.click(findTestObject('PhpTravels_Admin/Page_Administator Login/spnPassword'))

WebUI.setEncryptedText(findTestObject('PhpTravels_Admin/Page_Administator Login/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('PhpTravels_Admin/Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtBusinessName'), 'Yourcompany')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtSiteURL'), 'yourcompany.com')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtLicenseKey'), 'phannguyen')

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/txtCopyrights'))

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by Yourcompany')

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboDayFormat'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboUserRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboUserRegApproval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboSuppliersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboReviews'), 'Yes', true)

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtBookingExpiry'), '5')

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboCouponCodeType'), 'alnum', true)

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtCouponLength'), '8')

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboOffline'), '1', true)

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txaOfflineMessage'), 'This is the offline message')

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/txtHomeTitle_slogan'))

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/txtHomeTitle_slogan'))

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/txtHomeTitle_slogan'))

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtHomeTitle_slogan'), 'Your Company | The Future')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txtGoogleMapApi'), 'http://endpoint-s3.api.awsamazone.com')

WebUI.setText(findTestObject('PhpTravels_Admin/Page_Application Settings/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboRSS'), '0', true)

WebUI.selectOptionByValue(findTestObject('PhpTravels_Admin/Page_Application Settings/cboCheckUpdate'), '0', true)

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('PhpTravels_Admin/Page_Application Settings/btnLogout'))

