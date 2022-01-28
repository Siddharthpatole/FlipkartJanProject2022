package support;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class Seleniumoperation 
{
	public static ConfigReader config=null;

	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	 
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	{
		try {
			
			config=new ConfigReader();
			
		String strBrowserName=(String) inputParameters[0];
		
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(strBrowserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", config.getDriverPathFF());
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data :" + inputParameters[0].toString());//ethe
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data :" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//open url
	public static Hashtable<String,Object> openApplication()
	{
		try {
		
		driver.get(config.getApplicationUrl());
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data :" + config.getApplicationUrl().toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data :" + config.getApplicationUrl().toString());
		}
		return outputParameters;
		}
	
	//click on element
	public static Hashtable<String,Object> clickonelement(Object[] inputParameters)
	{
		try {
		Thread.sleep(5000);	
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
	
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickonelement, Input_Data :" + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickonelement, Input_Data :" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//move on element
	public static Hashtable<String,Object> moveonelement(Object[] inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:moveonelement, Input_Data :" + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:moveonelement, Input_Data :" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//enter username
	public static Hashtable<String,Object> username(Object[] inputParameters)
	{
		try {
		String user=(String) inputParameters[0];
		String pass=(String) inputParameters[1];
	driver.findElement(By.xpath(user)).sendKeys(pass);
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:username, Input_Data :" + inputParameters[1].toString());
	
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:username, Input_Data :" + inputParameters[1].toString());
		}
	return outputParameters;
	}
	
	//test case 
	public static Hashtable<String,Object> validation(Object[] inputParameters) throws Throwable
	{
		try {
		Thread.sleep(4000);
		String text=(String) inputParameters[0];
		WebElement obj=driver.findElement(By.xpath(text));
		String validtext=obj.getText();
		
		String imp=(String) inputParameters[1];
		
		if(validtext.equalsIgnoreCase(imp))

	{
			System.out.println("Test Case Passed");
	}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:validation, Input_Data :" + inputParameters[0].toString());
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:validation, Input_Data :" + inputParameters[0].toString());
		}
		return outputParameters;
	} 
	
	
	
	
	
	
		public static void main(String[] args) throws Throwable
		{
			//browserLaunch
			Object[] input=new Object[2];
					input[0]="Chrome";
					input[1]="E:\\Automation Support\\chromedriver.exe";
					browserLaunch(input);
		 
					//open url
					Object[] input1=new Object[1];
					         input1[0]="https://www.flipkart.com/";
					         openApplication();
					         
					  //click on cancel
					  Object[] input2=new Object[1];
					  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
					  clickonelement(input2);
					  Thread.sleep(4000);
					  
					  //move to element
					  Object[] input3=new Object[1];
					  input3[0]="//*[@class='_28p97w']";
					  moveonelement(input3);
					  
					  //click on my profile
					  Object[] input4=new Object[1];
					  input4[0]="//*[@class='_2kxeIr _1pY_1Z'][1]";
					  clickonelement(input4);
					  Thread.sleep(4000);
					  
					  //enteremail
					  Object[] input5=new Object[2];
					  input5[0]="//*[@class='_2IX_2- VJZDxU']";
					  input5[1]="9527895955";
					  username(input5);
					  
					  //enterpass
					  Object[] input6=new Object[2];
					  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
					  input6[1]="sidpatole123";
					  username(input6);
					  
					  //login
					  Object[] input7=new Object[1];
					  input7[0]="(//*[@type='submit'])[2]";
					  clickonelement(input7);
					  
					  //validation
					  Object[] input8=new Object[2];
					  input8[0]="//*[text()='Hello']";
					  input8[1]="Hello";
					  validation(input8);
					  
					  
					
					
					
					
					
					
					
					
					
			}
		
		
		
	}


