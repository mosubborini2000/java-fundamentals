package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> errors = erorrMethod("test1.js");
        for (String error : errors) {
            System.out.println(error);
        }
    }

    public static List<String> erorrMethod(String fileName) {
        List<String> errorArr = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Path.of("src/test/resources/" + fileName));
            int count = 1;

            if (!scanner.hasNextLine()) {
                errorArr.add("Empty File");
            } else {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.trim().isEmpty()&&
                            !line.trim().endsWith(";") &&
                            !line.trim().endsWith("{") &&
                            !line.trim().endsWith("}") &&
                            !line.contains("if") &&
                            !line.contains("else") &&
                            !line.trim().startsWith("//")) {
                        errorArr.add("Line " + count + ": " + "Missing semicolon");
                    }
                    count++;
                }
            }

            scanner.close();

            if (errorArr.isEmpty()) {
//                errorArr.add("there is not any error");
                System.out.println("there is not any error");
            }
        } catch (IOException e) {
            System.out.println("error:failed reading this file: " + e.getMessage());
        }
        return errorArr;
    }
}