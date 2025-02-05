package Gradelink;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAccount 
{
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com");
	}
	
	@Test
	public void demoaccounttest()
	{
		driver.findElement(By.xpath("//*[@id=\"menu-item-64436\"]")).click();
		
		WebElement YourRole=driver.findElement(By.xpath("//*[@id=\"input_79_1\"]"));
		Actions yr = new Actions(driver);
		yr.moveToElement(YourRole).perform();
		WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"input_79_1\"]/option[11]"));
		dropdownOption.click();
		
		
		WebElement Country=driver.findElement(By.xpath("//*[@id=\"input_79_14\"]"));
		Actions ct = new Actions(driver);
		ct.moveToElement(Country).perform();
		WebElement dropdownOption1 = driver.findElement(By.xpath("//*[@id=\"input_79_14\"]/option[106]"));
		dropdownOption1.click();
		
		driver.findElement(By.id("input_79_39")).sendKeys("Mount Zion");
		
		driver.findElement(By.name("input_2.3")).sendKeys("Anna");
		driver.findElement(By.name("input_2.6")).sendKeys("Gisselle");
		driver.findElement(By.id("input_79_5")).sendKeys("mountschool@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"input_79_4_raw\"]")).sendKeys("1234567890");
		
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"gform_submit_button_79\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		submitBtn.click();

		
		
		
		
		

        
        
		

	}

	
}

