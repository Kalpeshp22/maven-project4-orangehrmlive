package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginpage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginpage.enterUsername("admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginBtn();
        String expectedMessage = "Welcome Paul";
        String actualMessage = loginpage.getWelcomeMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Welcome message not displayed");
    }


}
