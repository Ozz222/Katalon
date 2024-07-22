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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/button_Accept All Cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/span_Products'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/span_Platform for Test'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/span_Sauce Cross-Browser'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce Mobile'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce Low-Code'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce Error Reporting'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce Orchestrate'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce API Quality'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce Visual'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/div_Sauce API Quality'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_All-in-One API Testing  Quality Platform/h1_API TESTING'), 
    'API TESTING')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_All-in-One API Testing  Quality Platform/h2_One platform for API testing and quality'), 
    'One platform for API testing and quality')

not_run: WebUI.closeBrowser()

