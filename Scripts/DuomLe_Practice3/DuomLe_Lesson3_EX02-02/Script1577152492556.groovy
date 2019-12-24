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

WebUI.openBrowser(GlobalVariable.url)

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('DuomLe_Practice3_EX2-02/txtSearch'), 'Dress')

WebUI.sendKeys(findTestObject('DuomLe_Practice3_EX2-02/txtSearch'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnSelectFirstItem'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnSelectQuantity'))

WebUI.selectOptionByIndex(findTestObject('DuomLe_Practice3_EX2-02/ddlSize'), 0)

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnColorBlue'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnAddtocart'))

itemnumber1 = WebUI.getText(findTestObject('DuomLe_Practice3_EX2-02/lblNumberItem1'))

total = WebUI.getText(findTestObject('DuomLe_Practice3_EX2-02/lblTotal'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnProceedtocheckout'))

numberitem2 = WebUI.getAttribute(findTestObject('DuomLe_Practice3_EX2-02/textVeifyNumberItem2'), 'value')

WebUI.verifyMatch(itemnumber1, numberitem2, false)

total2 = WebUI.getText(findTestObject('DuomLe_Practice3_EX2-02/lblTotalFinal'))

WebUI.verifyMatch(total, total2, false)

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnProceedtocheckout2'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-02/txtEmailaddressLogin'), 'duom55804@gmail.com')

WebUI.setText(findTestObject('DuomLe_Practice3_EX2-02/txtPasswordLogin'), 'lethi')

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnSignIn'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnProceedToCheckout3'))

WebUI.check(findTestObject('DuomLe_Practice3_EX2-02/chkAgreeTerm'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnProceedToCheckout4'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnPaybycheck'))

WebUI.click(findTestObject('DuomLe_Practice3_EX2-02/btnIConfirmOrder'))

msg = WebUI.getText(findTestObject('DuomLe_Practice3_EX2-02/msgComplete'))

WebUI.verifyMatch(msg, 'Your order on My Store is complete.', false)

