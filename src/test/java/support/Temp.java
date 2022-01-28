package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");  //site
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();  //click on cancel
	
		Actions act=new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		act.moveToElement(login).build().perform();
		
	
	
	
	
	
	
	
	
	
	
	}

}
