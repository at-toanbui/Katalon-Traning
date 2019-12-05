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

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('null'), 'admin@phptravels.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'orSGNCvhf+w8SKCExcig5g==')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'YourCompany')

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'YourCompany')

WebUI.setText(findTestObject('null'), 'yourcompany.com')

WebUI.setText(findTestObject('null'), 'asiantech1234')

WebUI.setText(findTestObject('null'), 'All Rights Reserved by YourCompany')

WebUI.selectOptionByValue(findTestObject('null'), 
    'm/d/Y', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'vi', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'Yes', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'Yes', true)

WebUI.setText(findTestObject('null'), 
    '9')

WebUI.selectOptionByValue(findTestObject('null'), 
    'numeric', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    'alnum', true)

WebUI.setText(findTestObject('null'), 
    '8')

WebUI.selectOptionByValue(findTestObject('null'), 
    '1', true)

WebUI.setText(findTestObject('null'), 
    'This is the offline message')

WebUI.setText(findTestObject('null'), 'YourCompany | The Future')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'This is my default keywords')

WebUI.setText(findTestObject('null'), 
    'This is my default description')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'http://endpoint-s3.api.awsamazon.com')

WebUI.setText(findTestObject('null'), 
    'Tracking & Analytics code')

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('null'), 
    '0', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

