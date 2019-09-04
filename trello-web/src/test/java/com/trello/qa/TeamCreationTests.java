package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase {

    @Test
    public void testTeamCreation() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(isUserLoggedIn());

       // isUserLoggedIn();//user zaloginilsya
    }

}
