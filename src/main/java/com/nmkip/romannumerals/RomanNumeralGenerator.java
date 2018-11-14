package com.nmkip.romannumerals;

public class RomanNumeralGenerator {

    public static String romanFor(int decimal) {
        String roman = "";

        for(RomanArabic romanArabic : RomanArabic.values()) {
            while(decimal >= romanArabic.decimal) {
                roman += romanArabic.roman;
                decimal -= romanArabic.decimal;
            }
        }

        return roman;
    }

    private enum RomanArabic {

        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private final int decimal;
        private final String roman;

        RomanArabic(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
