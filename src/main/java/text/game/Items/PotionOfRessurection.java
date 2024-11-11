package text.game.Items;

import text.game.Adventurer.Adventurer;

public class PotionOfRessurection extends Item {
    public PotionOfRessurection() {
        super("Potion of Ressurection");
    }

    public int use(Adventurer adv) {
        if(adv.isDead) {
            adv.isDead = false;

            return -1;
        }

        return 0;
    }
}
