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
import java.text.SimpleDateFormat
import java.util.Date
import java.awt.AWTException;
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

Date d1 = new Date()
SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss a")
String formattedDate = df.format(d1)
System.out.print(formattedDate)

System.setProperty('webdriver.chrome.driver', '//Users//admin//Downloads//chromedriver')

WebDriver driver = new ChromeDriver()

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)

driver.get('https://jostg.ronock.com/Ads/CreateEditQuickAd?isFlyerAd=True')

driver.manage().window().maximize()

driver.findElement(By.id('email')).sendKeys('8209b7e6a9@firemailbox.club')

driver.findElement(By.id('password')).sendKeys('qdXOW9kMOO')

driver.findElement(By.id('next')).click()

driver.findElement(By.name('AdvertisementTitle')).sendKeys('testflyer ' + formattedDate)

WebElement a = driver.findElement(By.name('AdvertisementDetails'))

a.sendKeys('this is flyyer desc ' + formattedDate)
sleep(2000)
driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/form/div/div[2]/div[1]/div/div[1]/div[4]/div[1]/button")).click()
sleep(2000)
driver.findElement(By.xpath("//button[@id='btnUpSaveGoToStudio']")).click()
sleep(1000)
WebElement uploadbutton = driver.findElement(By.xpath("//button[@class='studio-rightnav__upload']"))
uploadbutton.click()
WebElement checkflyer = driver.findElement(By.xpath("//div[@id='image-empty']"))
upload1("/Users/admin/Desktop/Katalon-Devices.JPG ")
sleep(3000)

if (checkflyer.isDisplayed()) {
	driver.close();
	
} else {
	
	sleep(1000)
	uploadbutton.click();
	upload2("/Users/admin/Desktop/Katalon-Devices.JPG ")
}
driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div[2]/a[2]")).click()
WebElement publish= driver.findElement(By.xpath("//*[text()='Publish']"))

if (publish.isEnabled()) {
	
	publish.click()
} else {
	
	driver.close()
}
driver.findElement(By.xpath("//*[text()='Yes, publish']")).click()
driver.close()



def upload1(String path) {
	
	StringSelection str = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
   //Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
   Robot robot = new Robot()
	
   // Cmd + Tab is needed since it launches a Java app and the browser looses focus
	
   robot.keyPress(KeyEvent.VK_META)
	
   robot.keyPress(KeyEvent.VK_TAB)
	
   robot.keyRelease(KeyEvent.VK_META)
	
   robot.keyRelease(KeyEvent.VK_TAB)
	
   robot.delay(500)
	
   //Open Goto window
	
    robot.keyPress(KeyEvent.VK_META)
	
   robot.keyPress(KeyEvent.VK_SHIFT)

   robot.keyPress(KeyEvent.VK_G)
	
   robot.keyRelease(KeyEvent.VK_META)

   robot.keyRelease(KeyEvent.VK_SHIFT)
	
   robot.keyRelease(KeyEvent.VK_G)

	
   //Paste the clipboard value
	
   robot.keyPress(KeyEvent.VK_META)
	
   robot.keyPress(KeyEvent.VK_V)
	
   robot.keyRelease(KeyEvent.VK_META)
	
   robot.keyRelease(KeyEvent.VK_V)
   
   robot.delay(1000)
	
   //Press Enter key to close the Goto window and Upload window
	
   robot.keyPress(KeyEvent.VK_ENTER)
	
   robot.keyRelease(KeyEvent.VK_ENTER)
	
   robot.delay(500)
	
   robot.keyPress(KeyEvent.VK_ENTER)
	
   robot.keyRelease(KeyEvent.VK_ENTER)
	
}
	
	

def sleep(int a) {
	try {
		Thread.sleep(a);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

def upload2(String path) {
	
	StringSelection str = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
   //Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	
   Robot robot = new Robot()
	
   sleep(2000)
	
   //Open Goto window
	
	robot.keyPress(KeyEvent.VK_META)
	
   robot.keyPress(KeyEvent.VK_SHIFT)

   robot.keyPress(KeyEvent.VK_G)
	
   robot.keyRelease(KeyEvent.VK_META)

   robot.keyRelease(KeyEvent.VK_SHIFT)
	
   robot.keyRelease(KeyEvent.VK_G)

	
   //Paste the clipboard value
	
   robot.keyPress(KeyEvent.VK_META)
	
   robot.keyPress(KeyEvent.VK_V)
	
   robot.keyRelease(KeyEvent.VK_META)
	
   robot.keyRelease(KeyEvent.VK_V)
   
   robot.delay(1000)
	
   //Press Enter key to close the Goto window and Upload window
	
   robot.keyPress(KeyEvent.VK_ENTER)
	
   robot.keyRelease(KeyEvent.VK_ENTER)
	
   robot.delay(500)
	
   robot.keyPress(KeyEvent.VK_ENTER)
	
   robot.keyRelease(KeyEvent.VK_ENTER)
	
}