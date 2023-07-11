package com.example.dd.items;

import java.util.ArrayList;

public class Pack extends AdventuringGear {

    ArrayList<String> contents;

    public Pack(String name, double weight, String cost, String description, ArrayList<String> contents) {
        super(name, weight, cost, description);
        this.contents = contents;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }
}
