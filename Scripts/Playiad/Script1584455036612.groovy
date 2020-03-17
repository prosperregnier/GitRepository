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

WebUI.navigateToUrl('https://intranet.iadholding.com/')

WebUI.click(findTestObject('Object Repository/Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Identifiant_username'), 'prosper.regnier@iadinternational.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IAD/input_Mot de passe_password'), 'WVWLwPGLe6pq0Fj0B1fzug==')

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Mot de passe_submit'))

WebUI.setText(findTestObject('Object Repository/Page_IAD/input_Identifiant_username'), '45286@iadfrance.fr')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IAD/input_Mot de passe_password'), '38M0G6J1+bqFbCyeF0ETyQ==')

WebUI.click(findTestObject('Object Repository/Page_IAD/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_Lorsque vous avez termin cliquez sur le_38e283'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Lorsque vous avez termin cliquez sur le_83aa4e'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Lorsque vous avez termin cliquez sur le_83aa4e_1'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div_Lorsque vous avez termin cliquez sur le_83aa4e'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Valider'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_concat(S  il n  y en a aucune cliquez s_78d0ed'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_IAD/img_concat(S  il n  y en a aucune cliquez s_78d0ed_1'))

WebUI.click(findTestObject('Object Repository/Page_IAD/button_Suivant'))

WebUI.click(findTestObject('Object Repository/Page_IAD/div'))

WebUI.click(findTestObject('Object Repository/Page_IAD/input_Identifiant_username'))

WebUI.click(findTestObject('Object Repository/Page_IAD/main_Bienvenue sur votre espace    Connecte_4e44ae'))

WebUI.closeBrowser()

