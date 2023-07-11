package com.example.dd.items;

import java.util.ArrayList;

public class ToolList {

    public ArrayList<Tool> toolList;

    public ToolList(ArrayList<Tool> toolList) {
        this.toolList = new ArrayList<>();
        createToolList();
    }

    private void createToolList() {
        Tool thieveTool = new Tool("Thieve's Tools", 1, "25gp",
                "This set of tools includes a small file, a set of lock picks, a small mirror mounted on a metal handle, a set of narrow-bladed scissors, and a pair of pliers. Proficiency with these tools lets you add your proficiency bonus to any ability checks you make to disarm traps or open locks.",
                addProperties("Components: Thieves' tools include a small file, a set of lock picks, a small mirror mounted on a metal handle, a set of narrow-bladed scissors, and a pair of pliers.",
                        "History: Your knowledge of traps grants you insight when answering questions about locations that are renowned for their traps.",
                        "Investigation and Perception: You gain additional insight when looking for traps, because you have learned a variety of common signs that betray their presence.",
                        "Set a Trap. Just as you can disable traps, you can also set them. As part of a short rest, you can create a trap using items you have on hand. The total of your check becomes the DC for someone else's attempt to discover or disable the trap. The trap deals damage appropriate to the materials used in crafting it (such as poison or a weapon) or damage equal to half the total of your check, whichever the DM deems appropriate."),
                addActivities("Pick a lock", "Disable a Trap"));
    }

    private ArrayList<String> addActivities(String... args) {
        ArrayList<String> activities = new ArrayList<>();
        for (String arg : args){
            activities.add(arg);
        }
        return activities;

    }

    private ArrayList<String> addProperties(String... args) {
        ArrayList<String> properties = new ArrayList<>();
        for (String arg : args){
            properties.add(arg);
        }
        return properties;

    }
}
