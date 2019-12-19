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

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtSearch'), GlobalVariable.search)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnSearch'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/imgFirstItem'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnQuantityPlus'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/ddlSize'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/ddlSize_S'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnColorBlue'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnAddToCart'))

totalcost = WebUI.getText(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/lblTotalCost'))

WebUI.verifyMatch(totalcost, GlobalVariable.totalcost, false)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnProceedToCheckout'))

cartquantity = WebUI.getAttribute(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtCartQuantity'), 'value')

WebUI.verifyMatch(cartquantity, '2', false)

carttotalcost = WebUI.getText(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/lblCartTotalCost'))

WebUI.verifyMatch(carttotalcost, totalcost, false)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnCartProceedToCheckout'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtLoginEmail'), GlobalVariable.email)

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/txtLoginPassword'), GlobalVariable.password)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnLogin'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/chkUseDeliveryAddress'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnProceedToCheckout2'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/chkTermsOfService'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnProceedToCheckout3'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/lnkPayByCheck'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/btnIConfirmMyOrder'))

WebUI.verifyElementVisible(findTestObject('HoaTranTT_Day3/EX02-02-AddToCart/lblMessage_Success'))

