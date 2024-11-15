package text.game.Adventurer;

import java.util.ArrayList;

import text.game.IO.Input;
import text.game.IO.Printer;
import text.game.Rooms.Room;
import text.game.Rooms.SphinxsLair;
import text.game.Rooms.TheClockworks;
import text.game.Rooms.TheEscapeChamber;
import text.game.Rooms.TheRoomOfLocks;

public class Menu {
    public static ArrayList<Room> list = new ArrayList<>();

    public static void run() {
        Printer.slowPrint("You wake up to a pure nothingness around you. As you try to figure out where you are, you notice a menu.");

        Printer.slowPrint("Room List");
        Printer.slowPrint("1. The Sphinx's Lair");
        Printer.slowPrint("2. <Locked>");
        Printer.slowPrint("3. <Locked>");
        Printer.slowPrint("4. <Locked>");

        Printer.slowPrint("Inquisitively, you try to tap on the the first option.");

        run(new SphinxsLair());

        Printer.slowPrint("Room List");
        Printer.slowPrint("1. The Sphinx's Lair -> Solved");
        Printer.slowPrint("2. The ClockWorks");
        Printer.slowPrint("3. <Locked>");
        Printer.slowPrint("4. <Locked>");

        run(new TheClockworks());

        Printer.slowPrint("Room List");
        Printer.slowPrint("1. The Sphinx's Lair -> Solved");
        Printer.slowPrint("2. The ClockWorks -> Solved");
        Printer.slowPrint("3. The Room Of Locks");
        Printer.slowPrint("4. <Locked>");

        run(new TheRoomOfLocks());

        Printer.slowPrint("Room List");
        Printer.slowPrint("1. The Sphinx's Lair -> Solved");
        Printer.slowPrint("2. The ClockWorks -> Solved");
        Printer.slowPrint("3. The Room Of Locks -> Solved");
        Printer.slowPrint("4. The Escape Chanber");

        run(new TheEscapeChamber());

        Printer.slowPrint("Congratulations! You have solved all the rooms!");
        Printer.slowPrint("Your Adventure Has Ended!");

        Input.close();

    }

    public static void run(Room room) {
        while(!room.isSolved) {
            room.run();
            if(!room.isSolved) {
                Printer.slowPrint("You have not solved the room yet. Try again.");
            }
        }
    }
}
