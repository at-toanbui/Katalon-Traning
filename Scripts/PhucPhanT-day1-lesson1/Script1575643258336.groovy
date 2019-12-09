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

WebUI.setText(findTestObject('Page_Administator Login/txt_Email'), 'admin@phptravels.com')

WebUI.click(findTestObject('Page_Administator Login/txt_Password'))

WebUI.setEncryptedText(findTestObject('Page_Administator Login/txt2_Password'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Page_Administator Login/btn_Login'))

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_BusinessName'))

WebUI.setText(findTestObject('Page_Application Settings/txt_BusinessName'), 'YourCompany')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_SiteURL'))

WebUI.setText(findTestObject('Page_Application Settings/txt_SiteURL'), 'Yourcompany.com')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_LicenseKey'))

WebUI.setText(findTestObject('Page_Application Settings/txt_LicenseKey'), 'testing')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_Copyrights'))

WebUI.setText(findTestObject('Page_Application Settings/txt_Copyrights'), 'All Rights Reserved by Yourcompany')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_DateFormate'), 'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/txt_MultiLanguage'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_DefaultLanguage'), 'vi', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_MultiCurrency'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_RestrictWebsite'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_UsersRegistration'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_UsersRegApproval'), 'Yes', true)

WebUI.setText(findTestObject('Page_Application Settings/cbo_CouponCodeLength'), '8')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_Offline'), '1', true)

WebUI.setText(findTestObject('Page_Application Settings/txa_OfflineMessage'), 'This is Offline Message\n')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_HomeTitle'))

WebUI.setText(findTestObject('Page_Application Settings/txt_HomeTitle'), 'YourCompany | Future')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_DefaultKeywords'))

WebUI.setText(findTestObject('Page_Application Settings/txt_DefaultKeywords'), 'This is my Default Keywords')

WebUI.setText(findTestObject('Page_Application Settings/txa_DefaultDescription'), 'This is my Default Description\n')

WebUI.doubleClick(findTestObject('Page_Application Settings/txt_GoogleMapAPI'))

WebUI.setText(findTestObject('Page_Application Settings/txt_GoogleMapAPI'), 'http://endpoint-s3.api.awsamazon.com/')

WebUI.setText(findTestObject('Page_Application Settings/txa_TrackingAnalytics'), 'Tracking & Analytics code \n')

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_RSSEnabled'), '0', true)

WebUI.selectOptionByValue(findTestObject('Page_Application Settings/ddl_CheckUpdates'), '0', true)

WebUI.click(findTestObject('Page_Application Settings/btn_Submit'))

WebUI.click(findTestObject('Page_Application Settings/btn_Logout'))

WebUI.closeBrowser()

