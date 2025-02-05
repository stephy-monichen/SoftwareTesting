package Gradelink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.browser.Browser;

public class TitleVerification
{
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.gradelink.com/");
	}
	
	@Test
	public void titletest()
	{
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle=actualtitle;
		
		if (actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	public void browserclose()
	{
		driver.close();
		
	}
	
}

