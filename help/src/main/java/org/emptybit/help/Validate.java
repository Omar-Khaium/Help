package org.emptybit.help;

public class Validate {
    public static String Check(String value) {
        if (value.equals("") || value.equals("null") || value == null) return "-";
        else return value;
    }
}
