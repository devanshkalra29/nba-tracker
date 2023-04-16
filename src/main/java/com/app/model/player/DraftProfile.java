package com.app.model.player;

public class DraftProfile {

    String draftTeam;
    int draftRound;
    int draftPick;



    public DraftProfile(String draftTeam, int draftRound, int draftPick) {
        this.draftTeam = draftTeam;
        this.draftPick = draftPick;
        this.draftRound = draftRound;
    }
}
