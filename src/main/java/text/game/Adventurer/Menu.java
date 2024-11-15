package text.game.Adventurer;

import text.game.IO.Input;
import text.game.IO.Printer;
import text.game.Rooms.Room;
import text.game.Rooms.SphinxsLair;
import text.game.Rooms.TheClockworks;
import text.game.Rooms.TheEscapeChamber;
import text.game.Rooms.TheRoomOfLocks;

public class Menu {
    static Room[] rooms = {new SphinxsLair(), new TheClockworks(), new TheRoomOfLocks(), new TheEscapeChamber()};
    static int revealer = 0;

    public static void run() {
        Printer.slowPrint("You wake up to a pure nothingness around you. As you try to figure out where you are, you notice a menu.");

        printRoomList();

        Printer.slowPrint("Inquisitively, you try to tap on the the first option.");

        for(Room room : rooms) {
            run(room);
            printRoomList();
        }

        Printer.slowPrint("Congratulations! You have solved all the rooms!");
        Printer.slowPrint("Your Adventure Has Ended!");

        Input.close();

    }

    public static void printRoomList() {
        String names[] = {"The Sphinx's Lair", "The Clockworks", "The Room Of Locks", "The Escape Chamber"};
        Printer.slowPrint("Room List");
        for(int i = 0; i < 4; i++) {
            if(i < revealer) {
                Printer.slowPrint((i + 1) + ". " + names[i] + " -> Solved");
            } else if(i == revealer) {
                Printer.slowPrint((i + 1) + ". " + names[i]);
            } else {
                Printer.slowPrint((i + 1) + ". <Locked>");
            }
        }
        revealer++;
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
