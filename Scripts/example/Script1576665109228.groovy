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

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/a_Sign in'))

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/Create account/input_Email address_email_create'), 
    15)

Random randomNum = new Random()

int randomInt = randomNum.nextInt(99999)

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input_Email address_email_create'), 
    (('pepoqatest01' + '+') + randomInt) + '@gmail.com')

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/span_Create an account'))

if (WebUI.verifyElementPresent(findTestObject('HungPhungK_Day3_Practice3/Create account/div_An account using this email address has already been registered Please enter a valid password or request a new one') == 
        false)) 
     {
	WebUI.verifyElementPresent(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__customer_firstname'), 15)
     }
else { 
	WebUI.clearText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input_Email address_email_create'))
	
	WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input_Email address_email_create'),('pepoqatest01' + randomInt) + '@gmail.com')
	
	WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/span_Create an account'))
}

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__customer_firstname'), 'Marshall')

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__customer_lastname'), 'Luther King')

WebUI.setEncryptedText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__passwd'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__firstname'))

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__address1'), '1234 abcdmnothtn')

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__city'), 'California')

WebUI.selectOptionByValue(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__postcode'), '55000')

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__phone_mobile'), '0988827737')

WebUI.setText(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/input__alias'), 'My address is here')

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/button_Register'))

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/p_Welcome to your account Here you can mana_6f767b'))

WebUI.click(findTestObject('Object Repository/HungPhungK_Day3_Practice3/Create account/h1_My account'))

WebUI.closeBrowser()

