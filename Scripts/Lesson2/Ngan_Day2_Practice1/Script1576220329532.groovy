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

WebUI.setText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtEmail'), 'a@a.com')

WebUI.setText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtPassword'), 'abcd1234')

WebUI.click(findTestObject('Lesson2_Practice1/Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('Lesson2_Practice1/Page_Administator Login/lblFailMessage'))

WebUI.clearText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtEmail'))

WebUI.setText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtPassword'))

WebUI.setText(findTestObject('Lesson2_Practice1/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('Lesson2_Practice1/Page_Administator Login/btnLogin'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('Lesson2_Practice1/Page_Dashboard/btnAccount'))

WebUI.click(findTestObject('Lesson2_Practice1/Page_Dashboard/btnModules'))

WebUI.waitForPageLoad(2)

url1 = WebUI.getUrl()

WebUI.verifyMatch(url1, 'https://www.phptravels.net/admin/settings/modules/', false)

WebUI.verifyElementChecked(findTestObject('Lesson2_Practice1/Page_Modules/chkTravelhope'), 2)

WebUI.click(findTestObject('Lesson2_Practice1/Page_Modules/btnSettingsTravelhope'))

WebUI.back()

url2 = WebUI.getUrl()

WebUI.verifyMatch(url2, 'https://www.phptravels.net/admin/settings/modules/', false)

WebUI.closeBrowser()

