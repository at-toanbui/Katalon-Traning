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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('New Folder/Page_My Store/txtSearch'), 'Dress')

WebUI.click(findTestObject('New Folder/Page_My Store/btnSearch'))

WebUI.click(findTestObject('New Folder/Page_My Store/imgFirst'))

WebUI.click(findTestObject('New Folder/Page_Printed Summer Dress - My Store/btnIconplus'))

WebUI.selectOptionByLabel(findTestObject('New Folder/Page_Printed Summer Dress - My Store/ddlSize'), 'S', false)

WebUI.click(findTestObject('New Folder/Page_Printed Summer Dress - My Store/btnBlue'))

WebUI.click(findTestObject('New Folder/Page_Printed Summer Dress - My Store/btnAddtocart'))

String totalProduct = WebUI.getText(findTestObject('KatalonHealthcare/Page_Printed Summer Dress - My Store/lblTotalP'))

totalProduct = totalProduct.replaceAll('[$,]', '')

double a = Double.valueOf(totalProduct)

String totalShipping = WebUI.getText(findTestObject('KatalonHealthcare/Page_Printed Summer Dress - My Store/lblTotalS'))

totalShipping = totalShipping.replaceAll('[$,]', '')

double b = Double.valueOf(totalShipping)

String total = WebUI.getText(findTestObject('KatalonHealthcare/Page_Printed Summer Dress - My Store/lblTotal'))

total = total.replaceAll('[$,]', '')

double c = Double.valueOf(total)

String totalExpected =  a + b

WebUI.verifyEqual(total, totalExpected)

WebUI.click(findTestObject('New Folder/Page_Printed Summer Dress - My Store/btnProceedcheckout'))

quantity = WebUI.getAttribute(findTestObject('KatalonHealthcare/Page_Order - My Store/txtQuantity'), 'value')

WebUI.verifyEqual(quantity, '2', FailureHandling.STOP_ON_FAILURE)

String currentTotal = WebUI.getText(findTestObject('KatalonHealthcare/Page_Order - My Store/txtTotalF'))

currentTotal = currentTotal.replaceAll('[$,]', '')

WebUI.verifyEqual(total, currentTotal)

WebUI.click(findTestObject('New Folder/Page_Order - My Store/btnProceedcheckout2'))

WebUI.setText(findTestObject('New Folder/Page_Login - My Store/txtEmail'), 'minhthai@gmail.com')

WebUI.setText(findTestObject('New Folder/Page_Login - My Store/txtPassword'), '123456')

WebUI.click(findTestObject('New Folder/Page_Login - My Store/btnSignin'))

WebUI.click(findTestObject('New Folder/Page_My Store/chkDeliveryAddress'))

WebUI.click(findTestObject('New Folder/Page_Order - My Store/btnProceedcheckout3'))

WebUI.click(findTestObject('New Folder/Page_My Store/chkAgree'))

WebUI.click(findTestObject('New Folder/Page_Order - My Store/btnProceedcheckout4'))

WebUI.click(findTestObject('New Folder/Page_Order - My Store/btnPaybycheck'))

WebUI.click(findTestObject('New Folder/Page_My Store/btnConfirm'))

WebUI.verifyTextPresent('Your order on My Store is complete.', true, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

