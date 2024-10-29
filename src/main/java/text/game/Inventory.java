package text.game;

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

    public static void removeItem(int no) {
        if (items[no]!= null) {
            items[no] = null;
            System.out.println("Removed item from inventory.");
        } else {
            System.out.println("There is no item at position " + no + ".");
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
                if (items[i].isEatable) {
                    System.out.println("Used " + items[i].getName() + ".");
                    if (items[i].healingPoints > 0) {
                        adventurer.currentHealth += items[i].healingPoints;
                        if (adventurer.currentHealth > adventurer.maxHealth) {
                            adventurer.currentHealth = adventurer.maxHealth;
                        }
                    }
                    removeItem(i);
                } else if (items[i].isWeapon) {
                    return items[i].damagePoints;
                }
                return -1;
            }
        }
        System.out.println("You don't have " + name + " in your inventory.");

        return -1;
    }
}
