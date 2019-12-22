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
import com.kms.katalon.core.annotation.Keyword as Keyword

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_My Store/btnSignIn'))

//random mail generator
String mail = CustomKeywords.'com.question.RandomEmail.getEmail'('test', 'gmail.com')

WebUI.sendKeys(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtEmail'), mail)

//WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/txtEmail'), 'phan.nguyen+6@asiantech.vn')
WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_Login - My Store/btnCreateAnAccount'))

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

WebUI.verifyMatch(title, '.*My account - My Store.*', true)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-01 Create new account/Page_My account - My Store/btnSignOut'))

