package text.game.Rooms;

import text.game.Adventurer.Adventurer;
import text.game.Input.Input;
import text.game.Items.KeyFragments;

public class SphinxsLair extends Room {
    public void run(Adventurer adventurer) {
        System.out.println("You are suddenly transported to a big and imposing hallway, decorated lavishly. You spot an altar at the end of the hallway.");
        while (!isSolved) {
            
            System.out.println("1. Go to the altar.");
            System.out.println("2. Exit the room.");

            int option = Input.getInt();

            if(option == 2) {
                return;
            }

            if(option == 1) {
                System.out.println("A menu appears.");
                System.out.println("To talk to the sphinx, place your hands on the altar.");
                System.out.println("1. Place your hands.");

                int resp = Input.getInt();

                if (resp == 1) {
                    System.out.println("As soon as you place your hands on the altar, a loud voice speaks up. \n \"Anwer my three riddles, and you shall receive a gift from the gods.\"");
                    System.out.println("What goes up but never comes down?");
                    String ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Age")) {
                        adventurer.kill();
                    }
                    System.out.println("What is full of holes but still holds water?");
                    ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Sponge")) {
                        adventurer.kill();
                    }
                    System.out.println("What can you break without touching it?");
                    ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Promise")) {
                        adventurer.kill();
                    }

                    System.out.println("You have answered all my riddles, traveller. As a token of appreciation, I present to you a part of the broken key.");
                    KeyFragments.updateCount();
                    isSolved = true;
                    return;
                } else {
                    System.out.println("Wrong command");
                }
            }
        }
    }
}
