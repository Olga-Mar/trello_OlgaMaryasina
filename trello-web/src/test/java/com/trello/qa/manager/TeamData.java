package com.trello.qa.manager;
public class TeamData {
    private  String teamName;
    private  String description;

  /*  public TeamData(String teamName, String description) {ubiarem defaultnyj constructor/esli budut settery .my mojem stroit
        this.teamName = teamName;
        this.description = description;
    }*/

    public TeamData withTeamName(String teamName) {//eto setery
        this.teamName = teamName;
        return this;
    }

    public TeamData withDescription(String description) { //eto setery
        this.description = description;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDescription() {
        return description;
    }
}
