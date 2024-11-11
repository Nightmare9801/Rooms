package text.game.Rooms;

import java.util.Scanner;

import text.game.Adventurer.Adventurer;
import text.game.Items.KeyFragments;

public class TheEscapeChamber extends Room{
    public void run(Adventurer adv) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("You are in a dark and narrow room, with a single door at the end of the room.");
            System.out.println("1. Open the door.");
            System.out.println("2. Remain stuck in the void.");

            int option = Integer.parseInt(in.nextLine());

            if(option == 1) {
                if(KeyFragments.count == 3) {
                    System.out.println("You have successfully escaped the void.");
                } else {
                    System.out.println("You are doomed to spend the rest of your life here.");
                }
            } else {
                System.out.println("You remain stuck in the void.");
            }
        }
    }
}
