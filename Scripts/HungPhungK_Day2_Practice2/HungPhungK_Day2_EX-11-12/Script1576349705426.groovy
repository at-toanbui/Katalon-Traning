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

WebUI.navigateToUrl('https://tus.io/demo.html')

String currentFilePath = System.getProperty('user.dir')

WebUI.uploadFile(findTestObject('HungPhungK_Day2_Practice2/btnChooseFile'), currentFilePath + '/Include/DataTest/123.jpeg')

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day2_Practice2/lnkDownload'), 15)

FileName = WebUI.getAttribute(findTestObject('HungPhungK_Day2_Practice2/lnkDownload'), 'class')

WebUI.verifyMatch(FileName, 'button primary', true, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://cms.demo.katalon.com/')

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day2_Practice2/txtSearch'), 15)

placeholder = WebUI.getAttribute(findTestObject('HungPhungK_Day2_Practice2/txtSearch'), 'placeholder')

WebUI.verifyMatch(placeholder, 'Type to search', true)

