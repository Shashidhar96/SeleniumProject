package Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://xiaomi.app.param.ai/jobs/test-engineer-510/");
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		WebElement upload=driver.findElement(By.id("file_9e7c4720-0794-439b-aa72-a2f4cebcc7f5"));
		upload.click();
		
		//copy the file
		StringSelection  ss= new StringSelection("C:\Users\hp\Downloads\Shashi CV 1.6.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot ro= new Robot
	    ro.delay(250);
		
		//paste the File
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.KetPress(KeyEvent.VK_V);
		robot.KeyRelease(KeyEvent.VK_V);
		robot.KeyRelease(KeyEvent.VK_CONTROL);
		robot.KetPress(KeyEvent.VK_ENTER);
		
		robot.KeyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		

	}

}
