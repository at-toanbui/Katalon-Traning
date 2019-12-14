import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('VyVoH_Day2_Practice1/Page_Login/txtLogin'), 'aaa@gmail.com')

WebUI.setText(findTestObject('VyVoH_Day2_Practice1/Page_Login/txtPassword'), 'aaa')

WebUI.click(findTestObject('VyVoH_Day2_Practice1/Page_Login/btnLogin'))

WebUI.waitForElementVisible(findTestObject('VyVoH_Day2_Practice1/Page_Login/lblMsg'), 30)

WebUI.verifyElementText(findTestObject('VyVoH_Day2_Practice1/Page_Login/lblMsg'), 'Invalid Login Credentials', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('VyVoH_Day2_Practice1/Page_Login/txtLogin'), 'admin@phptravels.com')

WebUI.setText(findTestObject('VyVoH_Day2_Practice1/Page_Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('VyVoH_Day2_Practice1/Page_Login/btnLogin'))

WebUI.waitForElementVisible(findTestObject('VyVoH_Day2_Practice1/Page_Dashboard/txtTodaysBooking3'), 60)

WebUI.verifyElementText(findTestObject('VyVoH_Day2_Practice1/Page_Dashboard/txtTodaysBooking3'), 'Today\'s Booking 3')

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

WebUI.check(findTestObject('VyVoH_Day2_Practice1/Page_Modules/chkTravelhopeHotels'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('VyVoH_Day2_Practice1/Page_Modules/chkTravelhopeHotels'), 10)

WebUI.click(findTestObject('VyVoH_Day2_Practice1/Page_Modules/btnSettings'))

WebUI.click(findTestObject('VyVoH_Day2_Practice1/Page_Modules/btnModules'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.phptravels.net/admin/settings/modules/', false)

WebUI.closeBrowser()

