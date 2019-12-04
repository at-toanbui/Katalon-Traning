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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Travel/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))

WebUI.click(findTestObject('Object Repository/Travel/Page_PHPTRAVELS  Travel Technology Partner/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Travel/Page_Register/input_First Name_firstname'), 'PHAN')

WebUI.setText(findTestObject('Object Repository/Travel/Page_Register/input_Last Name_lastname'), 'NGUYEN')

WebUI.setText(findTestObject('Object Repository/Travel/Page_Register/input_Mobile Number_phone'), '0986543332')

WebUI.setText(findTestObject('Object Repository/Travel/Page_Register/input_Email_email'), 'Phannguyen@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Travel/Page_Register/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Travel/Page_Register/input_Confirm Password_confirmpassword'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Travel/Page_Register/button_Sign Up'))

WebUI.closeBrowser()

