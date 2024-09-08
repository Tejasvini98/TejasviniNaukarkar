package Batch_Aug_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		//click
	WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	Searchbox.click();
	
	//sendkeys
	Searchbox.sendKeys("Mobiles");
	
	Thread.sleep(3000);
	//clear
	Searchbox.clear();
	
	Searchbox.sendKeys("Books");
	
	//getattribute
	System.out.println(Searchbox.getAttribute("value"));
	
	//getlocation
	System.out.println("The x coordinate of Searchbox lies on the :" + Searchbox.getLocation().x);
	System.out.println("The y coordinate of Searchbox lies on the :" +Searchbox.getLocation().y);
	
	//getsize
	System.out.println("The size of Searchbox is :"+ Searchbox.getSize());
	
	//gettagname
	System.out.println(Searchbox.getTagName());
	
	//is displayed
	//is selected
	//is enabled
	
	//get text
//	System.out.println(Searchbox.getText());

	}

}
