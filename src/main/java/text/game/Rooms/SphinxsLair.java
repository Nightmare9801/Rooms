package text.game.Rooms;

import java.util.ArrayList;
import java.util.Scanner;

import text.game.Adventurer.Adventurer;
import text.game.Adventurer.Inventory;
import text.game.Items.KeyFragments;
import text.game.Items.RingOfDiscontinuity;

public class SphinxsLair extends Room {
    public SphinxsLair() {
        this.name = "The Sphinx's Lair";
        this.items = new ArrayList<>();
        items.add(new RingOfDiscontinuity());
        items.add(new KeyFragments());
    }
    public void run(Adventurer adventurer) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("You are suddenly transported to a big and imposing hallway, decorated lavishly. You spot an altar at the end of the hallway and a peculiar wardrobe.");
            while (isSolved) {
            
                System.out.println("1. Go to the altar.");
                System.out.println("2. Exit the room.");

                int option = Integer.parseInt(in.nextLine());

                if(option == 2) {
                    return;
                }

                if(option == 1) {
                    System.out.println("A menu appears.");
                    System.out.println("To talk to the sphinx, place your hands on the altar.");
                    System.out.println("1. Place your hands.");

                    int resp = Integer.parseInt(in.nextLine());

                    if (resp == 1) {
                        System.out.println("As soon as you place your hands on the altar, a loud voice speaks up. \n \"Anwer my three riddles, and you shall receive a gift from the gods.\"");
                        System.out.println("What goes up but never comes down?");
                        String ans = in.nextLine();
                        if(!ans.equalsIgnoreCase("Age")) {
                            adventurer.kill();
                        }
                        System.out.println("What is full of holes but still holds water?");
                        ans = in.nextLine();
                        if(!ans.equalsIgnoreCase("Sponge")) {
                            adventurer.kill();
                        }
                        System.out.println("What can you break without touching it?");
                        ans = in.nextLine();
                        if(!ans.equalsIgnoreCase("Promise")) {
                            adventurer.kill();
                        }

                        System.out.println("You have answered all my riddles, traveller. As a token of appreciation, I present to you a part of the broken key and the ring of discontinuity, which can be used once to solve any rooms.");
                        Inventory.addItem(new RingOfDiscontinuity());
                        Inventory.addItem(new KeyFragments());
                        items.remove(new KeyFragments());
                        items.remove(new RingOfDiscontinuity());
                        isSolved = true;
                        return;
                    } else {
                        System.out.println("Wrong command");
                    }
                }
            }

        }
    }
}
