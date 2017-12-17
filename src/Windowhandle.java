import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Windowhandle {
WebDriver driver;
String browserName="FF";
@Test
	public void initialization() {
	System.out.println("steped into initialisation method");
	if (browserName.equals("chrome")) {
		System.out.println("setting the properties");
		System.setProperty("webdriver.chrome.driver",
				"src\\main\\java\\com\\Cucumber\\AutomationPractice\\config\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if (browserName.equals("FF")) {
		System.setProperty("webdriver.gecko.driver",
				"src\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
		
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
		/*WebElement dress=*/
				driver.findElement(By.className("replace-2x img-responsive")).click();
				driver.findElement(By.linkText("Add to cart")).click();
			//	parent window
				String win1=driver.getWindowHandle();
				//childwindow
			Set<String> win2=driver.getWindowHandles();
			 for(String windowHandle  : win2)
		       {
		       if(!windowHandle.equals(win1))
		          {
		          driver.switchTo().window(windowHandle);
		     //    <!--Perform your operation here for new window-->
		          driver.findElement(By.className("btn btn-default button button-medium")).click();
		        
		         driver.switchTo().window(win1); //cntrl to parent window
		          }}}}
		       

