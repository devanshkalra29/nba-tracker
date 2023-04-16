package com.app.model.team;

public class CollegeTeam extends Team {
    String university;
    String mascot;

    public CollegeTeam(String university, String mascot) {
        super(university,mascot);
        this.university = university;
        this.mascot = mascot;
    }

}
