package Batch_Aug_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_page extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		takescreenshot("Browser launch");
		
		hiturl("https://www.jeevansathi.com/");
		takescreenshot("Jeevansathi Webpage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		takescreenshot("Scroll by 700");
		
		js.executeScript("window.scrollBy(0,-700)");
		takescreenshot("scroll by -700");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takescreenshot("Scroll to bottom");
		
		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		System.out.println("Title after click :"+ driver.getTitle());
		takescreenshot("after About us");
		
		// Navigate backward
		js.executeScript("window.history.back()");
		takescreenshot("back to jeevansathi page");
		
		// Navigate forward
		js.executeScript("window.history.forward()");
		takescreenshot("forward to about us");
		
		// Refresh
		js.executeScript("window.history.go(0)");
		
		driver.close();
		

	}

}
