package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("mobiles");
		Thread.sleep(2000);
		
		List<WebElement> suggest = driver.findElement(By.xpath("//*[@id="nav-flyout-searchAjax"]/div[2]/div/div[1]/div"));
		
		int count= suggest.size();
		System.out.println(count);
		Thread.sleep(2000);
		
		for (WebElement e : suggest)
		{
			System.out.println(e.getText());
		}
	}
