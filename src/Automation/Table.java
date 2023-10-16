package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;

public class Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> ele =driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[2]/div[1]/table/tbody/tr"));
		System.out.println(ele.size());
		
		WebElement data=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[6]/td[1]"));

		System.out.println(data.getText());
	}

}
