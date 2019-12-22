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

WebUI.navigateToUrl(GlobalVariable.url3)

WebUI.click(findTestObject('Lesson 3/Ex02_01/Page_My Store/btn_Sign in'))

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt_Email address_email_create'), 'thinhnguyenhuy@gmail.com')

WebUI.click(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/btn_Create an account'))

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__customer_firstname'), 'Thinh')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__customer_lastname'), 'Nguyen Huy')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt_email'), 'thinh.nguyen44444@gmail.com')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__passwd'), 'abcd1234')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__firstname'), 'thinh')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__lastname'), 'nguyenhuy')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__address1'), 'abcdefg')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__city'), 'danang')

WebUI.selectOptionByValue(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/ddl_state'), '32', true)

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__postcode'), '12345')

WebUI.click(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/ddl_Country'))

WebUI.selectOptionByValue(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/ddl_Country'), '21', false)

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__phone_mobile'), '12343546789')

WebUI.setText(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/txt__alias'), 'danang')

WebUI.click(findTestObject('Lesson 3/Ex02_01/Page_Login - My Store/btn_Register'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'http://automationpractice.com/index.php?controller=my-account')

