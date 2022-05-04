package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    LoginPage loginpage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){;
        loginPage.clickOnforgottenPasswordLink();
        String expectedForgottenMessage = "Forgot Your Password?";
        String actualForgottenMessage = loginpage.getForgottenMessage();
        Assert.assertEquals(expectedForgottenMessage,actualForgottenMessage,"Forgot Your Password? Message Not Displayed correctly");
    }


}
