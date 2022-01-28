package cucumbermap;



import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.HTMLReportGenerator;
import support.Seleniumoperation;


public class Logincucu 
{
	@Given ("^user open \"(.*)\" browser with exe$")
	public void user_open_browser_with_exe(String bname) throws Throwable
	{
		Object [] input=new Object[1];
        input[0]=bname;
        
        Seleniumoperation.browserLaunch(input);
	}

	@Given ("^user enter url as$")
	public void user_enter_url_as() throws Throwable
	{
		
        Seleniumoperation.openApplication();
	}

	@When("user click on cancel button")
	public void user_click_on_cancel_button() throws Throwable 
	{
		 Object[] input2=new Object[1];
		  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  Hashtable<String, Object> output2=Seleniumoperation.clickonelement(input2);
		 HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user click on cancel button", output2.get("MESSAGE").toString());
		  Thread.sleep(4000);
	}

	@When("user move on Login DropDown")
	public void user_move_on_login_drop_down() 
	{
		 Object[] input3=new Object[1];
		  input3[0]="//*[@class='_28p97w']";
		  Hashtable<String, Object> output3=Seleniumoperation.moveonelement(input3);
		  HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user move on Login DropDown" , output3.get("MESSAGE").toString());
	}

	@When("user click on My Profile")
	public void user_click_on_my_profile() throws Throwable 
	{
		 Object[] input4=new Object[1];
		  input4[0]="//*[@class='_2kxeIr _1pY_1Z'][1]";
		  Hashtable<String, Object> output4= Seleniumoperation.clickonelement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on My Profile", output4.get("MESSAGE").toString());
		  Thread.sleep(4000);
	}

	@When ("^user enter username as (.*)$")
	public void user_enter_username_as(String string)
	{
		Object[] input5=new Object[2];
		  input5[0]="//*[@class='_2IX_2- VJZDxU']";
		  input5[1]=string;
		  Hashtable<String, Object> output5=Seleniumoperation.username(input5);
		  HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter username as {string}", output5.get("MESSAGE").toString());
	}

	@When ("^user enter password as (.+)$")
	public void user_enter_password_as(String string) 
	{
		 Object[] input6=new Object[2];
		  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		  input6[1]=string;
		  Hashtable<String, Object> output6=Seleniumoperation.username(input6);
		  HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter password as {string}", output6.get("MESSAGE").toString());
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		Object[] input7=new Object[1];
		  input7[0]="(//*[@type='submit'])[2]";
		  Hashtable<String, Object> output7=Seleniumoperation.clickonelement(input7);
		  HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user enter password as {string}", output7.get("MESSAGE").toString());
	}

	@Then("user will login successfully")
	public void user_will_login_successfully() throws Throwable
	{
		Object[] input8=new Object[2];
		  input8[0]="//*[text()='Hello']";
		  input8[1]="Hello";
		  Hashtable<String, Object> output8=Seleniumoperation.validation(input8);
		  HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user enter password as {string}", output8.get("MESSAGE").toString());
	}

}
