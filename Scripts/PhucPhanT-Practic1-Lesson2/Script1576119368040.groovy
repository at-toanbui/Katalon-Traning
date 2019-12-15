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

WebUI.delay(2)

WebUI.setText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtEmail'), 'admin@phptrav.com')

WebUI.setText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/btnLogin'))

WebUI.getText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/Error2'))

WebUI.verifyElementText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/Error2'), 'Invalid Login Credentials')

WebUI.clearText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtEmail'))

WebUI.setText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtPassword'))

WebUI.setText(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/btnLogin'))

a = WebUI.getUrl()

WebUI.verifyMatch(a, 'https://www.phptravels.net/admin', true)

WebUI.click(findTestObject('KatalonHealthcare/lesson2/Page_Modules/Page_Modules/btnModules'))

WebUI.verifyElementChecked(findTestObject('KatalonHealthcare/lesson2/Page_Administator Login/Page_Modules/div_Settings_control__indicator'), 
    2)

WebUI.click(findTestObject('KatalonHealthcare/lesson2/Page_Modules/btnSettingsTravelhopeHotels'))

WebUI.back()

b = WebUI.getWindowTitle()

WebUI.verifyMatch(b, 'Modules', true)

WebUI.closeBrowser()

