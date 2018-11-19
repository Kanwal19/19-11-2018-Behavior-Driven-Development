package com.cg.project.stepdefinitiongithub;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubLoginStepDefinition {
	private WebDriver driver;

	@Given("^User is on GitHub Login Page$")
	public void user_is_on_GitHub_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://github.com/login");
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		By user = By.name("login");
		WebElement loginField = driver.findElement(user);
		loginField.sendKeys("Harkanwalpreet");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		By password = By.name("password");
		WebElement passwordField = driver.findElement(password);
		passwordField.sendKeys("sahil13@3");

		By submit = By.name("commit");
		WebElement submitButton = driver.findElement(submit);
		submitButton.submit();
	}

	@Then("^Open user's GitHub account Page$")
	public void open_user_s_GitHub_account_Page() throws Throwable {
		String actualUser =driver.findElement(By.name("user-login")).getAttribute("content");
		String expectedUser = "Harkanwalpreet";
		Assert.assertEquals(expectedUser, actualUser);
		driver.close();
	}

	@When("^User enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		By user = By.name("login");
		WebElement loginField = driver.findElement(user);
		loginField.sendKeys("Harkanwalpreet");
	}

	@When("^User enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		By password = By.name("password");
		WebElement passwordField = driver.findElement(password);
		passwordField.sendKeys("1234");

		By submit = By.name("commit");
		WebElement submitButton = driver.findElement(submit);
		submitButton.submit();
	}

	@Then("^Show Error Invalid Username/Password$")
	public void show_Error_Invalid_Username_Password() throws Throwable {
		String actualErrorField = driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getAttribute("container");
		String expectedErrorField ="Incorrect username or password.";
		Assert.assertEquals(expectedErrorField, actualErrorField);
		driver.close();
	}
}
