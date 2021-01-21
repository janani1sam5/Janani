package facebookLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] arg)
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VedhuSudhu\\eclipse-workspace\\facebookLogin\\src\\facebookLogin\\chromedriver.exe");
		driver.get("https://www.amazon.com");
		System.out.println("Pass");
		
		
	}

}
