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

WebUI.navigateToUrl(GlobalVariable.urlLogin)

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/txtEmailLogin'), email)

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/txtPasswordLogin'), password)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/btnSignIn'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.verifyElementText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/lblErrorMsg'), errorMsg)

