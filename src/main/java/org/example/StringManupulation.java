package org.example;

import java.util.ArrayList;
import java.util.List;
class StringManipulation {

    public static void main(String[] args) {

        String str = "ab2c4d45ef234";
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        boolean lastCharWasDigit = false;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!lastCharWasDigit && !sb.isEmpty()) {
                    strings.add(sb.toString());
                    sb.setLength(0);
                }
                sb.append(c);
                lastCharWasDigit = true;
            } else {
                if (lastCharWasDigit && !sb.isEmpty()) {
                    numbers.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                }
                sb.append(c);
                lastCharWasDigit = false;
            }
        }

        if (!sb.isEmpty()) {
            if (lastCharWasDigit) {
                numbers.add(Integer.parseInt(sb.toString()));
            } else {
                strings.add(sb.toString());
            }
        }

        System.out.println("Integers: " + numbers);
        System.out.println("Strings: " + strings);
    }
}