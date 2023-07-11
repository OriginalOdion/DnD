package com.example.dd.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Fighter extends CharacterClass {


    public Fighter() {
        super("Fighter", 10, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new ArrayList<String>(), new HashMap<>() );
        fillClassFeatures();
        fillProficienciesArmor();
        fillProficienciesWeapons();
        fillProficienciesSavingThrows();
        fillProficienciesSkillOptions();
    }

    @Override
    public void fillClassFeatures(){
        getClassFeatures().put(1, new ArrayList<>(Arrays.asList("Fighting Style", "Action Surge")));
        getClassFeatures().put(2, new ArrayList<>(Arrays.asList("Second Wind")));
        getClassFeatures().put(3, new ArrayList<>(Arrays.asList("Martial Archetype")));
    }

    @Override
    public void fillProficienciesArmor() {
        getProficienciesArmor().add("Light Armor");
        getProficienciesArmor().add("Medium Armor");
        getProficienciesArmor().add("Heavy Armor");
        getProficienciesArmor().add("Shields");

    }

    @Override
    public void fillProficienciesWeapons() {
        getProficienciesWeapons().add("Simple Weapons");
        getProficienciesWeapons().add("Martial Weapons");
    }

    @Override
    public void fillProficienciesTools() {
    }

    @Override
    public void fillProficienciesSavingThrows() {
        getProficienciesSavingThrows().add("STR");
        getProficienciesSavingThrows().add("CON");
    }

    @Override
    public void fillProficienciesSkillOptions() {
        getProficienciesSkillsOptions().add("Acrobatics");
        getProficienciesSkillsOptions().add("Animal Handling");
        getProficienciesSkillsOptions().add("Athletics");
        getProficienciesSkillsOptions().add("History");
        getProficienciesSkillsOptions().add("Insight");
        getProficienciesSkillsOptions().add("Intimidation");
        getProficienciesSkillsOptions().add("Perception");
        getProficienciesSkillsOptions().add("Survival");
    }
}
