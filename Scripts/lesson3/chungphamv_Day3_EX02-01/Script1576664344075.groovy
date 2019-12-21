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

WebUI.navigateToUrl(GlobalVariable.url_EX02)

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-01/btn_Signin'))

/// just change the number
int randomNo = ((Math.random() * 100000) as int)

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Email'), ('chung' + randomNo) + '@yopmail.com')

WebUI.submit(findTestObject('lesson3/chungphamv_Day3_EX02-01/btn_CreateAcc'))

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_FirstName'), 'Chung')

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Lastname'), 'Pham')

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Password'), 'abcd1234')

//WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_email_add'), '')
//WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_FirstName_Add'), 'Chung')
//WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Lastname_Add'), 'Pham')
WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Address'), 'AsianTech, AN DON INDUSTRIAL ZONE,STR 3,VNPT BUILDING,LEVEL 6')

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_City'), 'Da Nag')

WebUI.selectOptionByValue(findTestObject('lesson3/chungphamv_Day3_EX02-01/ddl_State'), '32', true)

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_PostCode'), '10001')

WebUI.selectOptionByValue(findTestObject('lesson3/chungphamv_Day3_EX02-01/ddl_Country'), '21', true)

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-01/txt_Phone'), '0987654321')

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-01/btn_Register'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'http://automationpractice.com/index.php?controller=my-account')

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-01/btn_SignOut'))

