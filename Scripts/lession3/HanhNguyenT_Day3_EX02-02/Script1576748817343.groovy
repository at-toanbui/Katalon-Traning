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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3/HomePage/txtSearch'), Keys.chord('Dress', Keys.ENTER))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/SearchResultPage/lblFirstItem'))

WebUI.clearText(findTestObject('lession3/HanhNguyenT_Day3/ItemDetailFrame/txtQuantity'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3/ItemDetailFrame/txtQuantity'), '2')

WebUI.selectOptionByLabel(findTestObject('lession3/HanhNguyenT_Day3/ItemDetailFrame/lstSize'), 'S', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ItemDetailFrame/lblBule'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ItemDetailFrame/btnAddToCart'))

totalCost = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/ProductSuccessfullyFrame/lblTotalCost'))

WebUI.verifyMatch(totalCost, '$59.96', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ProductSuccessfullyFrame/btnProceedCheckout'))

size = WebUI.getAttribute(findTestObject('lession3/HanhNguyenT_Day3/ShoppingCartSummaryPage/lblQty'), 'value')

WebUI.verifyMatch(size, '2', false)

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ShoppingCartSummaryPage/btnProceedToCheckout'))

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3/LoginPage/txtEmailLogin'), 'hanhtest2@gmail.com')

WebUI.sendKeys(findTestObject('lession3/HanhNguyenT_Day3/LoginPage/txtPassword'), '12345678')

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/LoginPage/btnSignIn'))

//if (WebUI.verifyElementChecked(findTestObject('lession3/HanhNguyenT_Day3/AddressPage/chkUseDeliverAddress'), 0)) {
//    WebUI.click('lession3/HanhNguyenT_Day3_EX02-02/Page_Address/btnProceedToCheckout')
//}
'step11'
WebUI.verifyElementChecked(findTestObject('lession3/HanhNguyenT_Day3/AddressPage/chkUseDeliverAddress'), 0)

'step12'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/AddressPage/btnProceedToCheckOut'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ShippingPage/chkAgreeTermOfSevice'))

WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ShippingPage/btnProceedToCheckOut'))

'step15'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/ChoosePaymentMethodPage/lblPayByCheck'))

'step16'
WebUI.click(findTestObject('lession3/HanhNguyenT_Day3/OderSummaryPage/btnConfirmOrder'))

completeMessage = WebUI.getText(findTestObject('lession3/HanhNguyenT_Day3/OrderConfirmPage/lblCompleteMessage'))

WebUI.verifyMatch(completeMessage, 'Your order on My Store is complete.', false)

