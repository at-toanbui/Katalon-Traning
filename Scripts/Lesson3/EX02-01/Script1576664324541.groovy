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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.waitForPageLoad(GlobalVariable.Timeout)

WebUI.click(findTestObject('Lesson3/Page_My Store/btnSignIn'))

Random random = new Random()

String randomEmail = ('phucautmation' + random.nextInt(999999)) + '@gmail.com'

emailSystem = randomEmail

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtEmail1'), emailSystem)

WebUI.click(findTestObject('Lesson3/Page_Login - My Store/btnCreateAnAccount'))

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtFirstname'), 'Phuc')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtLastname'), 'Phan')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtPasswd'), 'zxzxzx123')

WebUI.setText(findTestObject('Lesson3/Page_Login - My Store/txtfirstname2'), 'Phuc')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtLastname2'), 'Phan')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtAddress1'), '52 Nguyen do cung')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtcCity'), 'Da Nang')

WebUI.selectOptionByIndex(findTestObject('Lesson3/Page_Login - My Store/ddlState'), 1)

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtPostcode'), '12000')

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtMobilePhone'), '0123456789')

WebUI.clearText(findTestObject('Lesson3/Page_Login - My Store/txtEmail2'))

WebUI.sendKeys(findTestObject('Lesson3/Page_Login - My Store/txtEmail2'), '20 Thai Thi Boi')

WebUI.click(findTestObject('Lesson3/Page_Login - My Store/btnRegister'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

title = WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(title, 'My account - My Store', true)

WebUI.closeBrowser()

