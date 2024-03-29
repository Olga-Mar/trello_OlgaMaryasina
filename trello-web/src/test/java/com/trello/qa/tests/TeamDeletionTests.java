package com.trello.qa.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
    @BeforeMethod
    public void precoditions(){
        if(!app.getTeamHelper().isTeamsPresent()){
            app.getTeamHelper().createTeam();
        }
    }
    @Test
    public void deleteTeamFromLeftNavMenu() throws InterruptedException {
        int before = app.getTeamHelper().getTeamsCount();
        app.getTeamHelper().clickOnFirstTeam();
        app.getTeamHelper().openSettings();
        app.getTeamHelper().deleteTeam();
        app.getTeamHelper().returnToHomePage();
       app.getTeamHelper().refreshPage();

        int after = app.getTeamHelper().getTeamsCount();
        Assert.assertEquals(after, before - 1);


    }


}
//package com.trello.qa.tests;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TeamDeletionTests extends TestBase {
   // @BeforeClass
//  public void ensurePreconditionsLogin(){
   //     if(!app.getSessionHelper().isUserLoggedIn()){
//            app.getSessionHelper().login("marina.yasina@gmail.com", "SofiaAmalia2016");
//        }
//    }

//    @BeforeMethod
//    public void precodition(){
//        if(!app.getTeamHelper().isTeamsPresent()){//day i pokaji teams-komandy
//            app.getTeamHelper().createTeam();
//        }
//    }
//    @BeforeMethod
//   public void isOnHomePage()  {
//        if(!isTherePersonalBoards()){
//            app.getTeamHelper().returnToHomePage();
//       }
//    }

//  public boolean isTherePersonalBoards() {
//      return app.getTeamHelper().isElementPresent(By.xpath("//*[@class='icon-lg icon-member']/../../.."));
//    }
//
//    @Test
//    public void deleteTeamFromLeftNavMenu() throws InterruptedException {
//        int before = app.getTeamHelper().getTeamsCount();
//        while(before>3) {
//            app.getTeamHelper().clickOnFirstTeam();
//            app.getTeamHelper().openSettings();
//            app.getTeamHelper().deleteTeam();
//            before = app.getTeamHelper().getTeamsCount();
//        }
//        app.getTeamHelper().returnToHomePage();
//            int after = getTeamsCount();
//            Assert.assertEquals(after,before-1);
//
//    }

//}