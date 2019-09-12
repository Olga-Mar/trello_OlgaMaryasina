package com.trello.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardsCreationTests extends TestBase {
    @BeforeClass
    public void ensurePreconditionsLogin(){
        if(!isUserLoggedIn()){
            login("marina.yasina@gmail.com", "SofiaAmalia2016");
        }
    }


    @Test
    public void testBoardCreationFromPlusButtonOnHeader(){
        int beforCreation=getPersnalBoardsCount();
        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        fillBoardCreationForm("First pankace","no");
        confirmBoardCreation();
        returnToHomePage();

        int afterCreation=getPersnalBoardsCount();
      Assert.assertEquals(afterCreation, beforCreation+1);
       // Assert.assertTrue(isUserLoggedIn());

    }

  public void fillBoardCreationForm(String boardName) {
        type(By.cssSelector("[data-test-id='header-create-board-title-input']"),boardName);
      //  click(By.cssSelector("[class='W6rMLOx8U0MrPx']")); //("[class='_1vk4y48RR5OmqE']"));
      //  click(By.cssSelector("[class='_1Lkx3EjS3wCrs7']"));
      //  click(By.cssSelector("[name='public']"));



    }
}
