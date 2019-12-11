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

WebUI.setText(findTestObject('Page_Administator Login/txtEmailAdress'), 'duomle@gmail.com')

WebUI.setText(findTestObject('Page_Administator Login/txtpassword'), '@A09994')

WebUI.click(findTestObject('Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('Page_Administator Login/msgInvalid'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Page_Administator Login/txtEmailAdress'))

WebUI.setText(findTestObject('Page_Administator Login/txtEmailAdress'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('Page_Administator Login/txtpassword'))

WebUI.setText(findTestObject('Page_Administator Login/txtpassword'), 'demoadmin')

WebUI.click(findTestObject('Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('Page_Dashboard/btnLogout'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.check(findTestObject('Page_Modules/chkBooking'))

WebUI.verifyElementChecked(findTestObject('Page_Modules/chkBooking'), 0)

WebUI.click(findTestObject('Page_Modules/btnSettings'))

WebUI.back()

url = WebUI.getUrl()

WebUI.verifyMatch(a, 'https://www.phptravels.net/admin/settings/modules/', false)

WebUI.closeBrowser()

