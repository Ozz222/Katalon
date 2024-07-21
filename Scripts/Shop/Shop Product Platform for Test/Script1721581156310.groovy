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

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_About'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/p_The world relies on your code. Test on th_c31adf'), 
    'The world relies on your code. Test on thousands of different device, browser, and OS configurations–anywhere, any time.')

WebUI.click(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Products'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Platform for Test'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/span_Sauce Cross-Browser'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce Mobile'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce Low-Code'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce Error Reporting'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce Orchestrate'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce API Quality'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Sauce Visual'), 
    0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/div_Platform for Test'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Sauce Labs Products Automated Testing _2d1b12/div_PLATFORM FOR TESTThe unified platform f_e23a16'), 
    0)

WebUI.closeBrowser()

