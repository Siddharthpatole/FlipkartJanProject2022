package support;

public class Temp2
{
	public static void main(String[] args) throws Throwable
	{
		//browserLaunch
		Object[] input=new Object[2];
				input[0]="Chrome";
				input[1]="E:\\Automation Support\\chromedriver.exe";
				Seleniumoperation.browserLaunch(input);
	 
				//open url
				Object[] input1=new Object[1];
				         input1[0]="https://www.flipkart.com/";
				         Seleniumoperation.openApplication();
				         
				  //click on cancel
				  Object[] input2=new Object[1];
				  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
				  Seleniumoperation.clickonelement(input2);
				  Thread.sleep(4000);
				  
				  //move to element
				  Object[] input3=new Object[1];
				  input3[0]="//*[@class='_28p97w']";
				  Seleniumoperation.moveonelement(input3);
				  
				  //click on my profile
				  Object[] input4=new Object[1];
				  input4[0]="//*[@class='_2kxeIr _1pY_1Z'][1]";
				  Seleniumoperation.clickonelement(input4);
				  
				  //enteremail
				  Object[] input5=new Object[2];
				  input5[0]="//*[@class='_2IX_2- VJZDxU']";
				  input5[1]="9527895955";
				  Seleniumoperation.username(input5);
				  
				  //enterpass
				  Object[] input6=new Object[2];
				  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
				  input6[1]="sidpatole123";
				  Seleniumoperation.username(input6);
				  
				  //login
				  Object[] input7=new Object[1];
				  input7[0]="(//*[@type='submit'])[2]";
				  Seleniumoperation.clickonelement(input7);
				  
				  //validation
				  Object[] input8=new Object[2];
				  input8[0]="//*[text()='Hello']";
				  input8[1]="Hello";
				  Seleniumoperation.validation(input8);
				  
				  
				  
				
				
				
				
				
				
				
				
				
		}
	

}
