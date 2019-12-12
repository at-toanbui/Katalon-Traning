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

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice1/txtEmail'), 'email@domain.com')

WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice1/txtPassword'), 'ThanhHoa12!@')

WebUI.click(findTestObject('HoaTranTT_Day2/Practice1/btnLogin'))

WebUI.verifyElementText(findTestObject('HoaTranTT_Day2/Practice1/lblErrorMessage'), 'Invalid Login Credentials')

WebUI.clearText(findTestObject('HoaTranTT_Day2/Practice1/txtEmail'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice1/txtEmail'), 'admin@phptravels.com')

WebUI.clearText(findTestObject('HoaTranTT_Day2/Practice1/txtPassword'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice1/txtPassword'), 'demoadmin')

WebUI.click(findTestObject('HoaTranTT_Day2/Practice1/btnLogin'))

Thread.sleep(3000)

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Dashboard', false)

WebUI.navigateToUrl('https://www.phptravels.net/admin/settings/modules/')

Thread.sleep(3000)

WebUI.verifyElementChecked(findTestObject('HoaTranTT_Day2/Practice1/chkTravelhope'), 0)

WebUI.click(findTestObject('HoaTranTT_Day2/Practice1/btnSettings'))

WebUI.back()

url = WebUI.getUrl()

WebUI.verifyMatch(url, 'https://www.phptravels.net/admin/settings/modules/', false)

