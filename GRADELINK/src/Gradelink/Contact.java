package Gradelink;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact 
{
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com/contact-3/");
	}
	
	@Test
	public void test()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"post-207\"]/div/div/div/div[2]/div/div[1]/div[1]/div/p/a")).click();
		WebElement firstnameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("input_7.3")));
        firstnameField.sendKeys("Stephy");
        WebElement lastnameField = driver.findElement(By.name("input_7.6")); 
        lastnameField.sendKeys("Monichen");
        WebElement emailField = driver.findElement(By.name("input_3"));
        emailField.sendKeys("stephychristin7@gmail.com");
        WebElement subjectField = driver.findElement(By.name("input_4"));
        subjectField.sendKeys("Info");    
        WebElement messageField = driver.findElement(By.id("input_87_5"));
        messageField.sendKeys("Details");
        WebElement schoolidField = driver.findElement(By.id("input_87_5"));
        schoolidField.sendKeys("MZ1");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"gform_submit_button_87\"]"));
        submitButton.click();

        
	}

	
}
