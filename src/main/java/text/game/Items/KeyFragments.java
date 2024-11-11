package text.game.Items;

public class KeyFragments extends Item {
    public static int count = 1;
    
    public KeyFragments() {
        super("Key Fragments");
    }
    
    public static void updateCount() {
        count++;
    }
}
