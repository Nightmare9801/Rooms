package text.game.Adventurer;

import text.game.Rooms.Room;

public class Adventurer {
    public Inventory inventory;

    public boolean isDead = false;

    public Room currRoom;

    public Adventurer() {
        inventory = new Inventory();
    }

    public int use(String name) {
        return inventory.use(name, this);
    }

    public void kill() {
        isDead = true;
        System.out.println("You have been defeated!");
        System.exit(0);
    }
}
