package com.example.dd.races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HalflingLightfoot extends Halfling{

    public HalflingLightfoot() {
        super("Lightfoot Halfling", null, null, new HashMap<>(), new HashMap<>(), new ArrayList<>());
        fillRacialStats();
        fillRacialFeatures();
    }

    protected void fillRacialStats() {
        super.fillRacialStats();
        getRacialStats().put("CHA", 1);
    }

    protected void fillRacialFeatures(){

        getRacialFeatures().put(1, Arrays.asList("Naturally Stealthy"));
        super.fillRacialFeatures();

    }
}
