package com.example.dd.items;

import java.util.ArrayList;

public class ArmorList {

    public ArrayList<Armor> armorList;

    public ArmorList(){
        this.armorList = new ArrayList<>();
        createArmorList();
    }



    public void createArmorList(){
        addLightArmor();
        addMediumArmor();
        addHeavyArmor();

    }

    private void addLightArmor() {
        Armor leather = new LightArmor("Leather Armor", 10, "10gp",
                "The breastplate and shoulder protectors of this armor are made of leather that has been stiffened by being boiled in oil. The rest of the armor is made of softer and more flexible materials.",
                11, false);
        Armor padded = new LightArmor("Padded Armor", 8, "5gp",
                "Padded armor consists of quilted layers of cloth and batting.\nThe wearer has disadvantage on Dexterity (Stealth) checks.",
                11, true);
        Armor studdedLeather = new LightArmor("Studded Leather Armor", 13, "45gp",
                "Made from tough but flexible leather, studded leather is reinforced with close-set rivets or spikes.",
                12, false);
        armorList.add(leather);
        armorList.add(padded);
        armorList.add(studdedLeather);
    }

    private void addMediumArmor() {
        Armor hide = new MediumArmor("Hide Armor", 12, "10gp",
                "This crude armor consists of thick furs and pelts. It is commonly worn by barbarian tribes, evil humanoids, and other folk who lack access to the tools and materials needed to create better armor.",
                12, false);
        Armor chainShirt = new MediumArmor("Chain Shirt", 20, "50gp",
                "Made of interlocking metal rings, a chain shirt is worn between layers of clothing or leather. This armor offers modest protection to the wearer's upper body and allows the sound of the rings rubbing against one another to be muffled by outer layers.",
                13, false);
        Armor breastplate = new MediumArmor("Breastplate", 20, "400gp",
                "This armor consists of a fitted metal chest piece worn with supple leather. Although it leaves the legs and arms relatively unprotected, this armor provides good protection for the wearer's vital organs while leaving the wearer relatively unencumbered.",
                14, false);
        Armor scaleMail = new MediumArmor("Scale Mail", 45, "50gp",
                "This armor consists of a coat and leggings (and perhaps a separate skirt) of leather covered with overlapping pieces of metal, much like the scales of a fish. The suit includes gauntlets.\nThe wearer has disadvantage on Dexterity (Stealth) checks.",
                14, true);
        Armor spiked = new MediumArmor("Spiked Armor", 45, "75gp",
                "Spiked armor is a rare type of medium armor made by dwarves. It consists of a leather coat and leggings covered with spikes that are usually made of metal.\nThe wearer has disadvantage on Dexterity (Stealth) checks.",
                14, true);
        Armor halfPlate = new MediumArmor("Halp Plate Armor", 40, "750gp",
                "Half plate consists of shaped metal plates that cover most of the wearer's body. It does not include leg protection beyond simple greaves that are attached with leather straps.\nThe wearer has disadvantage on Dexterity (Stealth) checks.",
                15, true);
        armorList.add(hide);
        armorList.add(chainShirt);
        armorList.add(breastplate);
        armorList.add(scaleMail);
        armorList.add(spiked);
        armorList.add(halfPlate);
    }

    private void addHeavyArmor() {
        Armor ringMail = new HeavyArmor("Ring Mail", 40, "30gp",
                "This armor is leather armor with heavy rings sewn into it. The rings help reinforce the armor against blows from swords and axes. Ring mail is inferior to chain mail, and it's usually worn only by those who can't afford better armor.\nThe wearer has disadvantage on Dexterity (Stealth) checks.",
                14, true, 0);
        Armor chainMail = new HeavyArmor("Chain Mail", 55, "70gp",
                "Made of interlocking metal rings, chain mail includes a layer of quilted fabric worn underneath the mail to prevent chafing and to cushion the impact of blows. The suit includes gauntlets.\n The wearer has disadvantage on Dexterity (Stealth) checks.\nIf the wearer has a Strength score lower than 13, their speed is reduced by 10 feet.",
                16, true, 13);
        Armor splint = new HeavyArmor("Splint Armor", 60, "200gp",
                "This armor is made of narrow vertical strips of metal riveted to a backing of leather that is worn over cloth padding. Flexible chain mail protects the joints.\n The wearer has disadvantage on Dexterity (Stealth) checks.\n If the wearer has a Strength score lower than 15, their speed is reduced by 10 feet.",
                17, true, 15);
        Armor plate = new HeavyArmor("Plate Armor", 65, "1500gp",
                "Plate consists of shaped, interlocking metal plates to cover the entire body. A suit of plate includes gauntlets, heavy leather boots, a visored helmet, and thick layers of padding underneath the armor. Buckles and straps distribute the weight over the body.\nThe wearer has disadvantage on Dexterity (Stealth) checks.\nIf the wearer has a Strength score lower than 15, their speed is reduced by 10 feet.",
                18, true, 15);
        armorList.add(ringMail);
        armorList.add(chainMail);
        armorList.add(splint);
        armorList.add(plate);
    }
}
