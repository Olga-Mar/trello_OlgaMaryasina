package com.trello.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamModificationTests extends TestBase {
    @BeforeMethod
    public void precodition(){
        if(!app.getTeamHelper().isTeamsPresent()){//day i pokaji teams-komandy
            app.getTeamHelper().createTeam();
        }
    }

    @Test
    public void testRenameTeam() throws InterruptedException {//[ereimenuj nazvanie komandy
        app.getTeamHelper().clickOnFirstTeam();//najmi na pervuu komandu
        app.getTeamHelper().openSettings(); //otkroj Settings v menu
        app.getTeamHelper().initEditTeamProfil();//najmi na optziu  edit team profile
        String teamName = "hh";
        app.getTeamHelper().changeTeamProfile(teamName, "hha");
        app.getTeamHelper().confirmEditTeam();
        Thread.sleep(5000);
       // String createdTeamName = app.getTeamHelper().getTeamNameFromTeamPage();
       // Assert.assertEquals(createdTeamName, teamName);
       // app.getTeamHelper().returnToHomePage();
        Assert.assertEquals(app.getTeamHelper().getTeamNameFromTeamPage(),"hha");
    }
}
