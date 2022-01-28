package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import support.HTMLReportGenerator;


public class Hookable
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("D:\\eveningbatchfinalproject2022\\Flipkart\\target\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getId());
		
		System.out.println("----------------------------Scenario start-------------------------------");
		
	}
	@After
	public void after(Scenario scenario)
	{
		System.out.println("----------------------------Scenario end----------------------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		
	}

}
