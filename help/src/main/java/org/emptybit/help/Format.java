package org.emptybit.help;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Format {
    public static String Text(String value) {
        if (value.equals("") || value.equals("null") || value == null) return "-";
        else return value;
    }

    public static String Name(String firstName, String secondName) {
        if (firstName.equals("") || firstName.equals("null") || firstName == null) {
            if (secondName.equals("") || secondName.equals("null") || secondName == null)
                return "-";
            else return secondName;
        } else {
            if (secondName.equals("") || secondName.equals("null") || secondName == null)
                return firstName;
            else return firstName + " " + secondName;
        }
    }

    public static String Address(String address, String city, String state, String zip) {
        String finalAddress = "";
        if (address.isEmpty()) {
            if (city.isEmpty()) {
                if (state.isEmpty()) {
                    if (zip.isEmpty()) {
                        finalAddress = "-";
                    } else {

                        finalAddress = zip;
                    }
                } else {
                    if (zip.isEmpty()) {
                        finalAddress = state;
                    } else {
                        finalAddress = state + " " + zip;
                    }
                }
            } else {
                if (state.isEmpty()) {
                    if (zip.isEmpty()) {
                        finalAddress = city;
                    } else {
                        finalAddress = city + ", " + zip;
                    }
                } else {
                    if (zip.isEmpty()) {
                        finalAddress = city + ", " + state;
                    } else {
                        finalAddress = city + ", " + state + " " + zip;
                    }
                }
            }
        } else {
            if (city.isEmpty()) {
                if (state.isEmpty()) {
                    if (zip.isEmpty()) {
                        finalAddress = address;
                    } else {

                        finalAddress = address + "\n" + zip;
                    }
                } else {
                    if (zip.isEmpty()) {
                        finalAddress = address + "\n" + state;
                    } else {
                        finalAddress = address + "\n" + state + " " + zip;
                    }
                }
            } else {
                if (state.isEmpty()) {
                    if (zip.isEmpty()) {
                        finalAddress = address + "\n" + city;
                    } else {
                        finalAddress = address + "\n" + city + ", " + zip;
                    }
                } else {
                    if (zip.isEmpty()) {
                        finalAddress = address + "\n" + city + ", " + state;
                    } else {
                        finalAddress = address + "\n" + city + ", " + state + " " + zip;
                    }
                }
            }
        }
        return finalAddress;
    }

    public static String Date(String date) {
        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return dateFormat.format(fromUser.parse(date));
        } catch (ParseException e) {
            return "-";
        }
    }

    public static String Date(String date, String format) {
        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            return dateFormat.format(fromUser.parse(date));
        } catch (ParseException e) {
            return "-";
        }
    }
}
