package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardsCreationTests extends TestBase {

    @Test
    public void testBoardCreationFromPlusButtonOnHeader(){
        clickOnPlusButtonOnHeader();
        selectCreateTeamFromDropDown();
        AddTitleOnCreationBord("First pancake");
        ClickOnCreationBoardButton();
        //Assert
        Assert.assertTrue(isUserLoggedIn());

    }

    private void ClickOnCreationBoardButton() {
        click(By.cssSelector("[type='button']"));


    }

    private void AddTitleOnCreationBord(String boardName) {
        type(By.cssSelector("[data-test-id='header-create-board-title-input']"),boardName);
      //  click(By.cssSelector("[class='W6rMLOx8U0MrPx']")); //("[class='_1vk4y48RR5OmqE']"));
      //  click(By.cssSelector("[class='_1Lkx3EjS3wCrs7']"));
      //  click(By.cssSelector("[name='public']"));

    }

    private void selectCreateTeamFromDropDown() {
        click(By.cssSelector("[data-test-id='header-create-board-button']"));
    }

    private void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[data-test-id='header-create-menu-button']"));
    }
}
