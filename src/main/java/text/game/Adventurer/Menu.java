package text.game.Adventurer;

import java.util.ArrayList;

import text.game.Rooms.Room;
import text.game.Rooms.SphinxsLair;
import text.game.Rooms.TheClockworks;
import text.game.Rooms.TheEscapeChamber;
import text.game.Rooms.TheRoomOfLocks;

public class Menu {
    public static ArrayList<Room> list = new ArrayList<>();

    public static void run() {
        Adventurer adv = new Adventurer();

        System.out.println("You wake up to a pure nothingness around you. As you try to figure out where you are, you notice a menu.");

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair");
        System.out.println("2. <Locked>");
        System.out.println("3. <Locked>");
        System.out.println("4. <Locked>");

        System.out.println("Inquisitively, you try to tap on the the first option.");

        SphinxsLair lair = new SphinxsLair();
        while(!lair.isSolved) {
            lair.run(adv);
            if(!lair.isSolved) {
                System.out.println("You have not solved the room yet. Try again.");
                lair = new SphinxsLair();
            }
        }

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks");
        System.out.println("3. <Locked>");
        System.out.println("4. <Locked>");

        TheClockworks clockworks = new TheClockworks();

        while(!clockworks.isSolved) {
            clockworks.run(adv);
            if(!clockworks.isSolved) {
                System.out.println("You have not solved the room yet. Try again.");
                clockworks = new TheClockworks();
            }
        }

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks -> Solved");
        System.out.println("3. The Room Of Locks");
        System.out.println("4. <Locked>");

        TheRoomOfLocks room = new TheRoomOfLocks();

        while(!room.isSolved) {
            room.run(adv);
            if(!room.isSolved) {
                System.out.println("You have not solved the room yet. Try again.");
                room = new TheRoomOfLocks();
            }
        }

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks -> Solved");
        System.out.println("3. The Room Of Locks -> Solved");
        System.out.println("4. The Escape Chanber");

        TheEscapeChamber chamber = new TheEscapeChamber();

        while(!chamber.isSolved) {
            chamber.run(adv);
            if(!chamber.isSolved) {
                System.out.println("You have not solved the room yet. Try again.");
                chamber = new TheEscapeChamber();
            }
        }

        System.out.println("Congratulations! You have solved all the rooms!");
        System.out.println("Your Adventure Has Ended!");

    }
}
