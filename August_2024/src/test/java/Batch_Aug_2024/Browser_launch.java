package Batch_Aug_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browser_launch {

	public static void main(String[] args) {
	
  //	WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.naaptol.com/");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	
	driver.findElement(By.id("gw-ftGr-desktop-hero-1"));
	
	driver.findElement(By.className("celwidget nav-sprite-v1"));
	
	driver.findElement(By.name("abc"));
	
	driver.findElement(By.linkText("Mobiles"));
	
	driver.findElement(By.linkText("Today's Deals"));
	
	driver.findElement(By.partialLinkText("Today's De"));
	
	driver.findElement(By.tagName("option"));
	
	//tagname#id
	driver.findElement(By.cssSelector("a#navBackToTop"));
	
	//tagname.class
	driver.findElement(By.cssSelector("div.navFooterBackToTop"));
	
	driver.findElement(By.cssSelector("div[role=\"navigation\"]"));
	
	
	System.out.println(driver.getTitle());
		
	//	driver.get("https://www.amazon.in/");
		
		driver.close();
		
	//	driver.navigate().to("");
	}

}
