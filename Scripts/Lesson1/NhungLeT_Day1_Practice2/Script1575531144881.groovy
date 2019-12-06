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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.navigateToUrl(GlobalVariable.ADMIN_PAGE_SETTING_URL)

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Administator Login/txtEmail'), email)

WebUI.setEncryptedText(findTestObject('Lesson1/Practice_2/Page_Administator Login/txtPassword'), password)

WebUI.click(findTestObject('Lesson1/Practice_2/Page_Administator Login/btnLogin'))

WebUI.waitForElementVisible(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtBusinessName'), GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtBusinessName'), 'YourCompany')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtSiteURL'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtSiteURL'), 'yourcompany.com')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtLicenseKey'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtLicenseKey'), RandomStringUtils.random(15, 
        true, true))

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtCopyright'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtCopyright'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlDateFormat'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlMultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlDefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlMultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlRestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlUsersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlUserRegApproval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlSuppliersRegistration'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlReviews'), 'Yes', true)

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtBookingExpriry'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtBookingExpriry'), RandomStringUtils.randomNumeric(
        1))

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlCouponCodeType'), 'alnum', true)

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtCouponCode'), '8')

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlSiteOffline'), '1', true)

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txaOfflineMessage'), 'This is the offline message')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtHomeTitle'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtHomeTitle'), 'YourCompany | The Future')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtDefaultKeywords'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txaDefaultDescription'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txaDefaultDescription'), 'This is my default description')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtGoogleMapAPI'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txtGoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.clearText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txaTrackingAnalytics'))

WebUI.setText(findTestObject('Lesson1/Practice_2/Page_Application Settings/txaTrackingAnalytics'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlRSSEnabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('Lesson1/Practice_2/Page_Application Settings/ddlCheckUpdate'), '0', true)

WebUI.click(findTestObject('Lesson1/Practice_2/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('Lesson1/Practice_2/Page_Application Settings/btnLogout'))

