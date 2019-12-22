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

WebUI.navigateToUrl(GlobalVariable.URLEX0201)

WebUI.waitForPageLoad(GlobalVariable.TIMEOUT)

WebUI.setText(findTestObject('EX02-02/Page_My Store/txtSearch'), 'Dress')

WebUI.click(findTestObject('EX02-02/Page_My Store/btnSearch'))

WebUI.click(findTestObject('EX02-02/Page_Search - My Store/img1'))

WebUI.setText(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/txtQuantity'), '2')

WebUI.selectOptionByLabel(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/ddlSize'), 'S', false)

WebUI.click(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/ColorBlue'))

WebUI.click(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/btnAddToCart'))

Total1 = WebUI.verifyElementText(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/lblTotal1'), '$59.96')

WebUI.click(findTestObject('EX02-02/Page_Printed Summer Dress - My Store/btnProceedToCheckout1'))

Text = WebUI.getText(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/lblYourShoppingCartContains'))

WebUI.verifyMatch(Text, '.*2.*', true)

Total2 = WebUI.verifyElementText(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/lblTotal2'), 
    '$59.96')

WebUI.verifyEqual(Total1, Total2)

WebUI.click(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnProceedToCheckout2'))

WebUI.setText(findTestObject('EX02-02/Page_Login - My Store/txtEmail'), 'vy.vo2@asiantech.vn')

WebUI.setEncryptedText(findTestObject('EX02-02/Page_Login - My Store/txtPassword'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('EX02-02/Page_Login - My Store/btnSignIn'))

WebUI.verifyElementChecked(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnCheckbox'), 10)

WebUI.click(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnProceedToCheckout3'))

WebUI.check(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/chkTermsOfService'))

WebUI.click(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnProceedToCheckout4'))

WebUI.click(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnPayByCheck'))

WebUI.click(findTestObject('EX02-02/Page_Order - My Store (Address, Shipping, Payment)/btnIConfirmMyOrder'))

WebUI.verifyElementText(findTestObject('EX02-02/Page_Order confirmation - My Store/lblYourOrderOnMyStoreIsComplete'), 'Your order on My Store is complete.')

