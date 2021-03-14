package org.samsung.pagefactory;

import org.baseutil.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyingpageFactory extends Baseclass{
	
	public BuyingpageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//strong[@class='pd-option-selector__main-text'])[1]")
	private WebElement yes;
	
	
	public WebElement getExchangeYes() {
		return yes;
				
	}
	
	@FindBy(xpath="(//button[@class='layer-popup__close'])[8]")
	private WebElement closevariablePopUP;
	
	public WebElement getclosevariablePopUP() {
		return closevariablePopUP;
				
	}
	
	@FindBy(xpath="//a[@title='ACCEPT']")
	private  WebElement Accept;	
	
	public  WebElement getAccept() {
		return Accept;
	
}}
