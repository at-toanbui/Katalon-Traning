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

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-02/txt_Search'), 'Dress')

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_Search'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_Item'))

WebUI.waitForElementVisible(findTestObject('lesson3/chungphamv_Day3_EX02-02/txt_Quantity'), 5)

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-02/txt_Quantity'), '2')

WebUI.selectOptionByValue(findTestObject('lesson3/chungphamv_Day3_EX02-02/ddl_Size'), '1', false)

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/mnu_Color'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_AddtoCart'))

cost = WebUI.getText(findTestObject('lesson3/chungphamv_Day3_EX02-02/lbl_TotalCost'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_Checkout'))

quantity = WebUI.getAttribute(findTestObject('lesson3/chungphamv_Day3_EX02-02/txt_QuantityCheck'), 'value')

WebUI.verifyEqual(quantity, '2')

cost2 = WebUI.getText(findTestObject('lesson3/chungphamv_Day3_EX02-02/lbl_TotalPrice'))

WebUI.verifyEqual(cost, cost2)

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_ProcessCheckout'))

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-02/Login/txt_Email'), 'chung@yopmail.com')

WebUI.setText(findTestObject('lesson3/chungphamv_Day3_EX02-02/Login/txt_Password'), 'abcd1234')

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/Login/txt_SignIn'))

WebUI.check(findTestObject('lesson3/chungphamv_Day3_EX02-02/chk_Usedelivery'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_ProcessAddress'))

WebUI.check(findTestObject('lesson3/chungphamv_Day3_EX02-02/chk_ToS'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_ProccessCarrier'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_PaybyCheck'))

WebUI.click(findTestObject('lesson3/chungphamv_Day3_EX02-02/btn_Confirm'))

mess = WebUI.getText(findTestObject('lesson3/chungphamv_Day3_EX02-02/lbl_Success'))

WebUI.verifyEqual(mess, 'Your order on My Store is complete.')

