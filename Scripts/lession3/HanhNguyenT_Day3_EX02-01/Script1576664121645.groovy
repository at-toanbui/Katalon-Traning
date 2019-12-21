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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/HomePage/btnSignIn'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/LoginPage/txtEmailAddress'), 'hanh@gmail.com')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/LoginPage/btnCreateAnAccount'))

String errorMessage = WebUI.verifyTextPresent('An account using this email address has already been registered. Please enter a valid password or request a new one.', 
    false)

if (errorMessage.equals('true')) {
    int RD

    RD = ((Math.random() * 500) as int)

    WebUI.clearText(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/LoginPage/txtEmailAddress'))

    WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/LoginPage/txtEmailAddress'), ('hanh' + RD) + '@gmail.com')

    WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/LoginPage/btnCreateAnAccount'))
} else {
    WebUI.verifyElementPresent(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/btnRegister'), 0)
}

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/chkGender'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtFirstName'), 'hanh')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtLastName'), 'nguyen')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtPassword'), '12345678')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtAddress'), 'da nang')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtCity'), 'da nang')

WebUI.selectOptionByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/cboState'), 'Alaska', false)

WebUI.verifyOptionSelectedByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/cboState'), 'Alaska', false, 
    10)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtPostcode'), '12345')

WebUI.verifyOptionSelectedByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/cboCountry'), 'United States', 
    false, 10)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/txtPhone'), '12345678')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/AuthenPage/btnRegister'))

title = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3_EX02-01/MyAccountPage/lblHeading'))

WebUI.verifyMatch(title, 'MY ACCOUNT', false)

