package com.example.dd.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Rogue extends CharacterClass {


    public Rogue() {
        super("Rogue", 8, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new HashMap<>());
        fillClassFeatures();
        fillProficienciesWeapons();
        fillProficienciesArmor();
        fillProficienciesSavingThrows();
        fillProficienciesTools();
        fillProficienciesSkillOptions();
    }

    @Override
    public void fillClassFeatures() {
        getClassFeatures().put(1, new ArrayList<>(Arrays.asList("Expertise", "Sneak Attack", "Thieve's Cant")));
        getClassFeatures().put(2, new ArrayList<>(Arrays.asList("Cunning Action")));
        getClassFeatures().put(3, new ArrayList<>(Arrays.asList("Roguish Archetype", "Steady Aim")));
    }

    @Override
    public void fillProficienciesArmor() {
        getProficienciesArmor().add("Light Armor");
    }

    @Override
    public void fillProficienciesWeapons() {
        getProficienciesWeapons().add("Simple Weapons");
        getProficienciesWeapons().add("Hand Crossbows");
        getProficienciesWeapons().add("Longswords");
        getProficienciesWeapons().add("Rapiers");
        getProficienciesWeapons().add("Shortswords");
    }

    @Override
    public void fillProficienciesTools() {
        getProficienciesTools().add("Thieve's Tools");
    }

    @Override
    public void fillProficienciesSavingThrows() {
        getProficienciesSavingThrows().add("DEX");
        getProficienciesSavingThrows().add("INT");
    }

    @Override
    public void fillProficienciesSkillOptions() {
        getProficienciesSkillsOptions().add("Acrobatics");
        getProficienciesSkillsOptions().add("Athletics");
        getProficienciesSkillsOptions().add("Deception");
        getProficienciesSkillsOptions().add("Insight");
        getProficienciesSkillsOptions().add("Intimidation");
        getProficienciesSkillsOptions().add("Investigation");
        getProficienciesSkillsOptions().add("Perception");
        getProficienciesSkillsOptions().add("Performance");
        getProficienciesSkillsOptions().add("Persuasion");
        getProficienciesSkillsOptions().add("Sleight of Hand");
        getProficienciesSkillsOptions().add("Stealth");
    }
}
