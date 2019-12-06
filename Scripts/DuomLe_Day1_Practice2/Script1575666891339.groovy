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

WebUI.click(findTestObject('test8/Page_Administator Login/txt_Password'))

WebUI.setEncryptedText(findTestObject('test8/Page_Administator Login/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('test8/Page_Administator Login/btnLogin'))

WebUI.setText(findTestObject('test8/Page_Application Settings/txtBusiness Name'), 'YourCompany')

WebUI.setText(findTestObject('test8/Page_Application Settings/txt_Site URL_site_url'), 'yourcompany.com')

WebUI.click(findTestObject('test8/Page_Application Settings/txt_License Key_license'))

WebUI.setText(findTestObject('test8/Page_Application Settings/txt_License Key_license'), 'phptravelsea483587c38f7344')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_ddmmyyyy mmddyyyy'), 
    'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Enabled Disabled'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Russian _7e6470'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Enable Disable'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_No Yes'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Yes No'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Auto Approve Admin Approve'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Yes No_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Auto Approve Admin Approve_1'), 
    'Yes', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/cboBookingExpiry'), '3')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Alphabets Only Numbe_35158d'), 
    'alnum', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/cbo_Coupon code Length'), '8')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Yes No_1_2'), 
    '1', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/txa_Our website is offline currently'), 
    'This is the offline message')

WebUI.setText(findTestObject('test8/Page_Application Settings/txt_Home Title_slogan'), 'YourCompany | The Future')

WebUI.setText(findTestObject('test8/Page_Application Settings/txt_Default Keywords'), 'This is my default keywords')

WebUI.setText(findTestObject('test8/Page_Application Settings/txa_php travels is complete booking an_a50366'), 
    'This is my default description')

WebUI.setText(findTestObject('test8/Page_Application Settings/txt_Google Map API_mapapi'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('test8/Page_Application Settings/txa_Tracking Analytics_gacode'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Enabled Disabled_1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Every 1 Day _5906a9'), 
    '0', true)

WebUI.click(findTestObject('test8/Page_Application Settings/btn_svg_Chat with Abraham_lc-1mpchac'))

WebUI.click(findTestObject('test8/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('test8/Page_Application Settings/btnLogout'))

WebUI.closeBrowser()

