package org.testdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tariffmap {
	static WebDriver driver;

@Given("The user is using telecom home page")
public void the_user_is_using_telecom_home_page() {
	
	 System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Seetha\\Addtariff\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
  
}

@Given("User will click add tariff")
public void user_will_click_add_tariff() {
	
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
    
}

@When("user have to fill the details")
public void user_have_to_fill_the_details(DataTable dataTable) {
	
	  Map<String,String> td = dataTable.asMap(String.class,String.class);
	  System.out.println(td);
	
	  driver.findElement(By.id("rental1")).sendKeys(td.get("MonthlyRent"));
	  driver.findElement(By.id("local_minutes")).sendKeys(td.get("Freelocalmins"));
	  driver.findElement(By.id("inter_minutes")).sendKeys(td.get("Intermins"));
	  driver.findElement(By.id("sms_pack")).sendKeys(td.get("FreeSMS"));
	  driver.findElement(By.id("minutes_charges")).sendKeys(td.get("LocalPM"));
	  driver.findElement(By.id("inter_charges")).sendKeys(td.get("InterPM"));
	  driver.findElement(By.id("sms_charges")).sendKeys(td.get("SMSPercharge"));
 
}

@When("submit")
public void submit() {
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
    
}

@Then("success")
public void success() {
	
	Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
   
}



}
