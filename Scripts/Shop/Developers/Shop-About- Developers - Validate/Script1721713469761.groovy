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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Swag Labs/div_Swag Labs'), 'Swag Labs')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/a_About'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing/p_The world relies on your code. Test on th_c31adf (1)'), 
    'The world relies on your code. Test on thousands of different device, browser, and OS configurations–anywhere, any time.')

WebUI.mouseOver(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Developers'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Selenium'), 
    'Selenium')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Cypress'), 
    'Cypress')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Playwright'), 
    'Playwright')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Appium'), 
    'Appium')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Mobile app testing'), 
    'Mobile app testing')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Test orchestration'), 
    'Test orchestration')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Web app testing'), 
    'Web app testing')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_CI'), 
    'CI')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Join our community'), 
    'Join our community')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Find an event'), 
    'Find an event')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Meet our experts'), 
    'Meet our experts')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Integrations'), 
    'Integrations')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Supported browsers  devices'), 
    'Supported browsers & devices')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Platform configurator'), 
    'Platform configurator')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Test configuration'), 
    'Test configuration')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Documentation'), 
    'Documentation')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Support'), 
    'Support')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Changelog'), 
    'Changelog')

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Developer/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_FAQs'), 
    'FAQs')

