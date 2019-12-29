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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.setText(findTestObject('Lesson 4/Page_Login - My Store/txt_email'), email)

WebUI.setText(findTestObject('Lesson 4/Page_Login - My Store/txt_password'), password)

WebUI.click(findTestObject('Lesson 4/Page_Login - My Store/btn_Sign in'))

text = WebUI.getText(findTestObject('Lesson 4/Page_My account - My Store/txt_login success'))

WebUI.verifyElementText(findTestObject('Lesson 4/Page_My account - My Store/txt_login success'), 'Welcome to your account. Here you can manage all of your personal information and orders.')

WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.\n\n', 
    false)

