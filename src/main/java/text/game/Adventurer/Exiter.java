package text.game.Adventurer;

import text.game.IO.Input;
import text.game.IO.Printer;

public class Exiter {
    public static void exit() {
        Input.close();
        System.exit(0);
    }

    public static void defeatExit() {
        Printer.slowPrint("You have been defeated");
        exit();
    }
}
