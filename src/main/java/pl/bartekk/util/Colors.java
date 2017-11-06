package pl.bartekk.util;

import pl.bartekk.entity.IrregularVerb;
import pl.bartekk.entity.Level;

public class Colors {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static String printLevel(IrregularVerb verb) {

        switch (verb.getLevel()) {
            case A1:
                return ANSI_GREEN + Level.A1 + ANSI_RESET;
            case A2:
                return ANSI_GREEN + Level.A2 + ANSI_RESET;
            case B1:
                return ANSI_CYAN + Level.B1 + ANSI_RESET;
            case B2:
                return ANSI_CYAN + Level.B2 + ANSI_RESET;
            case C1:
                return ANSI_RED + Level.C1 + ANSI_RESET;
            case C2:
                return ANSI_RED + Level.C2 + ANSI_RESET;
            default:
                return "No color";
        }
    }
}
