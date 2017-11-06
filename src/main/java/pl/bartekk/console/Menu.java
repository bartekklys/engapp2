package pl.bartekk.console;

import java.util.Scanner;

public class Menu {

    public static final String IRREGULAR_VERBS = "Irregular verbs";

    private Scanner reader = new Scanner(System.in);

    public void start() {
        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Column name     | ID   |%n");
        System.out.format("+-----------------+------+%n");
        System.out.format(leftAlignFormat, IRREGULAR_VERBS, 1);
        System.out.format("+-----------------+------+%n");
    }
}
