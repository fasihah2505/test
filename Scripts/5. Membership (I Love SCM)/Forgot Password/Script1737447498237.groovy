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

Mobile.startApplication('Test Files/Setia_City_Mall_Version_5_13_11_(Version_Code_162).apk', false)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SCM/forgot pass/android.widget.TextView - Forgot Password'), 0)

Mobile.setText(findTestObject('Object Repository/SCM/forgot pass/android.widget.EditText - XXXXXX'), '010101', 0)

Mobile.setText(findTestObject('Object Repository/SCM/forgot pass/android.widget.EditText - XX'), '10', 0)

Mobile.setText(findTestObject('Object Repository/SCM/forgot pass/android.widget.EditText - XXXX'), '1111', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SCM/forgot pass/android.widget.TextView - Submit'), 0)

Mobile.tap(findTestObject('Object Repository/SCM/forgot pass/android.widget.Button - OK'), 0)

