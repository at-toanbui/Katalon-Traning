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

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings')

WebUI.setText(findTestObject('homework/Page_Administator Login/txt_email'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('homework/Page_Administator Login/txt_password'), 
    'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('homework/Page_Administator Login/btn_Login'))

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_BusinessName'), 'YourCompany')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_SiteURL'), 'yourcompany.com')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_LicenseKey'), '1234')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_Copyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_DateFormate'), 
    'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_MultiLanguage'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_DefaultLanguage'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_MultiCurrency'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_RestrictWebsite'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_UsersRegistration'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_UsersReg'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_SuppliersRegistration'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_reviews'), 
    'Yes', true)

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_BookingExpiry'), 
    '6')

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_Alphabets_Only'), 
    'alnum', true)

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_Couponcode'), 
    '8')

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_Offline'), 
    '1', true)

WebUI.setText(findTestObject('homework/Page_Application Settings/txa_OfflineMessage'), 
    'This is the offline message')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_HomeTitle_slogan'), 'YourCompany | The Future')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_DefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('homework/Page_Application Settings/txa_DefaultDescription'), 
    'This is my default description')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_GoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('homework/Page_Application Settings/txt_TrackingAnalytics'), 
    'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_RSSEnabled'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('homework/Page_Application Settings/ddl_CheckUpdates'), 
    '0', true)

WebUI.click(findTestObject('homework/Page_Application Settings/btn_Submit'))

WebUI.click(findTestObject('homework/Page_Application Settings/btn_Logout'))

WebUI.closeBrowser()

