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

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_My Store/txtSearch'), 'Dress')

WebUI.sendKeys(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_My Store/txtSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Search - My Store/lnkProductName'))

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/txtQuality'), 
    '2')

WebUI.selectOptionByValue(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/ddlSize'), 
    '1', false)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/rdoBlue'))

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/btnAddToCart'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

double pro = Float.parseFloat(WebUI.getText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/lblProducts')).replace(
        '$', ''))

double ship = Float.parseFloat(WebUI.getText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/lblShipping')).replace(
        '$', ''))

double total = Float.parseFloat(WebUI.getText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/lblTotal')).replace(
        '$', ''))

WebUI.verifyEqual(total, pro + ship)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Printed Summer Dress - My Store/btnProceedToCheckout'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

quality = WebUI.getAttribute(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/txtQty'), 'value')

WebUI.verifyEqual(quality, 2)

double total2 = Float.parseFloat(WebUI.getText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/lblTotal2')).replace(
        '$', ''))

WebUI.verifyEqual(total, total2)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/btnProceedToCheckout2'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/txtEmailLogin'), 'phan.nguyen@asiantech.vn')

WebUI.setText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/txtPasswordLogin'), 'Abcd1234')

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Login - My Store/btnSignIn'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

checked = WebUI.verifyElementChecked(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/chkDeliveryAddress'), 
    0)

if (!(checked)) {
    WebUI.check(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/chkDeliveryAddress'))
} else {
    WebUI.comment('Already checked')
}

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/btnProceedToCheckout3'))

WebUI.check(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/chkAgreeToTerms'))

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/btnProceedToCheckout4'))

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order - My Store/btnPayByCheck'))

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.click(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_My Store/btnConfirm'))

WebUI.verifyElementText(findTestObject('Lesson3/Ex02 CheckOut/Ex02-02 Add to cart/Page_Order confirmation - My Store/mgsComplete'), 
    'Your order on My Store is complete.')

