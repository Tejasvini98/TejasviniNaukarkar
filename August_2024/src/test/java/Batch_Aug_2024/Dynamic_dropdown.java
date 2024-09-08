package Batch_Aug_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_dropdown extends Dynamic_code{

	public static void main(String[] args) throws InterruptedException {
	launch_browser("chrome");
	hiturl("https://www.redbus.in/");
	
	WebElement from = driver.findElement(By.cssSelector("input#src"));
	from.sendKeys("Amravati");
	
	List<WebElement> frm_options  = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]"));

	Thread.sleep(3000);
	
	for(int a = 0; a<=frm_options.size();a++) {
		try {
			if(frm_options.get(a).getText().contains("Badnera")) {
				frm_options.get(a).click();
			}
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		}
	   // Thread.sleep(3000);
	
		}
	
	

}
