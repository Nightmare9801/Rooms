package text.game;

public class Armour extends Item {
    public int armourPoints = 0;

    public Armour(String itemName, int armourPoints) {
        this.itemName = itemName;
        this.armourPoints = armourPoints;
    }

    public Armour() {

    }

    public int getArmourPoints() {
        return armourPoints;
    }
}
