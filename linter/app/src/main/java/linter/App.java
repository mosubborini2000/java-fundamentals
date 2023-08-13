package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Path path = Path.of("app/src/main/resources/fileIO.txt");
        try (Scanner read = new Scanner(path)) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            int count = 1;

            while (read.hasNextLine()) {
                String line = read.nextLine();
                if (line.trim().isEmpty() || line.trim().endsWith(";") || line.trim().endsWith("{") || line.trim().endsWith("}")) {
                    System.out.println(line);
                } else {
                    System.out.println("Line " + count + ": Missing semicolon.");
                }
                count++;
            }

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        } catch (IOException e) {
            System.out.println("Error Reading The File : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
