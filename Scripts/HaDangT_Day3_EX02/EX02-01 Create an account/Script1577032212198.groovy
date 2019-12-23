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

WebUI.navigateToUrl(GlobalVariable.urlPractice1)

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_My Store/btnSignIn'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/btnCreateAccount'), 0)

def email1 = org.apache.commons.lang.RandomStringUtils.randomNumeric(3)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtEmail1'), ('dangha' + email1 + '@gmail.com'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/btnCreateAccount'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/lblCreateAccount'), 0)

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/rdoGender'))

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtFirstName1'), 'Dang')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtLastName1'), 'Ha')

email2 = WebUI.getAttribute(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtEmail2'), 'value')

WebUI.verifyMatch(email2, ('dangha' + email1) + '@gmail.com', true)

WebUI.setEncryptedText(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtPassword'), '8LU4z8lHbHHzl7xjkfWa7A==')

WebUI.selectOptionByValue(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/ddlDay'), '14', true)

WebUI.selectOptionByValue(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/ddlMonth'), '4', true)

WebUI.selectOptionByValue(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/ddlYear'), '1995', true)

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/chkNewsletter'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/chkSignUpForNewsletter'))

WebUI.clearText(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtFirstName2'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtFirstName2'), 'Dang')

WebUI.clearText(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtLastName2'))

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtLastName2'), 'Ha')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtCompany'), 'Asian Tech')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtAddress1'), 'An Hai Bac')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtAddress2'), 'Son Tra')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtCity'), 'Da Nang')

WebUI.selectOptionByValue(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/ddlState'), '11', true)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtPostalCode'), '00000')

WebUI.verifyOptionSelectedByLabel(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/ddlCountry'), 'United States', 
    true, 10)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txaAdditionalInformation'), 'abc')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtHomePhone'), '09011112222')

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtMobilePhone'), '03724656789')

WebUI.clearText(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtAlias'))

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/txtAlias'), 'Da Nang')

WebUI.click(findTestObject('HaDangT_Day3_EX02-01/Page_Login - My Store/btnRegister'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-01/Page_My account - My Store/lblCreateAccountSuccess'), 0)

lblCreateAccountSuccess = WebUI.getText(findTestObject('HaDangT_Day3_EX02-01/Page_My account - My Store/lblCreateAccountSuccess'))

WebUI.verifyMatch(lblCreateAccountSuccess, '.*Welcome to your account.*', true)

