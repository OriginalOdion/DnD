package com.example.dd.races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HalflingStout extends Halfling{

    public HalflingStout() {
        super("Stout Halfling", null, null, new HashMap<>(), new HashMap<>(), new ArrayList<String>());
        fillRacialStats();
        fillRacialFeatures();
    }

    protected void fillRacialStats() {
        super.fillRacialStats();
        getRacialStats().put("CON", 1);
    }

    protected void fillRacialFeatures(){

        getRacialFeatures().put(1, Arrays.asList("Stout Resilience"));
        super.fillRacialFeatures();
    }
}
