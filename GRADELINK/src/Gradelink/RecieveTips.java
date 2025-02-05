package Gradelink;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RecieveTips 
{
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com");
	}
	
	@Test
	public void recievetipstest()
	{
		WebElement YourRole=driver.findElement(By.xpath("//*[@id=\"input_1_4\"]"));
		Actions wg = new Actions(driver);
		wg.moveToElement(YourRole).perform();
		WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"input_1_4\"]/option[11]"));
		dropdownOption.click();
		
		driver.findElement(By.name("input_2")).sendKeys("annagisele@gmail.com");
		
		driver.findElement(By.name("input_7.1")).click();
		
		driver.findElement(By.id("gform_submit_button_1")).click();
	}
	

}
