package com.example.dd.items;

import java.util.ArrayList;

public class Weapon extends Item implements Equippable{
    String damage;
    ArrayList<String> keywords;
    String range;
    boolean isEquipped;

    public Weapon(String name, double weight, String cost, String description, String damage, ArrayList<String> keywords, String range) {
        super(name, weight, cost, description);
        this.damage = damage;
        this.keywords = keywords;
        this.range = range;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public void setEquip() {
        isEquipped = !isEquipped;
    }

    @Override
    public boolean getEquipped() {
        return isEquipped;
    }
}
