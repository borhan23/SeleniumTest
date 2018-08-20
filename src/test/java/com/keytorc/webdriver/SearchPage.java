package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/section[2]/div[1]/div[1]")
    private WebElement resultControl;

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/a[2]")
    private WebElement secondPageButton;

    public boolean isInitialized(){
        String result = resultControl.getText();
        if(result.contains("sonuç bulundu")){
            return true;
        }else
        return false;
    }

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SecondPage GoToSecondPage(){
        secondPageButton.click();
        return new SecondPage(driver);
    }
}
