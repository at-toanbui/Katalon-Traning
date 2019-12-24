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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Lesson 3/Ex02_02/Page_My Store/txt_Search'), 'Dress')

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_My Store/btn_Search'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Search - My Store/img_item1'))

WebUI.waitForElementVisible(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/txt_Quanity'), 5)

WebUI.setText(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/txt_Quanity'), '3')

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/ddl_SizeSSML'))

WebUI.selectOptionByValue(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/ddl_SizeSSML'), '2', true)

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/lbl_Color'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/btn_Add to cart'))

TotalCost = WebUI.getText(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/txt_Totalcost_value'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Printed Summer Dress - My Store/btn_Proceed to checkout_1'))

quantity = WebUI.getText(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/txt_Total_Current_Cost'))

WebUI.verifyEqual(quantity, '3')

TotalCurrentCost = WebUI.getText(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/txt_Total_Current_Cost'))

WebUI.verifyEqual(TotalCost, TotalCurrentCost)

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/btn_Proceed to checkout_2'))

WebUI.setText(findTestObject('Lesson 3/Ex02_02/Page_Login - My Store/txt_Email address_email'), 'thinhnguyen4@gmail.com')

WebUI.setText(findTestObject('Lesson 3/Ex02_02/Page_Login - My Store/txt_Password_passwd'), 'abcd1234')

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Login - My Store/btn_Sign in'))

WebUI.check(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/chk_usedelivery'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/btn_Proceed to checkout_3'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/btn_ToS'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/btn_Proceed to checkout_4'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_Order - My Store/btn_Pay by check'))

WebUI.click(findTestObject('Lesson 3/Ex02_02/Page_My Store/btn_I confirm my order'))

message = WebUI.getText(findTestObject('Lesson 3/Ex02_02/Page_Order confirmation - My Store/txt_Your order on My Store is complete'))

WebUI.verifyEqual(message, 'Your order on My Store is complete.')

