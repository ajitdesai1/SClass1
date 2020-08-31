package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	static WebDriver wd=null;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseInstallFolder\\Softwares\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		//wd.findElement(By.xpath("//input[@name="q"]"))
		wd.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//wd.findElement(By.xpath("//input[@value='Google Search']")).click();
		wd.findElement(By.xpath("//ul[@role='listbox']")).click();
		//wd.quit();
		
		
	}
	
	
	}

