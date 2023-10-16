package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement login = driver.findElement(By.xpath("//*[@id="nav-link-accountList-nav-line-1\"]"));
		
		Actions act = new Actions(driver);
		
		

	}

}
