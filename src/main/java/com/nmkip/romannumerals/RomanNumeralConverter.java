package com.nmkip.romannumerals;

public class RomanNumeralConverter {

    public int from(String romanNumeral) {
        validateFormat(romanNumeral);

        int result = 0;
        int i = 0;
        while(i < romanNumeral.length()) {
            if(i + 1 < romanNumeral.length()) {
                if(romanNumeral.charAt(i) == 'I' && romanNumeral.charAt(i + 1) == 'V') {
                    result += arabicValueFor("IV");
                    i += 2;
                    continue;
                } else if(romanNumeral.charAt(i) == 'I' && romanNumeral.charAt(i + 1) == 'X') {
                    result += arabicValueFor("IX");
                    i += 2;
                    continue;
                } else if(romanNumeral.charAt(i) == 'X' && romanNumeral.charAt(i + 1) == 'L') {
                    result += arabicValueFor("XL");
                    i += 2;
                    continue;
                } else if(romanNumeral.charAt(i) == 'X' && romanNumeral.charAt(i + 1) == 'C') {
                    result += arabicValueFor("XC");
                    i += 2;
                    continue;
                } else if(romanNumeral.charAt(i) == 'C' && romanNumeral.charAt(i + 1) == 'D') {
                    result += arabicValueFor("CD");
                    i += 2;
                    continue;
                } else if(romanNumeral.charAt(i) == 'C' && romanNumeral.charAt(i + 1) == 'M') {
                    result += arabicValueFor("CM");
                    i += 2;
                    continue;
                }
            }

            result += arabicValueFor(String.valueOf(romanNumeral.charAt(i)));
            i += 1;
        }

        return result;
    }

    private int arabicValueFor(String roman) {
        if(roman.equals("I")) {
            return 1;
        } else if(roman.equals("IV")) {
            return 4;
        } else if(roman.equals("V")) {
            return 5;
        } else if(roman.equals("IX")) {
            return 9;
        } else if(roman.equals("X")) {
            return 10;
        } else if(roman.equals("XL")){
            return 40;
        } else if(roman.equals("L")){
            return 50;
        } else if(roman.equals("XC")){
            return 90;
        } else if(roman.equals("C")){
            return 100;
        } else if(roman.equals("CD")){
            return 400;
        } else if(roman.equals("D")){
            return 500;
        } else if(roman.equals("CM")){
            return 900;
        } else {
            return 1000;
        }
    }

    private void validateFormat(String roman) {

        char lastChar = roman.charAt(0);
        int lastCharCounter = 0;
        int D_counter = 0;
        int L_counter = 0;
        int V_counter = 0;
        for(char c : roman.toCharArray()) {
            if(c == 'V') {
                V_counter += 1;
                if(V_counter == 2) {
                    throw new InvalidRomanNumberException("Invalid roman number: " + roman);
                }
            }

            if(c == 'L') {
                L_counter += 1;
                if(L_counter == 2) {
                    throw new InvalidRomanNumberException("Invalid roman number: " + roman);
                }
            }

            if(c == 'D') {
                D_counter += 1;
                if(D_counter == 2) {
                    throw new InvalidRomanNumberException("Invalid roman number: " + roman);
                }
            }

            if(c == 'I' || c == 'X' || c == 'C' || c == 'M') {
                if(lastChar != c) {
                    lastChar = c;
                    lastCharCounter = 0;
                } else {
                    lastCharCounter ++;
                }
            }

            if(lastCharCounter >= 4) {
                throw new InvalidRomanNumberException("Invalid roman number: " + roman);
            }
        }
    }
}
