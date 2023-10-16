package Automation;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidrop {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.name("selenium Commands")));
		
		List<WebElement> options= s.getOptions();
		
		for (WebElement i : options)
		{
			System.out.println(i.getText());
		}
		
		boolean b =s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(1);
		
		s.selectByVisibleText("Switch Commands");
		
		//Print the selected Option
		
		WebElement first =s.getFirstSelectedOption();
		
		System.out.println(first.getText());
		
		//All the selected options
		
		List<WebElement> alloptions = s.getAllSelectedOptions();
		
		for (WebElement all : alloptions)
		{
			System.out.println(all.getText());
		}
		
	}

}
