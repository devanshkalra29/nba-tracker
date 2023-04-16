package com.app.model.player;

import com.app.utils.exception.InvalidJerseyNumberException;
import com.app.model.stats.PlayerStats;
import com.app.model.team.NbaTeam;

public class NbaPlayer {
    Name name;
    NbaTeam nbaTeam;
    PlayerDimensions playerDimensions;
    PlayerProfile playerProfile;
    PlayerStats playerStats;
    int jerseyNumber;

    public NbaPlayer(Name name, NbaTeam nbaTeam, PlayerDimensions playerDimensions,PlayerProfile playerProfile, PlayerStats playerStats, DraftProfile draftProfile, int jerseyNumber) {

        this.name = name;
        this.nbaTeam = nbaTeam;
        this.playerDimensions = playerDimensions;
        this.playerProfile = playerProfile;
        this.playerStats = playerStats;
        this.draftProfile = draftProfile;
        this.jerseyNumber = jerseyNumber;
    }

    public void changeJerseyNumber(int newNumber)  {
        if(newNumber < 0 || newNumber > 99) {
            throw new InvalidJerseyNumberException("invalid jersey number");
        }

        this.jerseyNumber = newNumber;
    }

}
