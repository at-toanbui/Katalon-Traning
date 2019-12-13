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

WebUI.sendKeys(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtEmail'), 'hanh@gmaik.com')

WebUI.sendKeys(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtPassword'), '123456')

WebUI.click(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/btnLogin'))

errorMessage = WebUI.getText(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/errorMessage'))

WebUI.verifyMatch(errorMessage, 'Invalid Login Credentials', false)

WebUI.clearText(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtEmail'))

WebUI.sendKeys(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtPassword'))

WebUI.sendKeys(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Administator Login/btnLogin'))

WebUI.verifyElementPresent(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Dashboard/lnLogout'), 0)

WebUI.click(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_TravelhopeHotels Settings/lnModules'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/ ')

WebUI.verifyElementNotChecked(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Modules/chkTravelhopeHotels'), 10)

WebUI.click(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_Modules/btnSettings'))

WebUI.click(findTestObject('HanhNguyenT_Day2_PracticeAtClass/Page_TravelhopeHotels Settings/lnModules'))

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.phptravels.net/admin/settings/modules/', false)

