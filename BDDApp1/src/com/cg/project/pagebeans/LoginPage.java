package com.cg.project.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,id="login_field")
	private WebElement username;
	@FindBy(how=How.ID,id="password")	
	private WebElement password;
	@FindBy(how=How.ID,id="btn")	
	private WebElement button;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")	
	// "//div[@class='container']\""
	private WebElement actualErrorMessage;
	
	public LoginPage() {}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}

	public WebElement getActualErrorMessage() {
		return actualErrorMessage;
	}

	public void setActualErrorMessage(WebElement actualErrorMessage) {
		this.actualErrorMessage = actualErrorMessage;
	}

	public LoginPage(WebElement username, WebElement password, WebElement button, WebElement actualErrorMessage) {
		super();
		this.username = username;
		this.password = password;
		this.button = button;
		this.actualErrorMessage = actualErrorMessage;
	}
	
	
}
