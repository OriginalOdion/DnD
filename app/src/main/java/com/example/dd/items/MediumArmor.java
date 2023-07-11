package com.example.dd.items;

public class MediumArmor extends Armor{


    public MediumArmor(String name, double weight, String cost, String description, int baseAC, boolean stealthDisadvantage) {
        super(name, weight, cost, description, baseAC, stealthDisadvantage);

    }

    @Override
    public int calculateAC(int DEX) {
        if(DEX <= 2){
            return baseAC + DEX;
        }else{
            return baseAC + 2;
        }
    }

    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
    }
}
