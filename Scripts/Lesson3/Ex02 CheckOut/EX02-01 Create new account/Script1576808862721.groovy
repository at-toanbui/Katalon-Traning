import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser(GlobalVariable.url)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_My Store/btnSignIn'))

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtEmail'), 'phan.nguyen@asiantech.vn')

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/btnCreateAnAccount'))

String msg1 = WebUI.verifyElementVisible(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/msgAlreadyExist'))

String msg2 = WebUI.verifyElementVisible(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/msgInvalidEmail'))

//random mail generator
String mail = ('Phan.Nguyen.' + RandomStringUtils.randomAlphanumeric(5)) + '@gmail.com'
if (msg1.equals('false')) {
    
	WebUI.comment('User Registration Successful')
	
} else {
	WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtEmail'), 'This is a invalid email')
	WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/btnCreateAnAccount'))
    }

if (msg2.equals('false')) {
    
	WebUI.comment('User Registration Successful')
	
} else {
	WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtEmail'), mail)
	WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/btnCreateAnAccount'))
    }

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtCustomerFirstName'), 
    'Phan')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtCustomerLastName'), 
    'Nguyen')

WebUI.setEncryptedText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtPassword'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtFirstName'), 'Phan')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtLastname'), 'Nguyen')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtAddress'), 'Da Nang')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtCity'), 'Da Nang')

WebUI.selectOptionByValue(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/ddlStage'), 
    '11', true)

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtPostCode'), '96719')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtPhoneNumber'), '0986599341')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtAdressAlias'), 'Da Nang')

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/btnRegister'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'My account - My Store', false)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_My account - My Store/btnSignOut'))

