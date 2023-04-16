package com.app.model.team;

public class NbaTeam extends Team {
    String cityOrState;
    String teamName;

    public NbaTeam(String cityOrState, String teamName) {
        super(cityOrState, teamName);
    }
}
