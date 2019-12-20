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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Home/txtSearch'), Keys.chord('Dress', Keys.ENTER))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_SearchResult/lstItem'))

WebUI.clearText(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ItemDetail/txtQuantity'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ItemDetail/txtQuantity'), '2')

WebUI.selectOptionByLabel(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ItemDetail/lstSize'), 'S', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ItemDetail/lblBule'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ItemDetail/btnAddToCart'))

totalCost = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ProductSuccessfully/lblTotalCost'))

WebUI.verifyMatch(totalCost, '$59.96', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Frame_ProductSuccessfully/btnProceedCheckout'))

size = WebUI.getAttribute(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_ShoppingCartSummary/lblQty'), 'value')

WebUI.verifyMatch(size, '2', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_ShoppingCartSummary/btnProceedToCheckout'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_SignIn/txtEmail'), 'hanhtest2@gmail.com')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_SignIn/txtPassword'), '12345678')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_SignIn/btnSignIn'))

//if (WebUI.verifyElementChecked(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Address/chkUseDeliverAddress'), 0)) {
//    WebUI.click('lession3/HanhNguyenT_Day3_EX02-02/Page_Address/btnProceedToCheckout')
//}
'step11'
WebUI.verifyElementChecked(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Address/chkUseDeliverAddress'), 0)

'step12'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Address/btnProceedToCheckOut'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Shipping/chkAgreeTermOfSevice'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_Shipping/btnProceedToCheckOut'))

'step15'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_ChoosePaymentMethod/lblPayByCheck'))

'step16'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_OderSummary/btnConfirmOrder'))

completeMessage = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3_EX02-02/Page_OrderConfirm/lblCompleteMessage'))

WebUI.verifyMatch(completeMessage, 'Your order on My Store is complete.', false)

