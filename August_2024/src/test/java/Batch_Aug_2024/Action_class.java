package Batch_Aug_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_class extends Dynamic_code{

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("Chrome");
		hiturl("https://jqueryui.com/");
		
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Draggable).click().build().perform();
		System.out.println("after click on draggable : " +driver.getTitle());
		//text enter
		WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		//right click
		act.moveToElement(Themes).contextClick().build().perform();
		//double click
		act.moveToElement(Themes).doubleClick().build().perform();
		
		//switch to frame
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		//offset
		
	WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
	act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
	
	Thread.sleep(3000);
	act.dragAndDropBy(slider, -300, 0).build().perform();
	
	driver.switchTo().defaultContent();
	
	WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
	act.moveToElement(Droppable).click().build().perform();
	System.out.println("after clicking on droppable:" + driver.getTitle());
	
	//drag and drop
	WebElement frame_1 = driver.findElement(By.xpath("//iframe[class@=\"demo-frame\"]"));
	driver.switchTo().frame(frame_1);
	WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	
	WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	
	act.moveToElement(drag).clickAndHold().moveToElement(drop).release();
	}
	
	

}


