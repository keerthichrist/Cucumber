package org.testdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tariff {
	
	static WebDriver driver;

@Given("user_telecom home page")
public void user_telecom_home_page() {
	
	 System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Seetha\\Addtariff\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
}

@Given("User clicks add tariff")
public void user_clicks_add_tariff() {
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
}

@When("complete all actions")
public void complete_all_actions(DataTable dataTable) {
	
	  List<String> td = dataTable.asList(String.class);
	  System.out.println(td);
	
	  driver.findElement(By.id("rental1")).sendKeys(td.get(0));
	  driver.findElement(By.id("local_minutes")).sendKeys(td.get(1));
	  driver.findElement(By.id("inter_minutes")).sendKeys(td.get(2));
	  driver.findElement(By.id("sms_pack")).sendKeys(td.get(3));
	  driver.findElement(By.id("minutes_charges")).sendKeys(td.get(4));
	  driver.findElement(By.id("inter_charges")).sendKeys(td.get(5));
	  driver.findElement(By.id("sms_charges")).sendKeys(td.get(6));
   
}

@When("give submit button")
public void give_submit_button() {
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
   
}

@Then("my confirmation page")
public void my_confirmation_page() {
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
   
}


}
/*
@Given("User is in telecom page")
public void user_is_in_telecom_page() {
	
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Seetha\\Addtariff\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
    
}

@Given("Add tariff plan is clicked")
public void add_tariff_plan_is_clicked() {
	
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
   
}

@When("Fill the details")
public void fill_the_details() {
	
	  driver.findElement(By.id("rental1")).sendKeys("5000");
	  driver.findElement(By.id("local_minutes")).sendKeys("5000");
	  driver.findElement(By.id("inter_minutes")).sendKeys("5000");
	  driver.findElement(By.id("sms_pack")).sendKeys("5000");
	  driver.findElement(By.id("minutes_charges")).sendKeys("5000");
	  driver.findElement(By.id("inter_charges")).sendKeys("5000");
	  driver.findElement(By.id("sms_charges")).sendKeys("5000");
    
}

@When("submit button")
public void submit_button() {
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
 
}

@Then("final confirmation page")
public void final_confirmation_page() {
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
   
}


*/

