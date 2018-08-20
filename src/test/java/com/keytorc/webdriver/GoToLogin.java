package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToLogin extends PageObject{

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id="loginButton")
    private WebElement loginButton;

    public boolean isInitialized() {
        return email.isDisplayed();
    }

    public GoToLogin(WebDriver driver) {
        super(driver);
    }

    public void enterInformation(String email, String password){
        this.email.clear();
        this.email.sendKeys(email);

        this.password.clear();
        this.password.sendKeys(password);
    }

    public LoginMainPage successLogin(){
        loginButton.click();
        return new LoginMainPage(driver);
    }

}
