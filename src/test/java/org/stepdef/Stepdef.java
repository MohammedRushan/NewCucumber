package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	WebDriver driver;

	@Given("user is on Facebook Page #url -->Predefined")
	public void user_is_on_Facebook_Page_url_Predefined() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@When("user need to enter Username and Password")
	public void user_need_to_enter_Username_and_Password() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Rushan");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Rushan");
	}

	@When("user need to click Login Button")
	public void user_need_to_click_Login_Button() {
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();

	}

	@Then("user need to validate")
	public void user_need_to_validate() {
		System.out.println("Login successfully");
	}

}
