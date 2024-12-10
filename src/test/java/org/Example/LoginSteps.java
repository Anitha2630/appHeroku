package org.Example;

import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginSteps {
  private  WebDriver driver;
  private LoginPage loginPage;

  @BeforeClass
public void setUp(){
 driver = new ChromeDriver();
 driver.get("https://the-internet.herokuapp.com/login");
      loginPage = new LoginPage(driver);

  }
@Test
public void testLogin(){
loginPage.enterUsername("tomsmith");
loginPage.enterPassword("SuperSecretPassword!");
loginPage.clickLoginbutton();
String message = loginPage.getSuccessmessage();
assertTrue(message.contains("You logged into a secure area!"));

}
@AfterClass
public void tearDown() {
    driver.quit();
}

}
