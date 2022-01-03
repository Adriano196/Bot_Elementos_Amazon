import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot_Elementos_JUnit {

	
	
	
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Amazon.com.br");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
     
		driver.quit();
		
		
	}

	@Test
	public void test() throws InterruptedException {

      driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[31]/a")).click();
		 Thread.sleep(5000); 
		driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click(); 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Adriano Costa");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Adr@costa.com.br");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("1234567");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).submit();
		
	}

}
