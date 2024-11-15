package text.game.Rooms;

import text.game.Adventurer.Exiter;
import text.game.IO.Input;
import text.game.IO.Printer;
import text.game.Items.KeyFragments;

public class TheEscapeChamber extends Room{
    public void run() {
        Printer.slowPrint("You are in a dark and narrow room, with a single door at the end of the room.");
        Printer.slowPrint("1. Open the door.");
        Printer.slowPrint("2. Remain stuck in the void.");

        int option = Input.getInt();

        if(option == 1) {
            if(KeyFragments.count == 3) {
                Printer.slowPrint("You have successfully escaped the void.");
                this.isSolved = true;
                return;
            } else {
                Printer.slowPrint("You are doomed to spend the rest of your life here.");
                Exiter.exit();
            }
        }

        Printer.slowPrint("You remain stuck in the void.");
        Exiter.exit();
        
    }
}
