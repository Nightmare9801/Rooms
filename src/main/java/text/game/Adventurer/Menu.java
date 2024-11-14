package text.game.Adventurer;

import java.util.ArrayList;

import text.game.Input.Input;
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

        run(new SphinxsLair(), adv);

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks");
        System.out.println("3. <Locked>");
        System.out.println("4. <Locked>");

        run(new TheClockworks(), adv);

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks -> Solved");
        System.out.println("3. The Room Of Locks");
        System.out.println("4. <Locked>");

        run(new TheRoomOfLocks(), adv);

        System.out.println("Room List");
        System.out.println("1. The Sphinx's Lair -> Solved");
        System.out.println("2. The ClockWorks -> Solved");
        System.out.println("3. The Room Of Locks -> Solved");
        System.out.println("4. The Escape Chanber");

        run(new TheEscapeChamber(), adv);

        System.out.println("Congratulations! You have solved all the rooms!");
        System.out.println("Your Adventure Has Ended!");

        Input.close();

    }

    public static void run(Room room, Adventurer adv) {
        while(!room.isSolved) {
            room.run(adv);
            if(!room.isSolved) {
                System.out.println("You have not solved the room yet. Try again.");
            }
        }
    }
}
