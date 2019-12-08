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

WebUI.setText(findTestObject('test8/Page_Application Settings/txtBusinessName'), 'YourCompany')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtSiteurl'), 'yourcompany.com')

WebUI.click(findTestObject('test8/Page_Application Settings/txtLicenseKey'))

WebUI.setText(findTestObject('test8/Page_Application Settings/txtLicenseKey'), 'phptravelsea483587c38f7344')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtCopyrights'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_dayformat'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_multilanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Default_Language'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Multi_Currency'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Restrict_Website'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Users_Registration'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Users Reg. Approval'), 'No', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Suppliers_Registration'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Reviews'), 'Yes', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/cboBookingExpiry'), '3')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Coupon_code_Type'), 'alnum', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/cbo_Coupon code Length'), '8')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Offline'), '1', true)

WebUI.setText(findTestObject('test8/Page_Application Settings/txaOffline_Message'), 'This is the offline message')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtHome_Title'), 'YourCompany | The Future')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtDefaultKeywords'), 'This is my default keywords')

WebUI.setText(findTestObject('test8/Page_Application Settings/txaDefault_Description'), 'This is my default description')

WebUI.setText(findTestObject('test8/Page_Application Settings/txtMapapi'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('test8/Page_Application Settings/txa_Tracking Analytics_gacode'), 'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_RSS_Enabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('test8/Page_Application Settings/ddlselect_Check_Updates'), '0', true)

WebUI.click(findTestObject('test8/Page_Application Settings/btnSubmit'))

WebUI.click(findTestObject('test8/Page_Application Settings/btnLogout'))

WebUI.closeBrowser()

