import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.click(findTestObject("id=vc-input"))
WebUI.typeOnImage(findTestObject("id=vc-input", "I want to book a hotel"))
WebUI.sendKeys(findTestObject("id=vc-input", "${KEY_ENTER}"))
WebUI.typeOnImage(findTestObject("id=vc-input", "recommended hotel near Gardens by the bay"))
WebUI.sendKeys(findTestObject("id=vc-input", "${KEY_ENTER}"))
WebUI.click(findTestObject("id=vc-input"))
WebUI.typeOnImage(findTestObject("id=vc-input", "Thank you"))
WebUI.sendKeys(findTestObject("id=vc-input", "${KEY_ENTER}"))

WebUI.closeBrowser()