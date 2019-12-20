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

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_My Store/btnSignIn'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/txtEmailAddress'), 'hanh')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/btnCreateAnAccount'))

warningMessage = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/lblWarningMessage'))

WebUI.verifyMatch(warningMessage, 'Invalid email address.', false)

WebUI.clearText(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/txtEmailAddress'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/txtEmailAddress'), 'hanhtest4@gmail.com')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Login - My Store/btnCreateAnAccount'))

WebUI.verifyElementPresent(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/btnRegister'), 0)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/chkGender'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtFirstName'), 'hanh')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtLastName'), 'nguyen')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtPassword'), '12345678')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtAddress'), 'da nang')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtCity'), 'da nang')

WebUI.selectOptionByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/cboState'), 'Alaska', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/cboState'), 'Alaska', false, 
    10)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtPostcode'), '12345')

WebUI.verifyOptionSelectedByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/cboCountry'), 'United States', 
    false, 10)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/txtPhone'), '12345678')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_Authen/btnRegister'))

title = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/Page_MyAccount/lblHeading'))

WebUI.verifyMatch(title, 'MY ACCOUNT', false)

