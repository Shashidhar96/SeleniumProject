package Automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePgm {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung s23");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
		
		//To Handle the window
		Set<String> s = driver.getWindowHandles();
      ArrayList ar = new ArrayList(s);
      System.out.println(ar.get(0));
      System.out.println(ar.get(1));
      
      driver.switchTo().window((String)ar.get(1));
		
	driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();

	}

}
