package text.game.Adventurer;

import java.util.ArrayList;

import text.game.Rooms.Room;
import text.game.Rooms.SphinxsLair;

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
        lair.run(adv);
    }
}
