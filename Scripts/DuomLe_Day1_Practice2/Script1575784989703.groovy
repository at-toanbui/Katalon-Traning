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

WebUI.setText(findTestObject('test8/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('test8/Page_Administator Login/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('test8/Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('test8/Page_Application Settings/txtBusinessName'), 'YourCompany')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtSiteurl'), 'yourcompany.com')

WebUI.click(findTestObject('test8/Page_Application Settings/txtLicenseKey'))

WebUI.setText(findTestObject('test8/Page_Application Settings/txtLicenseKey'), 'phptravelsea483587c38f7344')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectDayformat'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectUsersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectUsers Reg. Approval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlSelectSuppliersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectReviews'), 'Yes', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/txtBookingExpiry'), '3')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectCouponcodeType'), 'alnum', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/txtCoupon code Length'), '8')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectOffline'), '1', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/txaOfflineMessage'), 'This is the offline message')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtHomeTitle'), 'YourCompany | The Future')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('test8/Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtMapapi'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('test8/Page_Application Settings/txaTrackingAnalyticsgacode'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectRSSEnabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselectCheckUpdates'), '0', true)

WebUI.click(findTestObject('test8/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('test8/Page_Application Settings/btnLogout'))

WebUI.closeBrowser()

