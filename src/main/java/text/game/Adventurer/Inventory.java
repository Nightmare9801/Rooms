package text.game.Adventurer;

import text.game.Items.Item;

public class Inventory {
    public static Item[] items = new Item[20];

    public static void addItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Added " + item.getName() + " to your inventory.");
                return;
            }
        }
        System.out.println("Inventory is full. Cannot add " + item.getName() + ".");
    }

    public boolean contains(String name) {
        for (Item item : items) {
            if (item!= null && item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeItem(int no) {
        if (items[no]!= null) {
            items[no] = null;
            System.out.println("Removed item from inventory.");
        } else {
            System.out.println("There is no item at position " + no + ".");
        }
    }

    public void removeItem(String name) {
        for(Item item : items) {
            if (item!= null && item.getName().equals(name)) {
                item = null;
                System.out.println("Removed " + name + " from your inventory.");
                return;
            }
        }
    }

    public static void displayInventory() {
        System.out.println("Your inventory:");
        for (int i = 0; i < items.length; i++) {
            if (items[i]!= null) {
                System.out.println((i+1) + ") " + items[i].getName());
            }
        }
    }

    public int use(String name, Adventurer adventurer) {
        for (int i = 0; i < items.length; i++) {
            if (items[i]!= null && items[i].getName().equals(name)) {
                return 0;
            }
        }
        System.out.println("You don't have " + name + " in your inventory.");

        return -1;
    }
}
