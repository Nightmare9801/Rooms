package text.game;

public class Item {
    public String itemName = "";

    public int damagePoints = 0;
    public int healingPoints = 0;
    public boolean isEatable = false;
    public boolean isWeapon = false;
    public boolean isArmour = false;

    public String getName() {
        return itemName;
    }

    public int[] getStats() {
        return new int[]{damagePoints, healingPoints, isEatable? 1 : 0, isWeapon? 1 : 0, isArmour ? 1 : 0};
    }
}
