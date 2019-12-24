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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_My Store/btnSignIn'))

int random = ((Math.random() * 500) as int)

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtEmail'), 
    ('danhpc11212+' + random) + '@gmail.com')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/btnCreateAccount'))

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtFirstName'), 
    'Danh')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtLastName'), 
    'Pham')

WebUI.setEncryptedText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtPassword'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtCompany'), 
    'Asiantech')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtAddress1'), 
    '313 Da nang')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtAddress2'), 
    '742 Le Duan')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtCity'), 
    'Da Nang')

WebUI.selectOptionByValue(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/ddlState'), 
    '5', true)

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtPostalCode'), 
    '90002')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txaAdditionalInfo'), 
    'Abcd1234')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtPhoneNumber'), 
    '+84612282742')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/txtAlias'), 
    '29352 Hazel Bell Dr')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-01/Page_Login - My Store/btnRegister'))

urlsuccess = WebUI.getUrl()

WebUI.verifyMatch(urlsuccess, 'http://automationpractice.com/index.php?controller=my-account', false)

WebUI.closeBrowser()

