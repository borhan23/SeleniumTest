package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"myAccount\"]/div[1]/div[1]/div[2]/ul/li[6]/a")
    private WebElement favsButton;

    public boolean isInitialized(){
        return favsButton.isDisplayed();
    }

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public FavsPage GoToFavs(){
        favsButton.click();
        return new FavsPage(driver);
    }
}
