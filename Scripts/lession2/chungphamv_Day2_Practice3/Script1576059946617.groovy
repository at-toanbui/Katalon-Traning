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

WebUI.setText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/txt_Login'), 'chung@gmail.com')

WebUI.setText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/txt_Password'), '12345')

WebUI.click(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/btn_Login'))

WebUI.verifyElementText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/lbl_Errormessage'), 'Invalid Login Credentials')

WebUI.setText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/txt_Login'), 'admin@phptravels.com')

WebUI.setText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/txt_Password'), 'demoadmin')

WebUI.click(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/btn_Login'))

WebUI.verifyElementText(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/lbl_Logouttext'), 'Logout')

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/ ')

WebUI.verifyElementChecked(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/chk_travelselect'), 1)

WebUI.click(findTestObject('lession2/chungphamv_Day2_Practice3/Page_Administator Login (1)/btn_Settings'))

WebUI.back(FailureHandling.STOP_ON_FAILURE)

modules = WebUI.getUrl()

WebUI.verifyEqual(modules, 'https://www.phptravels.net/admin/settings/modules/')

WebUI.closeBrowser()

