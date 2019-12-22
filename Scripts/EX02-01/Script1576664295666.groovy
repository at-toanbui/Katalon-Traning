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

WebUI.navigateToUrl(GlobalVariable.URLEX0201)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('EX02-01/Page_Home/btnSignIn'))

WebUI.setText(findTestObject('EX02-01/Page_Authentication/txtEmailAddress'), 'vy.vo7@asiantech.vn')

WebUI.click(findTestObject('EX02-01/Page_Authentication/btnCreateAnAccount'))

String Ms = WebUI.verifyTextPresent("An account using this email address has already been registered. Please enter a valid password or request a new one.", false)

if (Ms.equals("true")) {
	
	int RN;
	RN= (int)(Math.random()*500)
	WebUI.setText(findTestObject('EX02-01/Page_Authentication/txtEmailAddress'),'vy.vo'+RN+'@asiantech.vn')
	WebUI.click(findTestObject('EX02-01/Page_Authentication/btnCreateAnAccount'))
}

else WebUI.verifyElementText(findTestObject('lblCreateAnAccount'), 'CREATE AN ACCOUNT')

WebUI.click(findTestObject('EX02-01/Page_Login - My Store/rdoMrs'))

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtFirstname'), 'Vy')

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtLastname'), 'Vo')

WebUI.setEncryptedText(findTestObject('EX02-01/Page_Login - My Store/txtPassword'), 'ZYp/DRkuAyAv21WF/9YITQ==')

WebUI.selectOptionByValue(findTestObject('EX02-01/Page_Login - My Store/ddlDay'), '5', true)

WebUI.selectOptionByValue(findTestObject('EX02-01/Page_Login - My Store/ddlMonth'), '6', true)

WebUI.selectOptionByValue(findTestObject('EX02-01/Page_Login - My Store/ddlYear'), '1990', true)

WebUI.click(findTestObject('EX02-01/Page_Login - My Store/chkSignUpForOurNewsletter'))

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtAddress'), '46 Hoang Van Thai')

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtCity'), 'Da Nang')

WebUI.selectOptionByValue(findTestObject('EX02-01/Page_Login - My Store/ddlState'), '5', true)

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtPostcode'), '12345')

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtPhoneMobile'), '0123456789')

WebUI.setText(findTestObject('EX02-01/Page_Login - My Store/txtAlias'), 'https://kenh14.vn')

WebUI.click(findTestObject('EX02-01/Page_Login - My Store/btnRegister'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.verifyElementText(findTestObject('EX02-01/Page_Home/lblText'), 'Vy Vo')

