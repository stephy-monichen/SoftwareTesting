package Gradelink;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WatchDemo 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com");
	}
	
	@Test
	public void watchdemotest()
	{
		driver.get("https://www.gradelink.com/demo-b/");
		
		driver.findElement(By.id("input_105_2_3")).sendKeys("Anna");
		driver.findElement(By.id("input_105_2_6")).sendKeys("Gissele");
		
		WebElement YourRole=driver.findElement(By.xpath("//*[@id=\"input_105_1\"]"));
		Actions yr = new Actions(driver);
		yr.moveToElement(YourRole).perform();
		WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"input_105_1\"]/option[11]"));
		dropdownOption.click();
		
//		WebElement SelectCountry=driver.findElement(By.xpath("//*[@id=\"input_105_14_chosen\"]"));
//		Actions sc = new Actions(driver);
//		yr.moveToElement(SelectCountry).perform();
//		WebElement dropdownOption1 = driver.findElement(By.xpath(""));
//		dropdownOption1.click();
		
		driver.findElement(By.id("input_105_69")).sendKeys("Mount Zion School");
		driver.findElement(By.name("input_5")).sendKeys("annagissele@gmail.com");
		driver.findElement(By.id("input_105_4_raw")).sendKeys("1234567890");
		
		WebElement CurrentlyUse=driver.findElement(By.name("input_18"));
		Actions cu = new Actions(driver);
		yr.moveToElement(CurrentlyUse).perform();
		WebElement dropdownOption2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/article/div/div/div/div[1]/div[1]/div[2]/div/div/div/form/div[2]/div/div[6]/div/select/option[3]"));
		dropdownOption2.click();
		
		driver.findElement(By.id("gform_submit_button_105")).click();
		
		
		
		
	}

}
