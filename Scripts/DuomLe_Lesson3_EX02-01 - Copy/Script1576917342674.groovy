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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('DuomLe_Practice3_EX2-01/btnSignin'))

WebUI.waitForPageLoad(5)

String mail = CustomKeywords.'email.Emailrandom.getEmail'('duom', 'gmail.com')

WebUI.sendKeys(findTestObject('DuomLe_Practice3_EX2-01/txtEmail'), mail)

WebUI.click(findTestObject('DuomLe_Practice3_EX2-01/btnCreateAccount'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('DuomLe_Practice3_EX2-01/rdoSex'))

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtFirstname'), 'Le')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtLastname'), 'Duom')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtPassword'), 'lethi')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtAddress1'), '22 Luong ĐỊnh Của')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/btnCity2'), 'Danang')

WebUI.selectOptionByIndex(findTestObject('DuomLe_Practice3_EX2-01/ddlState'), 3)

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtPostcode'), '99501')

WebUI.selectOptionByIndex(findTestObject('DuomLe_Practice3_EX2-01/ddlCountry'), 1)

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtPhonemobile'), '0986189053')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-01/txtAlias'), 'Toi dang test')

WebUI.click(findTestObject('DuomLe_Practice3_EX2-01/btnRegister'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('DuomLe_Practice3_EX2-01/msgSuccess'), 'Welcome to your account. Here you can manage all of your personal information and orders.')

