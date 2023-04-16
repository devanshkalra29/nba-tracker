package com.app.model.stats;

public class Rebounds {
    int defensiveRebounds;
    int offensiveRebounds;
    int totalRebounds;

    public Rebounds(int defensiveRebounds, int offensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
        this.offensiveRebounds = offensiveRebounds;
        this.totalRebounds = offensiveRebounds + defensiveRebounds;
    }

//    public int getTotalRebounds() {
//        return totalRebounds;
//    }
}
