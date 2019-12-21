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

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Add to cart/txtSearch'), 'dress')

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnSearch'))

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnItem'), 
    GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnItem'))

WebUI.waitForElementPresent(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnQuantityPlus'), GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnQuantityPlus'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/ddlSize'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/ddlSize'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnColorBlue'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnAddCart'))

totalcost = WebUI.getText(findTestObject('HungPhungK_Day3_Practice3/Add to cart/lblTotalCost'))

WebUI.verifyMatch(totalcost, '$59.96', false)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnProceedToCheckout'))

quantity = WebUI.getAttribute(findTestObject('HungPhungK_Day3_Practice3/Add to cart/txtQuantity'), 'value')

WebUI.verifyMatch(quantity, '2', false)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnProceedCheckout'))

WebUI.setText(findTestObject('HungPhungK_Day3_Practice3/Add to cart/txtEmail'), 'pepoqatest01+11@gmail.com')

WebUI.setEncryptedText(findTestObject('HungPhungK_Day3_Practice3/Add to cart/txtPassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnSignIn'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.verifyElementChecked(findTestObject('HungPhungK_Day3_Practice3/Add to cart/chkDeliverAddress'), 0)

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnProceedCheckoutt'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/chkTermOfService'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnProceedToCheckoutt'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/lnkPayByCheck'))

WebUI.click(findTestObject('HungPhungK_Day3_Practice3/Add to cart/btnConfirmMyOrder'))

completemsg = WebUI.getText(findTestObject('HungPhungK_Day3_Practice3/Add to cart/lblCompleteOrderMessage'))

WebUI.verifyMatch(completemsg, 'Your order on My Store is complete.', false)

