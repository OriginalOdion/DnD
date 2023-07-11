package com.example.dd.items;

import java.util.ArrayList;

public class AdventuringGearList {

    public ArrayList<Item> gearList;

    public AdventuringGearList() {
        this.gearList = new ArrayList<>();
        createGearList();
    }

    private void createGearList() {
        Pack burglarPack = new Pack("Burglar's Pack", 44.5, "16gp", "", addContents("a backpack", "a bag of 1.000 ball bearings", "10 feet of String", " a bell", "5 candles", "a crowbar", "a hammer", "10 pitons", "a hooded lantern", "2 flasks of oil", "5 days rations", "a tinderbox", "a waterskin", "50 feet of hempen rope") );
        gearList.add(burglarPack);
        Pack dungeoneerPack = new Pack("Dungeoneer's Pack", 61.2, "12 gp", "", addContents("a backpack", "a crowbar", "a hammer", "10 pitons", "10 torches", "a tinderbox", "10 days of rations", "a waterskin", "50 feet of hempen rope"));
        gearList.add(dungeoneerPack);
    }

    private ArrayList<String> addContents(String... args) {
        ArrayList<String> contents = new ArrayList<>();
        for (String arg : args){
            contents.add(arg);
        }
        return contents;
    }
}
