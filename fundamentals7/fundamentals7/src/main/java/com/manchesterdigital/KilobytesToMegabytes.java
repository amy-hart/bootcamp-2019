package com.manchesterdigital;


public class KilobytesToMegabytes {

        private static final int KILOBYTE_UNITS = 1024;

    public static String convert(int numberInKilobytes) {
        // Work out whole megabytes
        Double megabytes = new Double(numberInKilobytes / KILOBYTE_UNITS);
        StringBuilder resultsString = new StringBuilder();
        resultsString.append(megabytes.intValue());
        resultsString.append("MB");

        // Work out left over kilobytes
        Double kilobytes = new Double(numberInKilobytes % KILOBYTE_UNITS);
        if(kilobytes > 0){
            resultsString.append(" and ").append(kilobytes.intValue()).append("KB");
        }

        return resultsString.toString();
    }
}
