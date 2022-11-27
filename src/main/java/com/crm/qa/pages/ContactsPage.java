package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']") 
	WebElement contactsLabel;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="position")
	WebElement company;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel()
	{
		return contactsLabel.isDisplayed();
	}
		
	public void selectContactsByName(String name)
	{
		//driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='']//preceding-sibling::td[@class='']//input[@name='id']")).click();
	}
	
	
	public void createNewContact(String ftName, String ltName, String comp)
	{
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
		
	}
}
