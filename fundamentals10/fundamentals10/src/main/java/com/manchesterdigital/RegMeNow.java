package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class RegMeNow {
    public static Map<String, String> regLookup;

    static{
        regLookup = new HashMap<>();
        regLookup.put("S", "5");
        regLookup.put("A", "4");
        regLookup.put("G", "9");
        regLookup.put("B", "8");
        regLookup.put("I", "1");
    }

    public boolean isLengthValid(String reg) {

        if ((reg.length() >= 5) && (reg.length() <= 7)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            throw new InvalidRegistrationLengthException("Registration length is not within the correct bounds " + reg);
        }

    }

    public String returnBuildRegistration(String[] stringArr) {
        StringBuilder output = new StringBuilder();

        for (String regChar : stringArr) {
            if (regLookup.containsKey(regChar)) {
                output.append(regLookup.get(regChar));
            } else {
                output.append(regChar);
            }
        }
        System.out.println(output.toString());
        return output.toString();
    }

    public String regConvertor(String subject) {
        subject = subject.toUpperCase();
        String[] regCharacters = subject.split("");
        StringBuilder output = new StringBuilder();


//        Map<String, String> regLookup = new HashMap<>();
//        regLookup.put("S", "5");
//        regLookup.put("A", "4");
//        regLookup.put("G", "9");
//        regLookup.put("B", "8");
//        regLookup.put("I", "1");

        if (isLengthValid(subject)) {
//            for (String regChar : regCharacters) {
//                if (regLookup.containsKey(regChar)) {
//                    output.append(regLookup.get(regChar));
//                } else {
//                    output.append(regChar);
//                }
//            }

            return returnBuildRegistration(regCharacters);
        }
        return returnBuildRegistration(regCharacters);
    }

}
