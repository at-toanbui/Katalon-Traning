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

WebUI.navigateToUrl(GlobalVariable.urlPractice1)

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_My Store/txtSearch'), 0)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-02/Page_My Store/txtSearch'), 'dress')

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_My Store/btnSearch'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/lblKeyWord'), 0)

lblKeyWord = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/lblKeyWord'))

lblKeyWord = lblKeyWord.toLowerCase()

WebUI.verifyMatch(lblKeyWord, '.*dress.*', true)

WebUI.mouseOver(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/imgProduct1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/btnMore'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/btnPlus'))

WebUI.selectOptionByLabel(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/ddlSize'), 'S', true)

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/btnBlueColor'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/btnAddToCart'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblProductAddedSuccessfully'), 
    0)

lblAddSuccessfully = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblProductAddedSuccessfully'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(lblAddSuccessfully, 'Product successfully added to your shopping cart', true)

totalProducts = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblTotalProducts'))

totalShipping = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblTotalShipping'))

totalCost = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblTotalCost'))

double a = Double.parseDouble(totalProducts.substring(1))

double b = Double.parseDouble(totalShipping.substring(1))

double total = a + b

double c = Double.parseDouble(totalCost.substring(1))

WebUI.verifyEqual(c, total)

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Search - My Store/btnProceedToCheckout1'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/lblShoppingCartSummary'), 0)

quantity = WebUI.getAttribute(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/txtQuantity'), 'value')

WebUI.verifyEqual(quantity, 2)

WebUI.scrollToElement(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/lblCurrentTotal'), 0)

currentTotal = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/lblCurrentTotal'))

WebUI.verifyEqual(totalCost, currentTotal)

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout2'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_Login - My Store/txtEmail3'), 0)

WebUI.sendKeys(findTestObject('HaDangT_Day3_EX02-02/Page_Login - My Store/txtEmail3'), 'dangha653@gmail.com')

WebUI.setEncryptedText(findTestObject('HaDangT_Day3_EX02-02/Page_Login - My Store/txtPassword2'), '8LU4z8lHbHHzl7xjkfWa7A==')

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Login - My Store/btnSignIn'))

WebUI.verifyElementChecked(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/chkUseTheDeliveryAddress'), 0)

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout3'))

WebUI.check(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/chkAgreeTermsService'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout4'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_Order - My Store/btnPayByCheck'))

WebUI.click(findTestObject('HaDangT_Day3_EX02-02/Page_My Store/btnConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('HaDangT_Day3_EX02-02/Page_Order confirmation - My Store/lblOrderIsCompleted'), 
    0)

lblOrderIsCompleted = WebUI.getText(findTestObject('HaDangT_Day3_EX02-02/Page_Order confirmation - My Store/lblOrderIsCompleted'))

WebUI.verifyMatch(lblOrderIsCompleted, 'Your order on My Store is complete.', false)

WebUI.closeBrowser()

