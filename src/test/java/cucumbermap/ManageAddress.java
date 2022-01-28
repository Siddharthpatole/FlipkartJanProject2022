package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.HTMLReportGenerator;
import support.Seleniumoperation;

public class ManageAddress 
{
	@When("user click on manage addresses")
	public void user_click_on_manage_addresses()
	{
	   Object[] input=new Object[1];
	   input[0]="(//*[@class='NS64GK'])[1]";
	   Hashtable<String, Object> output=Seleniumoperation.clickonelement(input);
	   
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on manage addresses", output.get("MESSAGE").toString());
	}

	@When("user click on add a new address")
	public void user_click_on_add_a_new_address()
	{
		Object[] input1=new Object[1];
		input1[0]="//*[@class='_1QhEVk']";
		Hashtable<String, Object> output1=Seleniumoperation.clickonelement(input1);
		
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user click on add a new address", output1.get("MESSAGE").toString());
	}

	@When("user enter {string} as name")
	public void user_enter_as_name(String string) 
	{
		Object[] input2=new Object[2];
		input2[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input2[1]="Sid Patole";
		Hashtable<String, Object> output2=Seleniumoperation.username(input2);
		
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user enter {string} as name", output2.get("MESSAGE").toString());
	}

	@When("user enter {string} as mobile number")
	public void user_enter_as_mobile_number(String string) 
	{
		Object[] input3=new Object[2];
		input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input3[1]="8668631972";
		Hashtable<String, Object> output3=Seleniumoperation.username(input3);
		
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user enter {string} as mobile number", output3.get("MESSAGE").toString());
	}

	@When("user enter {string} as pincode")
	public void user_enter_as_pincode(String string) 
	{
		Object[] input4=new Object[2];
		input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input4[1]="414001";
		Hashtable<String, Object> output4=Seleniumoperation.username(input4);
		
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user enter {string} as pincode", output4.get("MESSAGE").toString());
	}

	@When("user enter {string} as locality")
	public void user_enter_as_locality(String string)
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input5[1]="Savedi";
		Hashtable<String, Object> output5=Seleniumoperation.username(input5);
		
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user enter {string} as locality", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as address")
	public void user_enter_as_address(String string) 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@name='addressLine1']";
		input6[1]="Zopadi Cantene";
		Hashtable<String, Object> output6=Seleniumoperation.username(input6);
		
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user enter {string} as address", output6.get("MESSAGE").toString());
	}

	@When("user select Home as address type")
	public void user_select_home_as_address_type()
	{
		Object[] input7=new Object[1];
		input7[0]="(//*[@class='_1XFPmK'])[1]";
		Hashtable<String, Object> output7=Seleniumoperation.clickonelement(input7);
		
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user select Home as address type", output7.get("MESSAGE").toString());
	}

	@When("user click on Save button")
	public void user_click_on_save_button() 
	{
		Object[] input8=new Object[1];
		input8[0]="(//*[@type='button'])[2]";
		Hashtable<String, Object> output8=Seleniumoperation.clickonelement(input8);
		
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"user click on Save button", output8.get("MESSAGE").toString());
	}

	@Then("Application shows new adddress added successfully")
	public void application_shows_new_adddress_added_successfully() throws Throwable 
	{
		Object[] input9=new Object[2];
		input9[0]="//*[text()='Sid Patole']";
		input9[1]="Sid Patole";
		Hashtable<String, Object> output9=Seleniumoperation.validation(input9);
	    
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"Application shows new adddress added successfully", output9.get("MESSAGE").toString());
	}


}
