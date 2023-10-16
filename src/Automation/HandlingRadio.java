package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadio {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://testautomationpractice.blogspot.com/");
        
        driver.manage().window().fullscreen();
        
        /* WebElement male = driver.findElement(By.id("male"));
        
        WebElement female=driver.findElement(By.id("female"));
        
        if(male.isSelected())
        {
        	System.out.println("It's been Selected");
        }
        else
        {
        	male.click();
        }*/
        Select country = new Select (driver.findElement(By.id("country")));
        
        country.selectByIndex(1);
        
        country.selectByValue("India");
        
        country.selectByVisibleText("Australia");
        
        List<WebElement> count = country.getOptions();
        
        int total= count.size();
        
        System.out.println(total);
        
        for(int i=0;i<total;i++)
        {
        	String value= count.get(i).getText();
        	
        	System.out.println(value);
        }
	}

}
