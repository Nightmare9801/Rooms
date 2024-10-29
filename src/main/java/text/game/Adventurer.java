package text.game;

public class Adventurer {
    Data data;
    Inventory inventory;

    public int currentHealth = 900;
    public int maxHealth = 900;

    public Adventurer() {
        data = new Data();
        inventory = new Inventory();
    }

    public int inflict(int damagePoints) {
        currentHealth -= damagePoints;
        if (currentHealth <= 0) {
            System.out.println("You have been defeated!");
            System.exit(0);
        }
        return damagePoints;
    }

    public int use(String name) {
        return inventory.use(name, this);
    }
}
