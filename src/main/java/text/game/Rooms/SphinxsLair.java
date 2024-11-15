package text.game.Rooms;

import text.game.Adventurer.Exiter;
import text.game.IO.Input;
import text.game.IO.Printer;
import text.game.Items.KeyFragments;

public class SphinxsLair extends Room {
    public void run() {
        Printer.slowPrint("You are suddenly transported to a big and imposing hallway, decorated lavishly. You spot an altar at the end of the hallway.");
        while (!isSolved) {
            
            Printer.slowPrint("1. Go to the altar.");
            Printer.slowPrint("2. Exit the room.");

            int option = Input.getInt();

            if(option == 2) {
                return;
            }

            if(option == 1) {
                Printer.slowPrint("A menu appears.");
                Printer.slowPrint("To talk to the sphinx, place your hands on the altar.");
                Printer.slowPrint("1. Place your hands.");

                int resp = Input.getInt();

                if (resp == 1) {
                    Printer.slowPrint("As soon as you place your hands on the altar, a loud voice speaks up. \n \"Anwer my three riddles, and you shall receive a gift from the gods.\"");
                    Printer.slowPrint("What goes up but never comes down?");
                    String ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Age")) {
                        Exiter.defeatExit();
                    }
                    Printer.slowPrint("What is full of holes but still holds water?");
                    ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Sponge")) {
                        Exiter.defeatExit();
                    }
                    Printer.slowPrint("What can you break without touching it?");
                    ans = Input.getLine();
                    if(!ans.equalsIgnoreCase("Promise")) {
                        Exiter.defeatExit();
                    }

                    Printer.slowPrint("You have answered all my riddles, traveller. As a token of appreciation, I present to you a part of the broken key.");
                    KeyFragments.updateCount();
                    isSolved = true;
                    return;
                } else {
                    Printer.slowPrint("Wrong command");
                }
            }
        }
    }
}
