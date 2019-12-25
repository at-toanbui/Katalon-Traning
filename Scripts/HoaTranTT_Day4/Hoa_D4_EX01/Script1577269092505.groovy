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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtLoginEmail'), username)

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtLoginPassword'), password)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnLogin'))

WebUI.waitForElementPresent(findTestObject('HoaTranTT_Day4/lblErrorMessage'), 2)

WebUI.verifyElementText(findTestObject('HoaTranTT_Day4/lblErrorMessage'), errorMessage)

