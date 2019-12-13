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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtEmail'), 'abcd@gmail.com')

WebUI.setEncryptedText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtPassword'), 'Yn6QC/H8fSYzsj1NX6Cv7g==')

WebUI.click(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/btnLogin'))

WebUI.verifyTextPresent('Invalid Login Credentials', false)

WebUI.clearText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtEmail'))

WebUI.setText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtPassword'))

WebUI.setEncryptedText(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/txtPassword'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('HungPhungKhac_Day2_Practice/Page_Administator Login/btnLogin'))

WebUI.verifyElementPresent(findTestObject('HungPhungKhac_Day2_Practice/Page_Dashboard/div_Booking Summary'), 0)

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.verifyElementPresent(findTestObject('HungPhungKhac_Day2_Practice/Page_Modules/div_Settings_control__indicator'), 0)

WebUI.verifyElementNotChecked(findTestObject('HungPhungKhac_Day2_Practice/Page_Modules/div_Settings_control__indicator'), 
    0)

WebUI.click(findTestObject('HungPhungKhac_Day2_Practice/btnSettings'))

WebUI.back()

URL = WebUI.getUrl()

WebUI.verifyElementHasAttribute(findTestObject(URL), 'https://www.phptravels.net/admin/settings/modules/', 0)

