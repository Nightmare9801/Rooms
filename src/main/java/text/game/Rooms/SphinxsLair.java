package text.game.Rooms;

import java.util.Scanner;

public class SphinxsLair extends Room {
    public SphinxsLair() {
        this.name = "The Sphinx's Lair";
    }
    public void run() {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("You are suddenly transported to a big and imposing hallway, decorated lavishly. You spot an altar at the end of the hallway and a peculiar wardrobe.");
            System.out.println("1. Go to the altar.");
            System.out.println("2. Go to the wardrobe.");
            System.out.println("3. Exit the room.");

            int option = Integer.parseInt(in.nextLine());

            if(option == 3) {
                return;
            }

            if(option == 1) {
                System.out.println("A menu appears.");
                System.out.println("To talk to the sphinx, place your hands on the altar.");
                System.out.println("1. Place your hands.");
                
            }

        }
    }
}
