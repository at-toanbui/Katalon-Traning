import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.url3Element)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Monday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Tuesday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Wednesday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Thursday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Friday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Saturday', false, 0)

WebUI.verifyOptionPresentByValue(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    'Sunday', false, 0)

CountOption = WebUI.getNumberOfTotalOption(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'))

WebUI.verifyEqual(CountOption, 8)

WebUI.selectOptionByIndex(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/ddlSelectADay'), 
    '2')

WebUI.verifyElementText(findTestObject('Lesson2/Exercise-05/Page_Selenium Easy Demo - Automate All Scenarios/lblMonday'), 
    'Day selected :- Monday')

