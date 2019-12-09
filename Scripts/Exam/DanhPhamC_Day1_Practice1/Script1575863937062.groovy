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

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.scrollToElement(findTestObject('DanhPhamC_Day1_Practice1/Page_PHPTRAVELS  Travel Technology Partner/lblFeaturedOffers'), 
    0)

WebUI.click(findTestObject('DanhPhamC_Day1_Practice1/Page_PHPTRAVELS  Travel Technology Partner/btnView More'))

WebUI.scrollToElement(findTestObject('DanhPhamC_Day1_Practice1/Page_Special Offers/lblDubaiSpecialPackages'), 0)

WebUI.click(findTestObject('DanhPhamC_Day1_Practice1/Page_Special Offers/btn'))

WebUI.setText(findTestObject('DanhPhamC_Day1_Practice1/Page_Lunch Discount/txtName'), 'Pham Cong Danh')

WebUI.setText(findTestObject('DanhPhamC_Day1_Practice1/Page_Lunch Discount/txtPhone'), '0912412442')

WebUI.setText(findTestObject('DanhPhamC_Day1_Practice1/Page_Lunch Discount/txaMessage'), 
    'hahaaaaaa')

WebUI.click(findTestObject('DanhPhamC_Day1_Practice1/Page_Lunch Discount/btnCONTACT'))

WebUI.closeBrowser()

