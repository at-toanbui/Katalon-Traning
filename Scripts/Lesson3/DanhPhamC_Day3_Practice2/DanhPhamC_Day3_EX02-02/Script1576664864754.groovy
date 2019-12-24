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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_My Store/txtSearch'), 'Dress')

WebUI.mouseOver(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_My Store/lstResult'))

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_My Store/lstFirstResult'))

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/txtQuantity'), 
    '2')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/chkColorBlue'))

WebUI.selectOptionByValue(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/ddlSize'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/ddlSize'), 
    '1', true)

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/btnAddToCart'))

products = WebUI.getText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblProductsCost'))

ship = WebUI.getText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblShipCost'))

total = WebUI.getText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/lblTotalCost'))

double a = Double.parseDouble(products.substring(1))

double b = Double.parseDouble(ship.substring(1))

double c = Double.parseDouble(total.substring(1))

double total_ = a + b

WebUI.verifyEqual(c, total_)

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Printed Summer Dress - My Store/btnProceedToCheckout'))

WebUI.verifyElementAttributeValue(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/lblQuantity'), 
    'value', '2', 0)

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout1'))

WebUI.setText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Login - My Store/txtEmail'), 
    'danhpc11212@gmail.com')

WebUI.setEncryptedText(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Login - My Store/txtPassword'), 
    'tE+PEiSUqqgo23gg3D+W7A==')

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Login - My Store/btnSignIn'))

if (WebUI.verifyElementChecked(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/checkbox'), 
    0) == false) {
    WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/chkChooseAddress'))
}

WebUI.scrollToElement(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/btnContinueShoping'), 
    0)

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout2'))

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/chkTermsOfService'))

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/btnProceedToCheckout3'))

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order - My Store/btnPayByCheck'))

WebUI.click(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_My Store/btnConfirmOrder'))

WebUI.verifyElementVisible(findTestObject('Lesson3/DanhPhamC_Day3_Practice2/DanhPhamC_Day3_EX02-02/Page_Order confirmation - My Store/lblComplete'))

