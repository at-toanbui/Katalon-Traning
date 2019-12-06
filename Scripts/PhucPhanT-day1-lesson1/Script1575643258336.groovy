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

WebUI.setText(findTestObject('Page_Administator Login/Email_txt'), 'admin@phptravels.com')

WebUI.click(findTestObject('Page_Administator Login/Password_txt'))

WebUI.setEncryptedText(findTestObject('Page_Administator Login/Password_txt2'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Page_Administator Login/Login_btn'))

WebUI.doubleClick(findTestObject('Page_Application Settings/BusinessName_txt'))

WebUI.setText(findTestObject('Page_Application Settings/BusinessName_txt'), 'YourCompany')

WebUI.doubleClick(findTestObject('Page_Application Settings/SiteURL_txt'))

WebUI.setText(findTestObject('Page_Application Settings/SiteURL_txt'), 'Yourcompany.com')

WebUI.doubleClick(findTestObject('Page_Application Settings/LicenseKey_txt'))

WebUI.setText(findTestObject('Page_Application Settings/LicenseKey_txt'), 'testing')

WebUI.doubleClick(findTestObject('Page_Application Settings/Copyrights_txt'))

WebUI.setText(findTestObject('Page_Application Settings/Copyrights_txt'), 'All Rights Reserved by Yourcompany')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/DateFormate_ddl'), 'm/d/Y', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/MultiLanguage_txt'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/DefaultLanguage_ddl'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/MultiCurrency_ddl'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/RestrictWebsite_ddl'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/UsersRegistration_ddl'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/UsersRegApproval_ddl'), 
    'Yes', true)

WebUI.setText(findTestObject('Page_Application Settings/CouponCodeLength_cbo'), '8')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/Offline_ddl'), '1', true)

WebUI.setText(findTestObject('Page_Application Settings/OfflineMessage_txa'), 'This is Offline Message\n')

WebUI.doubleClick(findTestObject('Page_Application Settings/HomeTitle_txt'))

WebUI.setText(findTestObject('Page_Application Settings/HomeTitle_txt'), 'YourCompany | Future')

WebUI.doubleClick(findTestObject('Page_Application Settings/DefaultKeywords_txt'))

WebUI.setText(findTestObject('Page_Application Settings/DefaultKeywords_txt'), 'This is my Default Keywords')

WebUI.setText(findTestObject('Page_Application Settings/DefaultDescription_txa'), 'This is my Default Description\n')

WebUI.doubleClick(findTestObject('Page_Application Settings/GoogleMapAPI_txt'))

WebUI.setText(findTestObject('Page_Application Settings/GoogleMapAPI_txt'), 'http://endpoint-s3.api.awsamazon.com/')

WebUI.setText(findTestObject('Page_Application Settings/TrackingAnalytics_txa'), 'Tracking & Analytics code \n')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/RSSEnabled_ddl'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/CheckUpdates_ddl'), 
    '0', true)

WebUI.click(findTestObject('Page_Application Settings/svg_Chat with Abraham_lc-1mpchac'))

WebUI.click(findTestObject('Page_Application Settings/Submit_btn'))

WebUI.click(findTestObject('Page_Application Settings/Logout_btn'))

WebUI.closeBrowser()

