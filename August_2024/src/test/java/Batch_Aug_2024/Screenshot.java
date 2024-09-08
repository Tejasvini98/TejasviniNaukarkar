package Batch_Aug_2024;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Dynamic_code {

	public static void main(String[] args) throws IOException {
		
	launch_browser("chrome");
	
	TakesScreenshot ts = (TakesScreenshot) driver ;
	File Source = ts.getScreenshotAs(OutputType.FILE);
	File Target = new File ("./Evidences/Browser_launched.png") ;
	 FileHandler.copy(Source, Target);
	
	hiturl("https://snapdeal.com/");
	
	TakesScreenshot ts1 = (TakesScreenshot) driver ;
	File Source1= ts1.getScreenshotAs(OutputType.FILE);
	File Target1 = new File ("./Evidences/snapdeal.png") ;
	 FileHandler.copy(Source1, Target1);
	 
	 // by using project path
	 String projectpath = System.getProperty("user.dir");
	 
	 System.out.println("projectpath");
	 TakesScreenshot ts2 = (TakesScreenshot) driver ;
		File Source2 = ts2.getScreenshotAs(OutputType.FILE);
		File Target2 = new File ("./Evidences/Search_product.png") ;
		 FileHandler.copy(Source2, Target2);
	 
	 
	 
	 
	 
	 
	 
	 
	 

	// To tell the webdrive take the screenshot
	// use take screenshot interface
	
	// with the help of ref.variable of takescreenshot interface use getscreenshot
	 // directly with foldername or file name
	
	
	 

	}

}
