package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.Reusable;

public class SelectHotelPojo extends Reusable{

	public SelectHotelPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="radio"),
		@FindBy(xpath="//input[@type='radio']")
	})
	private WebElement selectHotel;
	@FindBy(name="continue")
	private WebElement cont;
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getCont() {
		return cont;
	} 
	
}
