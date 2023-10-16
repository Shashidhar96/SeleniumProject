package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
		button.click();
		Alert a=  driver.switchTo().alert();
		a.accept();
		
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]"));
		confirm.click();
		Alert con =  driver.switchTo().alert();
		String txt = con.getText();
		System.out.println(txt);
		a.accept();
		
		WebElement prompt  = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]"));
	    prompt.click();
		Alert pro =  driver.switchTo().alert();
		String txt1 = pro.getText();
		System.out.println(txt1);
		pro.sendKeys("Hello");
		pro.accept();
		
	}
	
}