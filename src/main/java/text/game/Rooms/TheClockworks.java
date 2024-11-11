package text.game.Rooms;

import java.util.Scanner;

import text.game.Adventurer.Adventurer;
import text.game.Adventurer.Inventory;
import text.game.Items.KeyFragments;

public class TheClockworks extends Room {
    public void run(Adventurer adv) {
        adv.currRoom = new TheClockworks();
        try(Scanner in = new Scanner(System.in)){
            System.out.println("You are suddenly transported in front of three different large, imposing clocks signifying the year, month and day of a particular event.\n A disembodied voice speaks \n \" Guess the incident and take the keys, otherwise perish. \"");
            System.out.println("1984 - 06 - 02");

            String ans = in.nextLine();

            if(ans.equalsIgnoreCase("The Bhopal Gas Tragedy")) {
                this.isSolved = true;

                System.out.println("\"Congratulations, adventurer for having guessed the incident. You have successfully solved the room.\"");

                Inventory.addItem(new KeyFragments());

                return;
            } else {
                adv.kill();
                return;
            }
        }
    }
}
