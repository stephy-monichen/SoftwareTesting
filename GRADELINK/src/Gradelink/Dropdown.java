package Gradelink;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
ChromeDriver driver;

	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com/");
	}
	
	@Test
	public void dropdowntest()
	{
		WebElement WhyGradelink=driver.findElement(By.xpath("//*[@id=\"menu-item-64316\"]"));
		Actions wg = new Actions(driver);
		wg.moveToElement(WhyGradelink).perform();
		WebElement dropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-64317\"]/a"));
		dropdownOption.click();
		
		
		
		WebElement YourRole=driver.findElement(By.xpath("//*[@id=\"menu-item-64323\"]"));
		Actions yr = new Actions(driver);
		yr.moveToElement(YourRole).perform();
		WebElement dropdownOption1 = driver.findElement(By.xpath("//*[@id=\"menu-item-64324\"]/a"));
		dropdownOption1.click();
		
		WebElement Resources=driver.findElement(By.xpath("//*[@id=\"menu-item-64331\"]"));
		Actions re = new Actions(driver);
		re.moveToElement(Resources).perform();
		WebElement dropdownOption2 = driver.findElement(By.xpath("//*[@id=\"menu-item-64333\"]/a"));
		dropdownOption2.click();
		


	}

}
