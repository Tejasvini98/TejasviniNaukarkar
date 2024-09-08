package Batch_Aug_2024;

	import java.awt.Window;
	import java.time.Duration;

	import javax.swing.JScrollBar;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.JavascriptExecutor;

	import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.AtFixedRate;

	public class Task_1 {
		
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
		
			
			// to enter text using action class
			public static Actions at = new Actions(driver);

				public static void Action_text(WebElement Web_element, String text) {

					at.moveToElement(Web_element).click().sendKeys(text).build().perform();
				}
				
			//to select, copy/paste
			public static void copy_text() {

					at.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

					at.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			}

				public static void Paste_text() {

					at.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

				}
		  // rightclick
			public static void right_click(WebElement Elementname) {
		
			at.moveToElement(Elementname).contextClick().build().perform();


				}
			
					
			//double click
			public static void DoubleClick(WebElement Element) {
			at.moveToElement(Element).doubleClick().build().perform();
				}
			
			//drag and drop
			public static void dragAnddrop(WebElement Source,WebElement Target) {
					 at.dragAndDrop(Source, Target).build().perform();
				}
			
			//To move Slider by certain Offset
			public static void MoveSlider(WebElement ElementName1,int x,int y) {
				at.moveToElement(ElementName1).dragAndDrop(ElementName1, ElementName1);
			}
			
			//Switch to Frame
			public static void SwitcToFrame(WebElement frame) {
				driver.switchTo().frame(frame);
			}
			//back to Window
			public static void backToWindow() {
				driver.switchTo().defaultContent();
			}
			
			//To  backWard
			public static void Backward() {
			driver.navigate().back();
			}
			
			//To forward
			public static void forward() {
			driver.navigate().forward();
			}
			
			//To refresh
			public static void refresh() {
			driver.navigate().refresh();
			}
			
			// Scroll by offset

			public static JavascriptExecutor js = (JavascriptExecutor) driver;

			public static void Scroll_by_offset(int j, int k) {
				
			js.executeScript("window.scrollBy"+"("+ j + ","+ k + ")");
			}
			
			//To Scroll at Bottom
			public static void Scroll_bottom() {
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			}
			
			//To Scroll using PageDown Key
			public static void PageDown_Scroll() {
				at.keyDown(Keys.PAGE_DOWN).build().perform();
			}
			
			//To Scroll using PageUp Key
			public static void PageUp_Scroll() {
				at.keyDown(Keys.PAGE_UP).build().perform();
			}
			




	}


