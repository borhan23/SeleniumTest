package com.keytorc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavsPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"myAccount\"]/div[3]/ul/li[1]/div/a/h4")
    private WebElement gotoFavsButton;

    @FindBy(id = "p-192637344")
    private WebElement favProduct;

    @FindBy(xpath = "//*[@id=\"p-192637344\"]/div[3]/span")
    private WebElement deleteFav;

    @FindBy(xpath = "/html/body/div[5]/div/div/span")
    private WebElement confirmDelete;

    public boolean isInitialized(){
        return gotoFavsButton.isDisplayed();
    }

    public boolean isInitializedFavs(){
        return favProduct.isDisplayed();
    }

    public boolean isInitializedConfirm(){
        return confirmDelete.isDisplayed();
    }

    public FavsPage(WebDriver driver) {
        super(driver);
    }

    public void ListFavs(){
        gotoFavsButton.click();
    }

    public void DeleteFav(){
        deleteFav.click();
    }

    public FavsPage ConfirmDelete(){
        confirmDelete.click();
        return new FavsPage(driver);
    }
}
