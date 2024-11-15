package text.game.IO;

public class Printer {
    public static void slowPrint(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50); // Pause for the specified delay
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }
}
