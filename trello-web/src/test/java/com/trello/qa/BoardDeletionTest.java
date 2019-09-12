package com.trello.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase {

    @BeforeClass
    public void ensurePreconditionsLogin() {
        if (!isUserLoggedIn()) {
            login("marina.yasina@gmail.com", "SofiaAmalia2016");
        }
    }


    // @Test
    // public void deletionBoardTest() throws InterruptedException {
    //     int before = getPersnalBoardsCount();
    //      clickOnFirstPrivateBoard();
    //      Thread.sleep(10000);
    //     clickOnMoreButtonInBoardMenu();
    //  initCloseBoard();
    //..


    //   int after = getPersnalBoardsCount();
    // }
    @Test
    public void deletionBoardTest() { //throws InterruptedException {
        int before = getPersnalBoardsCount();
        clickOnFirstPrivateBoard();
        // Thread.sleep(10000);
        clickOnMoreButtonInBoardMenu();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".board-menu-navigation-item-link.js-close-board")));
        click(By.cssSelector(".board-menu-navigation-item-link.js-close-board"));
        click(By.cssSelector(".js-confirm.full.negate"));
        click(By.cssSelector(".quiet.js-delete"));
        click(By.cssSelector(".js-confirm.full.negate"));
        returnToHomePage();//test prohodit,no ne vozvrasshaetsa na homepage
        int after = getPersnalBoardsCount();
        Assert.assertEquals(after, before-1);
    }

    public void clickOnMoreButtonInBoardMenu() {
        WebElement menuButton = driver.findElement(By.cssSelector(".board-header-btn.mod-show-menu"));
        System.out.println(menuButton.getCssValue("visibility"));
        if (menuButton.getCssValue("visibility").equals("visible")) {
            click(By.cssSelector(".mod-show-menu"));
            click(By.cssSelector(".js-open-more"));
        } else {
            click(By.cssSelector(".js-open-more"));
        }

    }

    public void clickOnFirstPrivateBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"));
    }


}