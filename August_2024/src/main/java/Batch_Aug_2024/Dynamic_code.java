package Batch_Aug_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_code {
	
	public static WebDriver driver;
	
	public static void launch_browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
					
		}
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Launched browser is : "+ browser);
	}
		public static void hiturl(String url) {
			driver.get(url);
			System.out.println(driver.getTitle());
		}	
	public static void takescreenshot(String screenshot_name) throws Throwable	{
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File ("./Jeevansathi_javascript/"+screenshot_name+".png") ;
		 FileHandler.copy(Source, Target);
	} 
	
		 public static void screenshot(String ss_name) throws Throwable {
		 String projectpath = System.getProperty("user.dir");
		 
		 System.out.println("projectpath");
		 TakesScreenshot ts2 = (TakesScreenshot) driver ;
			File Source2 = ts2.getScreenshotAs(OutputType.FILE);
			File Target2 = new File ("Projectpath +//Evidences//"+ss_name+".png") ;
			 FileHandler.copy(Source2, Target2);
		 

	

	
	}

}