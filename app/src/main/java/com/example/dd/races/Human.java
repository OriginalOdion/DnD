package com.example.dd.races;

import java.util.ArrayList;
import java.util.HashMap;

public class Human extends Race{

    public Human() {
        super("Human", "Medium", "30 ft.", new HashMap<>(), null, new ArrayList<String>());
        getRacialLanguages().add("Common");
        fillRacialStats();
    }

    private void fillRacialStats() {
        getRacialStats().put("STR", 1);
        getRacialStats().put("DEX", 1);
        getRacialStats().put("CON", 1);
        getRacialStats().put("INT", 1);
        getRacialStats().put("WIS", 1);
        getRacialStats().put("CHA", 1);
    }
}
