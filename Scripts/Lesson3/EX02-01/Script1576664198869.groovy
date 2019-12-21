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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_Login - My Store/btnSignin'))

WebUI.setText(findTestObject('Page_Login - My Store/txtEmailcreate'), 'thai2@gmail.com')

WebUI.click(findTestObject('Page_Login - My Store/btnCreateAccount'))

WebUI.click(findTestObject('Page_Login - My Store/chkMr'))

WebUI.setText(findTestObject('Page_Login - My Store/txtFirstname1'), 'Le')

WebUI.setText(findTestObject('Page_Login - My Store/txtLastname'), 'Thai')

WebUI.setText(findTestObject('Page_Login - My Store/txtEmail'), 'minhthai@gmail.com')

WebUI.setText(findTestObject('Page_Login - My Store/txtPasswd'), '123456')

WebUI.setText(findTestObject('Page_Login - My Store/txtFirstname2'), 'Minh')

WebUI.setText(findTestObject('Page_Login - My Store/txtLastname2'), 'Thai')

WebUI.setText(findTestObject('Page_Login - My Store/txtaAddress1'), 'Nguyen Van Linh, Hai Chau')

WebUI.setText(findTestObject('Page_Login - My Store/txtCity'), 'Da Nang')

WebUI.selectOptionByLabel(findTestObject('Page_Login - My Store/ddlState'), 'Hawaii', false)

WebUI.setText(findTestObject('Page_Login - My Store/txtPostcode'), '96719')

WebUI.selectOptionByLabel(findTestObject('Page_Login - My Store/ddlCountry'), 'United States', false)

WebUI.setText(findTestObject('Page_Login - My Store/txtPhone'), '0123456789')

WebUI.setText(findTestObject('Page_Login - My Store/txtEmailAlias'), 'thaile@gmail.com')

WebUI.click(findTestObject('Page_Login - My Store/btnRegister'))

WebUI.verifyElementPresent(findTestObject('Page_Login - My Store/btnHome'), 20)

WebUI.closeBrowser()

