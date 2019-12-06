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

WebUI.setText(findTestObject('Practice_1/Page_Administator Login/text_Login Panel_email'), 'admin@phptravels.com')

WebUI.click(findTestObject('Object Repository/Practice_1/Page_Administator Login/span_Password'))

WebUI.setEncryptedText(findTestObject('Practice_1/Page_Administator Login/txt_Email Address_password'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Practice_1/Page_Administator Login/btn_Login'))

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Business Name_site_title'), 'YourCompany')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Site URL_site_url'), 'yourcompany.com')

WebUI.click(findTestObject('Practice_1/Page_Application Settings/txt_License Key_license'))

WebUI.doubleClick(findTestObject('Practice_1/Page_Application Settings/txt_License Key_license'))

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_License Key_license'), '123456789')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Copyrights_copyright'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_ddmmyyyy mmddyyyy'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Enabled Disabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Russian _7e6470'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Enable Disable'), '0', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_No Yes'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Yes No'), '0', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Auto Approve Admin Approve'), 'Yes', 
    true)

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Booking Expiry_bookingexpiry'), '10')

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Alphabets Only Numbe_35158d'), 'alnum', 
    true)

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Coupon code Length_codelength'), '8')

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Yes No_1'), '1', true)

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txa_Our website is offline currently'), 'This is the offline message')

WebUI.click(findTestObject('Practice_1/Page_Application Settings/txt_Home Title_slogan'))

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Home Title_slogan'), 'YourCompany | The Future')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Default Keywords_keywords'), 'This is my default keywords')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txa_php travels is complete booking an_a50366'), 'This is my default description')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txt_Google Map API_mapapi'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('Practice_1/Page_Application Settings/txa_Tracking Analytics_gacode'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Enabled Disabled_1'), '0', true)

WebUI.selectOptionByValue(findTestObject('Practice_1/Page_Application Settings/ddl_Every 1 Day _5906a9'), '0', true)

WebUI.click(findTestObject('Practice_1/Page_Application Settings/btn_Submit'))

WebUI.click(findTestObject('Practice_1/Page_Application Settings/btn_Logout'))

WebUI.closeBrowser()

