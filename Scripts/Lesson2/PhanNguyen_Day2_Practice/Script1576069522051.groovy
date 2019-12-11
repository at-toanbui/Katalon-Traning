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

WebUI.openBrowser('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('Lesson2/Practice/Page_Administator Login/txtEmail'), 'phannguyen')

WebUI.setText(findTestObject('Lesson2/Practice/Page_Administator Login/txtPassword'), '123')

WebUI.click(findTestObject('Lesson2/Practice/Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('Lesson2/Practice/Page_Administator Login/msgErrorLogin'))

WebUI.setText(findTestObject('Lesson2/Practice/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.setText(findTestObject('Lesson2/Practice/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('Lesson2/Practice/Page_Administator Login/btnLogin'))

WebUI.delay(4)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Dashboard', false)

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.verifyElementChecked(findTestObject('Lesson2/Practice/Page_Modules/chkTravelshopeHotels'), 2)

WebUI.click(findTestObject('Lesson2/Practice/Page_Modules/btnSettings'))

WebUI.back()

WebUI.delay(3)

url = WebUI.getUrl(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(url, 'https://www.phptravels.net/admin/settings/modules/', false)

WebUI.closeBrowser()

