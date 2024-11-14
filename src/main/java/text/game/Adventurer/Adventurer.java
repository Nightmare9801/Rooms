package text.game.Adventurer;

public class Adventurer {
    public boolean isDead = false;

    public void kill() {
        isDead = true;
        System.out.println("You have been defeated!");
        System.exit(0);
    }
}
