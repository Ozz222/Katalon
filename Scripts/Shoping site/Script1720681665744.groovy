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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Swag Labs/div_Swag Labs'), 'Swag Labs')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'), 'Test.allTheThings() T-Shirt (Red)')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/btnAddToCart'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Swag Labs/span_1'), '1')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/btnCheckout'))

WebUI.setText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Checkout Your Information_firstName'), 'Axl')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Rose')

WebUI.setText(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Checkout Your Information_postalCode'), '123456')

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/btnFinish'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop/Page_Swag Labs/span_Checkout Complete'), 'Checkout: Complete!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/Page_Swag Labs/img_Checkout Complete_pony_express'), 0)

WebUI.click(findTestObject('Object Repository/Shop/Page_Swag Labs/btnBackHome'))

WebUI.closeBrowser()

