package Gradelink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo 
{
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com/");
	}
	
	@Test
	public void logotest()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"et-boc\"]/header/div/div[2]/div/div[1]/div/a/span/img"));
		
		if (logo.isDisplayed()) 
		{
            System.out.println("✅ Logo is displayed.");
        } 
		else 
		{
            System.out.println("❌ Logo is NOT displayed.");
        }
		
	}

	@After
	public void browserclose()
	{
		driver.close();
		
	}

}
