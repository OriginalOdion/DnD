package com.example.dd.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class CharacterClass {
    private String name;
    private int hitDice;
    private List<String> proficienciesArmor;
    private List<String> proficienciesWeapons;
    private List<String> proficienciesTools;
    private List<String> proficienciesSavingThrows;
    private List<String> proficienciesSkillsOptions;
    private HashMap<Integer, ArrayList<String>> classFeatures;


    public CharacterClass(String name, int hitDice, List<String> proficienciesArmor, List<String> proficienciesWeapons, List<String> proficienciesTools, List<String> proficienciesSavingThrows, List<String> proficienciesSkillsOptions, HashMap<Integer, ArrayList<String>> classFeatures) {
        this.name = name;
        this.hitDice = hitDice;
        this.proficienciesArmor = proficienciesArmor;
        this.proficienciesWeapons = proficienciesWeapons;
        this.proficienciesTools = proficienciesTools;
        this.proficienciesSavingThrows = proficienciesSavingThrows;
        this.proficienciesSkillsOptions = proficienciesSkillsOptions;
        this.classFeatures = classFeatures;
    }

    public abstract void fillClassFeatures();
    public abstract void fillProficienciesArmor();
    public abstract void fillProficienciesWeapons();
    public abstract void fillProficienciesTools();
    public abstract void fillProficienciesSavingThrows();
    public abstract void fillProficienciesSkillOptions();


    //region getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public List<String> getProficienciesArmor() {
        return proficienciesArmor;
    }

    public void setProficienciesArmor(List<String> proficienciesArmor) {
        this.proficienciesArmor = proficienciesArmor;
    }

    public List<String> getProficienciesWeapons() {
        return proficienciesWeapons;
    }

    public void setProficienciesWeapons(List<String> proficienciesWeapons) {
        this.proficienciesWeapons = proficienciesWeapons;
    }

    public List<String> getProficienciesTools() {
        return proficienciesTools;
    }

    public void setProficienciesTools(List<String> proficienciesTools) {
        this.proficienciesTools = proficienciesTools;
    }

    public List<String> getProficienciesSavingThrows() {
        return proficienciesSavingThrows;
    }

    public void setProficienciesSavingThrows(List<String> proficienciesSavingThrows) {
        this.proficienciesSavingThrows = proficienciesSavingThrows;
    }

    public List<String> getProficienciesSkillsOptions() {
        return proficienciesSkillsOptions;
    }

    public void setProficienciesSkillsOptions(List<String> proficienciesSkillsOptions) {
        this.proficienciesSkillsOptions = proficienciesSkillsOptions;
    }

    public HashMap<Integer, ArrayList<String>> getClassFeatures() {
        return classFeatures;
    }

    public void setClassFeatures(HashMap<Integer, ArrayList<String>> classFeatures) {
        this.classFeatures = classFeatures;
    }
    //endregion getter&setter

}
