package text.game.Items;

import text.game.Adventurer.Adventurer;

public class RingOfDiscontinuity extends Item {
    public RingOfDiscontinuity() {
        super("Ring of Discontinuity");
    }

    public int use(Adventurer adv) {

        if(adv.currRoom != null && adv.currRoom.isSolved == false) {
            adv.currRoom.isSolved = true;

            return -1;
        }

        return 0;
    }
}
