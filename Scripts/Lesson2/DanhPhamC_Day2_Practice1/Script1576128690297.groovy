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

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings')

WebUI.setText(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/txtLoginEmail'), 
    'danhpc11212@gmail.com')

WebUI.setEncryptedText(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/txtLoginPassword'), 
    '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/btnLogin'))

WebUI.verifyElementVisible(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/lblInvalidLoginCredentials'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/txtLoginEmail'), 
    'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/txtLoginPassword'), 
    'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Administator Login/btnLogin'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings')

WebUI.verifyElementVisible(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Application Settings/btnAccount'))

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules')

WebUI.verifyElementChecked(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Modules/chkTravelhopeHotels'), 
    0)

WebUI.click(findTestObject('Lesson2/DanhPhamC_Day2_Practice1/Page_Modules/btnSetting'))

WebUI.back()

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.phptravels.net/admin/settings/modules', false)

WebUI.closeBrowser()

