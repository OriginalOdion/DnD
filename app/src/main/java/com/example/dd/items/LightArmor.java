package com.example.dd.items;

public class LightArmor extends Armor{

    public LightArmor(String name, double weight, String cost, String description, int baseAC, boolean stealthDisadvantage) {
        super(name, weight, cost, description, baseAC, stealthDisadvantage);
    }

    @Override
    public int calculateAC(int DEX) {
        return baseAC + DEX;
    }
}
