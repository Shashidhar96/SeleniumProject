package Automation;

import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooptip");
		
		//WebElement fr= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(0);
		
		WebElement tool = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		
		String txt=tool.getAttribute("title");
		System.out.println(txt);

	}

}
