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

WebUI.navigateToUrl('airbnb.pl')

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/button_OK'), FailureHandling.OPTIONAL)

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), false)

WebUI.setText(findTestObject('Object Repository/AirBnBPages/Page_Main/input_Gdzie_query'), city)

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/div_Split, Chorwacja'))

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/div_4'))

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/div_31'))

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/label_14dni14dni'))

WebUI.click(findTestObject('Object Repository/AirBnBPages/Page_Main/span_Dodaj goci_t1dqvypu atm_9s_1ulexfb atm_336e94'), 
    FailureHandling.OPTIONAL)

WebUI.verifyTextPresent(expectedResult, false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

