package com.example.dd.items;

public class HeavyArmor extends Armor{

    int STRRequirement;

    public HeavyArmor(String name, double weight, String cost, String description, int baseAC, boolean stealthDisadvantage, int STRRequirement) {
        super(name, weight, cost, description, baseAC, stealthDisadvantage);
        this.STRRequirement = STRRequirement;
    }
    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
    }

    public int getSTRRequirement() {
        return STRRequirement;
    }

    public void setSTRRequirement(int STRrequirement) {
        this.STRRequirement = STRrequirement;
    }
}
