package com.example.dd.items;

import java.util.ArrayList;

public class Tool extends Item {

    ArrayList<String> properties;
    ArrayList<String> activities;

    public Tool(String name, double weight, String cost, String description, ArrayList<String> properties, ArrayList<String> activities) {
        super(name, weight, cost, description);
        this.properties = properties;
        this.activities = activities;
    }

    public ArrayList<String> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<String> properties) {
        this.properties = properties;
    }

    public ArrayList<String> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<String> activities) {
        this.activities = activities;
    }
}
