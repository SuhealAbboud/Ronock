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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import java.util.concurrent.TimeUnit as TimeUnit
import com.kms.katalon.core.configuration.RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

System.setProperty('webdriver.chrome.driver', 'D:\\chromedriver.exe')

WebDriver driver = new ChromeDriver()

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)

driver.get('https://partnerwebtest.azurewebsites.net/Ads/CreateEditQuickAd?isFlyerAd=True')

driver.manage().window().maximize()

driver.findElement(By.id('logonIdentifier')).sendKeys('f565a00013@firemailbox.club')

driver.findElement(By.id('password')).sendKeys('QOoDjtP8OX')

driver.findElement(By.id('next')).click()

driver.findElement(By.name('AdvertisementTitle')).sendKeys('testflyer')

WebElement a = driver.findElement(By.name('AdvertisementDetails'))

a.sendKeys('this is flyyer desc')
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/form/div/div[2]/div[1]/div/div[1]/div[4]/div[1]/button")).click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//button[@id='btnUpSaveGoToStudio']")).click()
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//button[@class='studio-rightnav__upload']")).click()
dd()
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.findElement(By.xpath("//button[@class='studio-rightnav__upload']")).click()
test2()
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


def dd() {
	Runtime runtime = Runtime.getRuntime()
	Process process=runtime.exec('D:\\test.exe')
}

def test2() {
	Runtime runtime = Runtime.getRuntime()
	Process process=runtime.exec('D:\\suheal.exe')
}
driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div[2]/a[2]")).click()
driver.findElement(By.xpath("//*[text()='Publish']")).click()
driver.findElement(By.xpath("//*[text()='Yes, publish']")).click()


