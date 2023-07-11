package com.example.dd;

import com.example.dd.classes.CharacterClass;
import com.example.dd.items.Item;
import com.example.dd.races.Race;

import java.util.HashMap;
import java.util.List;

public class PlayerCharacter {

    static int ID = 0;
    String name;
    CharacterClass primaryClass;
    Race race;
    int level = 1;
    HashMap<String, Integer> baseStats;
    HashMap<String, Integer> modifiers;
    int PB;
    int AC;
    List<String> savingProficiencies;
    List<String> skillProficiencies;
    List<String> languages;
    HashMap<Integer, List<String>> features;
    HashMap<String, Integer> money;
    int hitDiceAmount;
    int HP;
    int THP;
    int speed;
    int initiative;
    List<Item> inventory;

    public PlayerCharacter() {
        this.ID = ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getPrimaryClass() {
        return primaryClass;
    }

    public void setPrimaryClass(CharacterClass primaryClass) {
        this.primaryClass = primaryClass;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public HashMap<String, Integer> getBaseStats() {
        return baseStats;
    }

    public void setBaseStats(HashMap<String, Integer> baseStats) {
        this.baseStats = baseStats;
    }

    public HashMap<String, Integer> getModifiers() {
        return modifiers;
    }

    public void setModifiers(HashMap<String, Integer> modifiers) {
        this.modifiers = modifiers;
    }

    public int getPB() {
        return PB;
    }

    public void setPB(int PB) {
        this.PB = PB;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public List<String> getSavingProficiencies() {
        return savingProficiencies;
    }

    public void setSavingProficiencies(List<String> savingProficiencies) {
        this.savingProficiencies = savingProficiencies;
    }

    public List<String> getSkillProficiencies() {
        return skillProficiencies;
    }

    public void setSkillProficiencies(List<String> skillProficiencies) {
        this.skillProficiencies = skillProficiencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public HashMap<Integer, List<String>> getFeatures() {
        return features;
    }

    public void setFeatures(HashMap<Integer, List<String>> features) {
        this.features = features;
    }

    public HashMap<String, Integer> getMoney() {
        return money;
    }

    public void setMoney(HashMap<String, Integer> money) {
        this.money = money;
    }

    public int getHitDiceAmount() {
        return hitDiceAmount;
    }

    public void setHitDiceAmount(int hitDiceAmount) {
        this.hitDiceAmount = hitDiceAmount;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getTHP() {
        return THP;
    }

    public void setTHP(int THP) {
        this.THP = THP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
