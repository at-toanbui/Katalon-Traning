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

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/lnkSignIn'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/txtRegisterEmail'), GlobalVariable.email)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/btnCreateAnAccount'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/rdoGenderMrs'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtFirstName'), GlobalVariable.firstname)

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtLastName'), GlobalVariable.lastname)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtEmail'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressFirstName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressLastName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressCompany'), '')

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressAddress'), GlobalVariable.address)

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressCity'), GlobalVariable.city)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/ddlAddressState'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/ddlAddressState_Alaska'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressPostalCode'), GlobalVariable.postalcode)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/ddlAddressCountry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/ddlAddressCountry_US'))

WebUI.sendKeys(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressMobile'), GlobalVariable.mobile)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/txtAddressAlias'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/Account Information/btnRegister'))

WebUI.verifyElementVisible(findTestObject('HoaTranTT_Day3/EX02-01-Register/lnkAccountName'))

WebUI.click(findTestObject('HoaTranTT_Day3/EX02-01-Register/btnSignOut'))

