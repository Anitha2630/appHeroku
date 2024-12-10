package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
//Locators for login page
By usernameField = By.id("username");
By passwordField = By.id("password");
By loginButton = By.xpath("//button[@type='submit']");
    private By successMessage = By.cssSelector(".flash.success");

//constructor to initialize webdriver
public LoginPage(WebDriver driver)
{ this.driver = driver;}
//Actions(methods)
public void enterUsername(String username)
{driver.findElement(usernameField).sendKeys(username);}

    public void enterPassword(String password)
    {driver.findElement(passwordField).sendKeys(password);}
public void clickLoginbutton(){driver.findElement(passwordField).click();}
public String getSuccessmessage(){return driver.findElement(successMessage).getText();}
    //Combine actions
public void login(String username, String password){
enterUsername(username);
enterPassword(password);
clickLoginbutton();
}
}
