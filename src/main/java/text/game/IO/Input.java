package text.game.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static String getLine() {
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return "";
    }

    public static int getInt() {
        try {
            return Integer.parseInt(in.readLine());
        } catch (NumberFormatException | IOException e) {
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
