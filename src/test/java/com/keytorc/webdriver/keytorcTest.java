package com.keytorc.webdriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class keytorcTest extends ChromeSelenium{

    @Test
    public void chromeTest(){

        MainPage mainPage = new MainPage(driver);
        assertTrue(mainPage.isInitialized());
        mainPage.login();

        GoToLogin goToLogin= new GoToLogin(driver);
        assertTrue(goToLogin.isInitialized());
        goToLogin.enterInformation("garnet9623@gmail.com","123456789asd" );
        goToLogin.successLogin();

        LoginMainPage loginMainPage = new LoginMainPage(driver);
        assertTrue(loginMainPage.isInitialized());
        loginMainPage.FillSearchArea("samsung");
        loginMainPage.Search();

        SearchPage searchPage = new SearchPage(driver);
        assertTrue(searchPage.isInitialized());
        searchPage.GoToSecondPage();

        SecondPage secondPage = new SecondPage(driver);
        assertTrue(searchPage.isInitialized());
        secondPage.AddFav();
        secondPage.GoToProfile();

        ProfilePage profilePage = new ProfilePage(driver);
        assertTrue(profilePage.isInitialized());
        profilePage.GoToFavs();

        FavsPage favsPage = new FavsPage(driver);
        assertTrue(favsPage.isInitialized());
        favsPage.ListFavs();
        assertTrue(favsPage.isInitializedFavs());
        favsPage.DeleteFav();
        assertTrue(favsPage.isInitializedConfirm());
        favsPage.ConfirmDelete();
        assertFalse(favsPage.isInitializedFavs());

        driver.close();

        driver.quit();
    }
}
