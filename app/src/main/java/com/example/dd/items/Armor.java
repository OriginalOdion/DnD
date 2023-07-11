package com.example.dd.items;

public abstract class Armor extends Item implements Equippable{

    int baseAC;
    boolean isEquipped;
    boolean stealthDisadvantage;

    public Armor(String name, double weight, String cost, String description, int baseAC, boolean stealthDisadvantage) {
        super(name, weight, cost, description);
        this.baseAC = baseAC;
        this.stealthDisadvantage = stealthDisadvantage;
    }
    public int calculateAC(int DEX){
         return baseAC;
    }

    public boolean isStealthDisadvantage() {
        return stealthDisadvantage;
    }

    public void setStealthDisadvantage(boolean stealthDisadvantage) {
        this.stealthDisadvantage = stealthDisadvantage;
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
