package com.example.dd.items;

import java.util.ArrayList;

public class WeaponList {

    public ArrayList<Weapon> weaponList;

    public WeaponList() {
        this.weaponList = new ArrayList<>();
        createWeaponList();
    }

    private void createWeaponList() {
        Weapon rapier = new Weapon("Rapier", 2, "25gp",
                "A rapier is a straight, two-edged sword with a narrow pointed blade, designed especially for thrusting.",
                "1d8 piercing", addKeywords("Martial", "Melee", "Finesse"), "5");
        weaponList.add(rapier);
        Weapon shortsword = new Weapon("Shortsword", 2, "10gp",
                "A sword of a class generally shorter than one meter, but longer than a dagger.",
                "1d6 piercing", addKeywords("Martial", "Melee", "Finesse", "Light"), "5");
        weaponList.add(shortsword);
        Weapon shortbow = new Weapon("Shortbow", 2, "25gp",
                "A small bow that has a strong tension, and is usually about a meter tall.",
                "1d6 piercing", addKeywords("Simple", "Range", "Ammunition", "Two-Handed"), "80/320");
        weaponList.add(shortbow);
        Weapon dagger = new Weapon("Dagger", 1, "2gp",
                "a short knife with a pointed and edged blade, used as a weapon",
                "1d4 piercing", addKeywords("Simple", "Melee", "Finesse", "Light", "Thrown20/60"), "5");
        weaponList.add(dagger);
    }

    private ArrayList<String> addKeywords(String... args) {
        ArrayList<String> keywords = new ArrayList<>();
        for (String arg : args){
            keywords.add(arg);
        }
        return keywords;
    }
}
