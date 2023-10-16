package Automation;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectpgm {

	public static void main(String[] args) throws IOException 
	{

     
     FileInputStream  fi = new FileInputStream("C:\\Users\\hp\\workspace\\SeleniumProject\\ob.properties");
     
     Properties prop = new Properties ();
     prop.load(fi);
     
     WebDriver driver = new ChromeDriver();
     driver.get(prop.getProperty("url"));
     
     WebElement searchele = driver.findElement(By.xpath(prop.getProperty("search")));
     searchele.sendKeys(prop.getProperty("value"));
     searchele.submit();
     
     WebElement clickopt = driver.findElement(By.xpath(prop.getProperty("mobileclick")));
     clickopt.click();
     
     
     
     //System.out.println( pro.getProperty("browser"));  // use getproperty method to read the file  
    // System.out.println( pro.getProperty("url"));


	}

}
