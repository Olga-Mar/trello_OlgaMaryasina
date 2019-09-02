package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase {

    @Test
    public void testTeamCreation(){
        Assert.assertTrue(isUserLoggedIn());

       // isUserLoggedIn();//user zaloginilsya
    }

    public boolean isUserLoggedIn() {

        return isElementPresent(By.cssSelector("[data-test-id='header-member-menu-button']"));//avatar

    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;//vernet tru
    }
}
