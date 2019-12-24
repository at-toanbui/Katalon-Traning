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
import java.text.NumberFormat as NumberFormat

WebUI.navigateToUrl(GlobalVariable.HOME_PAGE_PRACTICE_ULR)

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/txtSearch'), 'Dress')

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnSearch'))

CustomKeywords.'practiceLesson3.customKeyWord.clickElement'(findTestObject('Lesson3/Searching/lstProduct'), 0)

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/txtQuantity'), GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/txtQuantity'), numberOfItemInput)

WebUI.selectOptionByLabel(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/ddlSize'), 'S', false)

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnColorBlue'))

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnAddToCart'))

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/fraLayerAddToCart'), GlobalVariable.TIMEOUT)

NumberFormat nf = NumberFormat.getInstance()

totalShipping = nf.parse(WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblShipping')).substring(1))

totalProducts = nf.parse(WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblProduct')).substring(1))

total = nf.parse(WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblTotal')).substring(1))

WebUI.verifyEqual(total, totalShipping + totalProducts )

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnProccedCheckout1'))

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblShoppingCartTitle'), GlobalVariable.TIMEOUT)

totalPriceNoTax = nf.parse(WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblTotalPriceNoTax')).substring(1))

String numberOfItem = WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblNumberOfItem')).replaceAll('[^0-9]', '')

WebUI.verifyMatch(numberOfItem, numberOfItemInput, false)

WebUI.verifyEqual(totalPriceNoTax, total)

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnProceedCheckout2'))

WebUI.setText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/txtEmailLogin'), 'lenhung.dhkt@gmail.com')

WebUI.setEncryptedText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/txtPasswordLogin'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnSignin'))

WebUI.waitForElementVisible(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/chkAddressConfirm'), GlobalVariable.TIMEOUT)

attribute = WebUI.getAttribute(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/chkAddressConfirm'), 'class')

verifyChecked = WebUI.verifyMatch(attribute, 'checked', false)

if (!(verifyChecked)) {
    WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/chkAddressConfirm'))
}

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnProceedCheckout3'))

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/chkTermOfService'))

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnProceedCheckout4'))

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lnkPaymentMethod'))

WebUI.click(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/btnConfirm'))

currentSuccessMessage = WebUI.getText(findTestObject('Lesson3/Checkout/EX02-02_AddToCart/lblSuccessMessage'))

WebUI.verifyMatch(currentSuccessMessage, messageSuccess, false)

