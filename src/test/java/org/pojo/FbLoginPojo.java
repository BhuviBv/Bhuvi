package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends Baseclass {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}

		

	

