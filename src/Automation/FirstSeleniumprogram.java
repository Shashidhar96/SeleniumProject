package Automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumprogram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		
	   /* Dimension size= driver.manage().window().getSize();
		System.out.println(size);
        
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.youtube.com/watch?v=gKbKkBiNFLQ");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();*/
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Jailer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
