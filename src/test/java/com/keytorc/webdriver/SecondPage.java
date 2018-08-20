package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {

    @FindBy(name = "currentPage")
    private WebElement pageControlText;

    @FindBy(xpath = "//*[@id=\"p-192637344\"]/div[2]/span[2]")
    private WebElement favProductButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[1]")
    private WebElement profileButton;

    public boolean isInitialized(){
        String page = pageControlText.getText();
        if(page.contains("2"))
            return true;
        else
            return false;
    }

    public SecondPage(WebDriver driver) {
        super(driver);
    }

    public void AddFav(){
        favProductButton.click();
    }

    public ProfilePage GoToProfile(){
        profileButton.click();
        return new ProfilePage(driver);
    }

}
