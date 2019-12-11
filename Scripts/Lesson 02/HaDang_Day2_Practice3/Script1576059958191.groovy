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

WebUI.sendKeys(findTestObject('KatalonPractice3/Page_Administator Login/txtEmail'), 'hadang@gmail.com')

WebUI.sendKeys(findTestObject('KatalonPractice3/Page_Administator Login/txtPassword'), '1234')

WebUI.click(findTestObject('KatalonPractice3/Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('KatalonPractice3/Page_Administator Login/lblError'))

WebUI.clearText(findTestObject('KatalonPractice3/Page_Administator Login/txtEmail'))

WebUI.sendKeys(findTestObject('KatalonPractice3/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('KatalonPractice3/Page_Administator Login/txtPassword'))

WebUI.sendKeys(findTestObject('KatalonPractice3/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('KatalonPractice3/Page_Administator Login/btnLogin'))

WebUI.waitForElementVisible(findTestObject('KatalonPractice3/Page_Dashboard/btnLogout'), 0)

WebUI.verifyElementVisible(findTestObject('KatalonPractice3/Page_Dashboard/btnLogout'))

WebUI.click(findTestObject('KatalonPractice3/Page_Dashboard/btnModules'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.verifyElementChecked(findTestObject('KatalonPractice3/Page_Modules/chkTravelhopeHotels'), 0)

WebUI.click(findTestObject('KatalonPractice3/Page_Modules/btnSettings'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/thhotels/settings/')

WebUI.back(FailureHandling.CONTINUE_ON_FAILURE)

currentURL = WebUI.getUrl()

WebUI.verifyMatch(currentURL, 'https://www.phptravels.net/admin/settings/modules/', true)

WebUI.closeBrowser()

