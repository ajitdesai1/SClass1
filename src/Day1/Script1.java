package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	static WebDriver wd=null;
	static WebElement we=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\EclipseInstallFolder\\Softwares\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get("https://demo.borland.com/gmopost");
		String titleName=wd.getTitle();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//System.out.println(titleName);
		if (titleName.equalsIgnoreCase("Welcome to Green Mountain Outpost"))
		{
		System.out.println("PASS");
		}
		else{		
			System.out.println("FAIL");
		}
		
		wd.quit();

	}
	

}
