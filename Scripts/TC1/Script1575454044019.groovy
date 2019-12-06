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

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Administator Login/input_Login Panel_email'), 
    'admin@phptravels.com')

WebUI.click(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Administator Login/span_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Administator Login/input_Email Address_password'), 
    'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Administator Login/button_Login'))

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Business Name_site_title'), 
    'YourCompany')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Site URL_site_url'), 
    'yourcompany.com')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_License Key_license'), 
    'abcd1234')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Copyrights_copyright'), 
    'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_ddmmyyyy                mmddyyyy'), 
    'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Enabled                Disabled'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Russian                             _7e6470'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Enable                Disable'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_No                  Yes'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Yes                No'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Auto Approve                Admin Approve'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Yes                No_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Auto Approve                Admin Approve_1'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Booking Expiry_bookingexpiry'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Alphabets Only                 Numbe_35158d'), 
    'alnum', true)

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Coupon code Length_codelength'), 
    '8')

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Yes                No_1_2'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/textarea_Our website is offline currently'), 
    'This is my Offline Message')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Home Title_slogan'), 
    'YourCompany | The Future')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Default Keywords_keywords'), 
    'This is my default keywords')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/textarea_php travels is complete booking an_a50366'), 
    'This is my default description')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/input_Google Map API_mapapi'), 
    'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/textarea_Tracking  Analytics_gacode'), 
    'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Enabled                Disabled_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/select_Every 1 Day                         _5906a9'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/button_Submit'))

WebUI.click(findTestObject('Object Repository/HanhNguyenT_Day1_Practice2/Page_Application Settings/strong_Logout'))

WebUI.closeBrowser()

