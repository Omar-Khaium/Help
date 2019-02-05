package org.emptybit.help;

import android.widget.EditText;
import android.widget.Spinner;

public class Validate {

    public static boolean Input(EditText text) {
        return !text.getText().toString().isEmpty();
    }

    public static boolean Spinner(Spinner spinner) {
        return spinner.getSelectedItemPosition() != 0;
    }

    public static String Phone(String number) {
        String formatText = "";
        if (number.equals("")) {
            return "";
        } else if (number.contains("-")) {
            number = number.replace("-", "");
        }

        boolean hasCountryCode = false;
        if (number.startsWith("1")) {
            formatText = "1";
            number = number.substring(1);
            hasCountryCode = true;
        } else if (number.startsWith("+1")) {
            formatText = "+1";
            number = number.substring(2);
            hasCountryCode = true;
        } else if (number.startsWith("001")) {
            formatText = "001";
            number = number.substring(3);
            hasCountryCode = true;
        }

        for (int i = 0; i < 3; i++) {
            if (!number.equals("")) {
                String chunk = "";
                if (i == 2) {
                    chunk = number;
                    number = "";
                } else {
                    if (number.length() >= 3) {
                        chunk = number.substring(0, 3);
                        number = number.substring(3);
                    } else {
                        chunk = number;
                        number = "";
                    }

                }
                if (i == 0) {
                    if (hasCountryCode) {
                        formatText += "-" + chunk;
                    } else {
                        formatText += chunk;
                    }
                } else {
                    formatText += "-" + chunk;
                }
            } else {
                return formatText;
            }
        }
        return formatText;
    }

    public static String ReversePhone(String number) {
        if (number.contains("-")) {
            return number.replace("-", "");
        } else {
            return number;
        }
    }
}
