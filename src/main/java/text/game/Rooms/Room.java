package text.game.Rooms;

import java.util.ArrayList;

import text.game.Adventurer.Adventurer;
import text.game.Items.Item;

public abstract class Room {
    public boolean isSolved = false;
    public static String name = "";
    ArrayList<Item> items = new ArrayList<>();
    public void run(Adventurer adventurer) {
        
    }
}
