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
import java.text.NumberFormat as NumberFormat

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Lesson3/Practice2/HomePage/txtSearchField'), 'Dress')

WebUI.click(findTestObject('Lesson3/Practice2/HomePage/btnResultItem1'))

WebUI.setText(findTestObject('Lesson3/Practice2/ItemDetailsPage/txtQuantity'), '2')

WebUI.selectOptionByLabel(findTestObject('Lesson3/Practice2/ItemDetailsPage/ddlSize'), 'S', false)

WebUI.click(findTestObject('Lesson3/Practice2/ItemDetailsPage/btnColorBlue'))

WebUI.click(findTestObject('Lesson3/Practice2/ItemDetailsPage/btnAddToCart'))

productCost = WebUI.getText(findTestObject('Lesson3/Practice2/ItemDetailsPage/lblProductCost'))

Number cost1 = NumberFormat.getInstance().parse(productCost.substring(1))

shippingCost = WebUI.getText(findTestObject('Lesson3/Practice2/ItemDetailsPage/lblShippingCost'))

Number cost2 = NumberFormat.getInstance().parse(shippingCost.substring(1))

totalCost = WebUI.getText(findTestObject('Lesson3/Practice2/ItemDetailsPage/lblTotalCost'))

Number cost3 = NumberFormat.getInstance().parse(totalCost.substring(1))

WebUI.verifyEqual(cost1 + cost2, cost3)

WebUI.click(findTestObject('Lesson3/Practice2/ItemDetailsPage/btnProceedToCheckOut'))

quantity = WebUI.getAttribute(findTestObject('Lesson3/Practice2/OrderPage/txtQuantity'), 'value')

WebUI.verifyEqual(quantity, 2, FailureHandling.STOP_ON_FAILURE)

totalPrice = WebUI.getText(findTestObject('Lesson3/Practice2/OrderPage/lblTotalPrice'))

Number total = NumberFormat.getInstance().parse(totalPrice.substring(1))

WebUI.verifyEqual(total, cost3)

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnProceedToCheckOut'))

WebUI.setText(findTestObject('Lesson3/Practice2/OrderPage/txtEmail'), 'ngan.tran+1@asiantech.vn')

WebUI.setEncryptedText(findTestObject('Lesson3/Practice2/OrderPage/txtPassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnLogin'))

if (WebUI.verifyElementChecked(findTestObject('Lesson3/Practice2/OrderPage/chkUseDeliveryAddress'), 0) == false) {
    WebUI.check(findTestObject('Lesson3/Practice2/OrderPage/chkUseDeliveryAddress'))
}

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnProceedToCheckOut2'))

WebUI.check(findTestObject('Lesson3/Practice2/OrderPage/chkToU'))

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnProceedToCheckOut3'))

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnPayByCheck'))

WebUI.click(findTestObject('Lesson3/Practice2/OrderPage/btnConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('Lesson3/Practice2/OrderPage/lblMessageSuccess'), 5)

WebUI.verifyElementText(findTestObject('Lesson3/Practice2/OrderPage/lblMessageSuccess'), 'Your order on My Store is complete.')

