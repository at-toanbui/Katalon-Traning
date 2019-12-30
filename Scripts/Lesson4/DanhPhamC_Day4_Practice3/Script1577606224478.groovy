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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.setText(findTestObject('Lesson4/DanhPhamC_Day4_Practice3/Page_Login - My Store/txtEmail'), username)

WebUI.setText(findTestObject('Lesson4/DanhPhamC_Day4_Practice2/Page_Login - My Store/txtPassword'), password)

WebUI.click(findTestObject('Lesson4/DanhPhamC_Day4_Practice3/Page_Login - My Store/btnButton'))

success = WebUI.getText(findTestObject('Lesson4/DanhPhamC_Day4_Practice3/Page_Login - My Store/lblLoginSuccess'))

WebUI.verifyMatch(success, success, false)

