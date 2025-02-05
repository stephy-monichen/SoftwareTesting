package Gradelink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navbar 
{
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com/");
		
	}
	
	@Test
	public void navbartest()
	{
		driver.findElement(By.xpath("//*[@id=\"menu-secondary\"]/li")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu-item-64323\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu-item-64331\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu-item-64436\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"et-boc\"]/header/div/div[2]/div/div[3]/div/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"menu-item-64338\"]")).click();
		driver.navigate().back();
		
	}
	
	@After()
	public void browserclose()
	{
		driver.close();
	}

}
