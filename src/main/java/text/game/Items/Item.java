package text.game.Items;

import text.game.Adventurer.Adventurer;

public class Item {
    public String itemName = "";

    public Item(String name) {
        this.itemName = name;
    }

    public String getName() {
        return itemName;
    }

    public int use(Adventurer adv) {
        return 0;
    }
}
