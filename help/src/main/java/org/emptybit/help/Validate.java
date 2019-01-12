package org.emptybit.help;

public class Validate {
    public static boolean Check(String value) {
        return !value.equals("") && !value.equals("null") && value != null;
    }
}
