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

//WebUI.click(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnChooseFile'))
//WebUI.maximizeWindow()
//WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnChooseFile'), '//Users//mba0059//testing.jpg')
//WebUI.getAttribute(findTestObject(null), '')
String currentDirectory = System.getProperty('user.dir')

//WebUI.sendKeys(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnChooseFile'), currentDirectory + '/Data Files/Image Test/testing.jpg')
WebUI.uploadFile(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnChooseFile'), currentDirectory + '/Data Files/Image Test/testing.jpg')

//WebUI.uploadFile(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnChooseFile'), '//Users//mba0059//testing.jpg')
imagename = WebUI.getText(findTestObject('HoaTranTT_Day2/Practice2/EX11/btnSuccess'))

imgname = 'DOWNLOAD TESTING.JPG (130375 BYTES)'

Thread.sleep(2000)

WebUI.verifyMatch(imagename, imgname, false)

