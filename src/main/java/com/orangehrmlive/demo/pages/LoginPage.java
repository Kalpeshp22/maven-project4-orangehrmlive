package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginTxtBox = By.id("txtUsername");
    By passwordTxtBox = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");
    By welcomeMessage = By.partialLinkText("Welcome");
    By forgottenPasswordLink = By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']");
    By forgottenMessage = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");
    public void enterUsername(String username){
        sendTextToElement(loginTxtBox,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTxtBox,password);
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
    }
    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }
    public void clickOnforgottenPasswordLink(){
        clickOnElement(forgottenPasswordLink);
    }
    public String getForgottenMessage(){
        return getTextFromElement(forgottenMessage);
    }
}


