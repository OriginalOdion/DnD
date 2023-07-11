package com.example.dd.races;

import java.util.HashMap;
import java.util.List;

public abstract class Race{
    private String name;
    private String size;
    private String speed;
    private HashMap<String, Integer> racialStats;
    private HashMap<Integer, List<String>> racialFeatures;
    private List<String> racialLanguages;

    public Race(String name, String size, String speed, HashMap<String, Integer> racialStats, HashMap<Integer, List<String>> racialFeatures, List<String> racialLanguages) {
        this.name = name;
        this.size = size;
        this.speed = speed;
        this.racialStats = racialStats;
        this.racialFeatures = racialFeatures;
        this.racialLanguages = racialLanguages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public HashMap<String, Integer> getRacialStats() {
        return racialStats;
    }

    public void setRacialStats(HashMap<String, Integer> racialStats) {
        this.racialStats = racialStats;
    }

    public HashMap<Integer, List<String>> getRacialFeatures() {
        return racialFeatures;
    }

    public void setRacialFeatures(HashMap<Integer, List<String>> racialFeatures) {
        this.racialFeatures = racialFeatures;
    }

    public List<String> getRacialLanguages() {
        return racialLanguages;
    }

    public void setRacialLanguages(List<String> racialLanguages) {
        this.racialLanguages = racialLanguages;
    }
}
