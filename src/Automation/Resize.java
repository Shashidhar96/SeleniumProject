package Automation;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1https://testautomationpractice.blogspot.com/?m=1");
		
		driver.manage().window().maximize();
		
		WebElement si= driver.findElement(By.id("resizable"));
		
		Point loc = si.getLocation();
		
		int x = loc.getX();
		
		int y = loc.getY();
		
		System.out.println(x +"  " +y);
		
		WebElement res = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[2]"));
		
		Actions ac = new Actions(driver);
		
		ac.clickAndHold(res).moveByOffset(30, 30).perform();

	}

}
