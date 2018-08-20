package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMainPage extends PageObject {

    @FindBy(id="searchData")
    private WebElement searchArea;

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div[2]/div[1]/a")
    private WebElement searchButton;

    public boolean isInitialized() {
        return searchArea.isDisplayed();
    }

     public LoginMainPage(WebDriver driver) {
        super(driver);
    }

    public void FillSearchArea(String searchData){
        this.searchArea.clear();
        this.searchArea.sendKeys(searchData);
    }

    public SearchPage Search(){
        searchButton.click();
        return new SearchPage(driver);
    }
}
