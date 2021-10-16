package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args) {

        System.out.println(scan("C:\\401java\\java-fundamentals\\linter\\gates.js"));
    }

    public static String scan(String path) {
        File file = new File(path);
        Scanner scan;
        int lineNumber = 1;
        boolean flag = false;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if ((!line.endsWith(";")) && (line.endsWith("}") || line.endsWith("{") || line.contains("if") || line.contains("else") || line.isBlank())) {
                    flag = true;
                    System.out.println("line " + lineNumber + ":missing semicolon");
                }
                lineNumber++;
                if (flag == false) {
                    return "no error";
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return "line " + lineNumber + ":missing semicolon";
    }
}