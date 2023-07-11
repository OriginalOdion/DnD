package com.example.dd.races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class Halfling extends Race{

    public Halfling(String name, String size, String speed, HashMap<String, Integer> racialStats, HashMap<Integer, List<String>> racialFeatures, List<String> racialLanguages) {
        super(name, "Small", "25 ft", racialStats, racialFeatures, new ArrayList<>());
        racialLanguages.add("Common");
        racialLanguages.add("Halfling");
    }

    protected void fillRacialStats(){
        getRacialStats().put("DEX", 2);
    }


    protected void fillRacialFeatures() {
        getRacialFeatures().put(0, Arrays.asList("Lucky", "Brave", "Halfling Nimbleness"));
    }

}
