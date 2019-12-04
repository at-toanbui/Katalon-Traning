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

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/body_iframe srchttpswwwgoogletagmanagercomn_c3ac7e'))

WebUI.setText(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/input__select2-input select2-focused'), 
    'Da nang')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/body_iframe srchttpswwwgoogletagmanagercomn_c3ac7e_1'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/input_Check in_checkin'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/div_5'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/div_5'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/input_(12-75)_adults'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/input_(2-12)_children'))

WebUI.doubleClick(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/input_(2-12)_children'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/button_'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology Partner/button_Search'))

WebUI.closeBrowser()

