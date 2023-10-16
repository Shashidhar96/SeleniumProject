package Automation;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	
		public static Logger log = Logger.getLogger(Google.class.getName());

        @SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			PropertyConfigurator.configure("C:\\Users\\hp\\workspace\\SeleniumProject\\log4j.properties");
			
			WebDriver driver = new ChromeDriver();
			
			log.info("driver launched");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			driver.get("https://www.google.co.in/");
			log.info("Website launched successfully");
			Thread.sleep(1000);
			
			WebElement e=driver.findElement(By.name("q"));
			
			e.sendKeys("selenium");
			
			Thread.sleep(1000);
			
			e.submit();
			
			log.info("Searched successfully");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
			
			driver.findElement(By.xpath("//span[text()='Downloads']")).click();
			
			driver.findElement(By.id("navbarDropdown")).click();
			
			driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).click();
			
		

	}

}
