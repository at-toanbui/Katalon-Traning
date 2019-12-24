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
import java.util.Random as Random
import java.util.HashMap as HashMap

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Lesson3/Practice1/HomePage/btnLoginHeader'))

int num = 10000

HashMap<Integer, String> inputEmail = new HashMap<Integer, String>()

while (true) {
    String email = ('ngan.tran' + new Random().nextInt(num)) + '@asiantech.vn'

    WebUI.setText(findTestObject('Lesson3/Practice1/LoginPage/txtEmailCreate'), email, FailureHandling.STOP_ON_FAILURE)

    inputEmail.put(1, email)

    WebUI.click(findTestObject('Lesson3/Practice1/LoginPage/btnRegister'))

    if (WebUI.verifyElementPresent(findTestObject('Lesson3/Practice1/LoginPage/lblMsgExistEmail'), 5, FailureHandling.OPTIONAL) == 
    false) {
        break
    }
}

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtFirstName'), firstName)

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtLastName'), lastName)

displayedEmail = WebUI.getAttribute(findTestObject('Lesson3/Practice1/RegisterPage/txtEmail'), 'value')

WebUI.verifyMatch(displayedEmail, inputEmail.get(1), false)

WebUI.setEncryptedText(findTestObject('Lesson3/Practice1/RegisterPage/txtPassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

firstName1 = WebUI.getAttribute(findTestObject('Lesson3/Practice1/RegisterPage/txtAddFirstName'), 'value')

WebUI.verifyMatch(firstName1, firstName, false)

lastName1 = WebUI.getAttribute(findTestObject('Lesson3/Practice1/RegisterPage/txtAddLastName'), 'value')

WebUI.verifyMatch(lastName1, lastName, false)

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtAddress'), '123 ABC')

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtCity'), 'Da Nang')

WebUI.selectOptionByLabel(findTestObject('Lesson3/Practice1/RegisterPage/ddlState'), 'Ohio', false)

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtPostalCode'), '12345')

WebUI.selectOptionByLabel(findTestObject('Lesson3/Practice1/RegisterPage/ddlCountry'), 'United States', false)

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtPhone'), '0123456789')

WebUI.setText(findTestObject('Lesson3/Practice1/RegisterPage/txtAddressAlias'), 'Da Nang')

WebUI.click(findTestObject('Lesson3/Practice1/RegisterPage/btnRegister'))

WebUI.waitForElementPresent(findTestObject('Lesson3/Practice1/MyAccountPage/btnLogOut'), 5)

