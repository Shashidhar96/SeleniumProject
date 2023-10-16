package Automation;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txt = driver.findElement (By.id("searchInputBox"));
		
		txt.sendKeys("Jailer");
		
		Thread.sleep(2000);
		
		WebElement link=driver.findElement(By.partialLinkText("Movies"));
		link.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id="__next"]/div/div[1]/div/div/div/div/div[8]/div/div/div");
		
		
	}		

	}


