package dev.desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
public class Table {
    // hashmap storing content
    public HashMap<String, String> content = new HashMap<String, String>();
    public Table(File path) throws FileNotFoundException {
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            String rawContent = scanner.nextLine();
            String[] rawContentArr = rawContent.split("\\|");
            try {
                content.put(rawContentArr[0], rawContentArr[1]);
            } catch (Exception ignored) {
                // if array out of bounds exception
            }
        }
    }
}
