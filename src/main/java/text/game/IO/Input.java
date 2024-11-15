package text.game.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static String getLine() {
        try {
            return in.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return "";
    }

    public static int getInt() {
        try {
            int x = 0;
            String s = getLine();
            while (!s.matches("\\d+")) {
                System.out.println("Invalid input. Please enter a valid integer.");
                s = getLine();
            }
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return 0;
    }

    public static void close() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
