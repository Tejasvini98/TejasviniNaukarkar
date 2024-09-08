package Batch_Aug_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		Searchbox.sendKeys("Books");
		
		System.out.println(Searchbox.getAttribute("value"));
		
		driver.findElement(By.id("nav-search")).click();
		
		System.out.println("Title after search :"+ driver.getTitle());
		

	}

}
