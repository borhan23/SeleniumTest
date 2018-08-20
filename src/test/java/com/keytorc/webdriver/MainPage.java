package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(id="header")
    private WebElement header;

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]")
    private WebElement loginText;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return header.isDisplayed();
    }

    public GoToLogin login(){
        loginText.click();
        return new GoToLogin(driver);
    }
}
