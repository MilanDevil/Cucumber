package org.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefi {
	WebDriver d;
	@Given("user has to enter {string},{string} and click login")
	public void user_has_to_enter_and_click_login(String string, String string2) {
	  WebDriverManager.chromedriver().setup();
	  d= new ChromeDriver();
	  d.get("https://adactinhotelapp.com/HotelAppBuild2/");
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	  d.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
	  d.findElement(By.xpath("//input[@id='login']")).click();
	}

	@When("select {string},{string},{string}")
	public void select(String string, String string2, String string3) {
	   d.findElement(By.xpath("//select[@id='location']")).sendKeys(string);
	   d.findElement(By.xpath("//select[@id='hotels']")).sendKeys(string2);
	   d.findElement(By.xpath("//select[@id='room_type']")).sendKeys(string3);
	   d.findElement(By.xpath("//input[@id='Submit']")).click();
	}

	@When("fillup the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void fillup_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  d.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	  d.findElement(By.xpath("//input[@id='continue']")).click();
	  d.findElement(By.xpath("//input[@id='first_name']")).sendKeys(string);
	  d.findElement(By.xpath("//input[@id='last_name']")).sendKeys(string2);
	  d.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string3);
	  d.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(string4);
	  d.findElement(By.xpath("//select[@id='cc_type']")).sendKeys(string5);
	  d.findElement(By.xpath("//select[@id='cc_exp_month']")).sendKeys(string6);
	  d.findElement(By.xpath("//select[@id='cc_exp_year']")).sendKeys(string7);
	  d.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys(string8);
	  d.findElement(By.xpath("//input[@id='book_now']")).click();
	}

	@Then("verify and print the oder id")
	public void verify_and_print_the_oder_id() throws InterruptedException {
	   d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	   WebElement oderid = d.findElement(By.xpath("//input[@id='order_no']"));
	   String value = oderid.getAttribute("value");
	System.out.println(value);
	}


}
