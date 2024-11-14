package text.game.Adventurer;

import text.game.Input.Input;

public class Adventurer {
    public boolean isDead = false;

    public void kill() {
        isDead = true;
        System.out.println("You have been defeated!");
        Input.close();
        System.exit(0);
    }
}
