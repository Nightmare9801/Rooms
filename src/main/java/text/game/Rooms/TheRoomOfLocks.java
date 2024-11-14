package text.game.Rooms;

import text.game.Adventurer.Adventurer;
import text.game.Input.Input;
import text.game.Items.KeyFragments;

public class TheRoomOfLocks  extends Room {
    public void run(Adventurer adv) {
        System.out.println("As usual you are transported to a new environment. However, this room seems to be different. Only a plain room is present with a locked door at the end.");
        System.out.println("You notice a bunch of flyers stuck on the walls. \n4-8-2 => 1 number is correct and well-placed.\n4-1-6 => One number is correct but wrongly placed.\n2-0-6 => Two numbers are correct but wrongly placed.\n7-3-8 => All digits are wrong.\n3-8-0 => One digit is correct but in the wrong place.");

        String ans = Input.getLine();

        if(ans.equalsIgnoreCase("0-4-2")) {
            System.out.println("You have successfully solved the room.");
            KeyFragments.updateCount();
                
            this.isSolved = true;
            return;
        }

        adv.kill();
    }
}
