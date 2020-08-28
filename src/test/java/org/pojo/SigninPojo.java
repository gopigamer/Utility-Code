package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.Reusable;

public class SigninPojo extends Reusable{

	public SigninPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement pssword;
	@FindBy(id="login")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPssword() {
		return pssword;
	}
	public WebElement getLogin() {
		return login;
	}
}
