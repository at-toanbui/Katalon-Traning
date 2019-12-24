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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.navigateToUrl(GlobalVariable.HOME_PAGE_PRACTICE_ULR)

WebUI.click(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/btnSignIn'))

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtEmailCreate'), GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtEmailCreate'), emailRegister)

WebUI.click(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/btnCreateAccount'))

statusCreateAccount = WebUI.verifyElementPresent(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/lblErrorCreateAccount'), 
    GlobalVariable.TIMEOUT_MIN, FailureHandling.OPTIONAL)

while (statusCreateAccount) {
    emailAddress = (('lenhung.dhkt' + new Random().nextInt(1000)) + '@gmail.com')

    WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtEmailCreate'), emailAddress)

    WebUI.click(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/btnCreateAccount'))

    statusCreateAccount = WebUI.verifyElementPresent(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/lblErrorCreateAccount'), 
        GlobalVariable.TIMEOUT_MIN, FailureHandling.OPTIONAL)
}

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtCustomerFirstName'), GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/rdGender'))

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtCustomerFirstName'), 'Nhung')

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtCustomerLastName'), 'Le')

email = WebUI.getAttribute(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtEmail'), 'value')

WebUI.verifyMatch(email, emailAddress, false)

WebUI.setEncryptedText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtPassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtAddress1'), 'Da Nang')

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtCity'), 'Da Nang')

WebUI.selectOptionByValue(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/ddlState'), '1', true)

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtPostCode'), '12345')

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtPhoneNumber'), '0987654321')

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/txtAddressAlias'), 'Da Nang')

WebUI.click(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/btnRegister'))

WebUI.verifyElementVisible(findTestObject('Lesson3/Checkout/EX02-01_RegisterAccount/lblWelcomeMessage'))

