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
import java.util.Random as Random

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Create account/lnkSignIn'))

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/Create account/txtEmail'), 15)

Random randomNum = new Random()

int randomInt = randomNum.nextInt(99999)

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtEmail'), (('pepoqatest01' + '+') + randomInt) + 
    '@gmail.com')

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Create account/btnCreateAccount'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Create account/rdoGender'))

//String errorMessage = WebUI.verifyTextPresent('An account using this email address has already been registered. Please enter a valid password or request a new one.',
//	false)
//if (errorMessage.equals('true')) {
//
//WebUI.clearText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtEmail'))
//
//WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtEmail'), 
//    (('pepoqatest01' + '+') + randomInt) + '@gmail.com')
//
//WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Create account/btnCreateAccount'))
//} else {
//	WebUI.verifyElementPresent(findTestObject('HungPhungK_Day3_Practice3/Create account/btnRegister'), 0)
//}
WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtFirstName'), 'Marshall')

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtLastName'), 'Luther King')

WebUI.setEncryptedText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtPassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtAddress1'), '1234 abcdmnothtn')

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtCity'), 'California')

WebUI.selectOptionByValue(findTestObject('HungPhungK_Day3_Practice3/Create account/ddlState'), '5', true)

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtPostcode'), '55000')

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtPhoneMobile'), '0988827737')

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Create account/txtAlias'), 'My address is here')

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Create account/btnRegister'))

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/Create account/msgWelcome'), GlobalVariable.TIMEOUT)

WebUI.closeBrowser()

