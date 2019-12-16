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

WebUI.navigateToUrl('https://tus.io/demo.html')

currentUsersDir = System.getProperty('user.dir')

WebUI.uploadFile(findTestObject('Lesson2/Practice2/Upload/btnChooseFile'), currentUsersDir + '/ImageTest/imageTest.jpg')

WebUI.waitForElementVisible(findTestObject('Lesson2/Practice2/Upload/lnkUploadSuccessful'), GlobalVariable.TIMEOUT)

WebUI.scrollToElement(findTestObject('Lesson2/Practice2/Upload/lnkUploadSuccessful'), GlobalVariable.TIMEOUT)

WebUI.verifyElementText(findTestObject('Lesson2/Practice2/Upload/lnkUploadSuccessful'), 'DOWNLOAD IMAGETEST.JPG (80581 BYTES)')

