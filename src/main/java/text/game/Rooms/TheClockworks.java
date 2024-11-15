package text.game.Rooms;

import text.game.Adventurer.Exiter;
import text.game.IO.Input;
import text.game.IO.Printer;
import text.game.Items.KeyFragments;

public class TheClockworks extends Room {
    public void run() {
        Printer.slowPrint("You are suddenly transported in front of three different large, imposing clocks signifying the year, month and day of a particular event.\n A disembodied voice speaks \n \" Guess the incident and take the keys, otherwise perish. \"");
        Printer.slowPrint("1984 - 06 - 02");

        String ans = Input.getLine();

        if(ans.equalsIgnoreCase("The Bhopal Gas Tragedy")) {
            this.isSolved = true;

            Printer.slowPrint("\"Congratulations, adventurer for having guessed the incident. You have successfully solved the room.\"");

            KeyFragments.updateCount();

            return;
        }
        
        Exiter.defeatExit();
    }
}
