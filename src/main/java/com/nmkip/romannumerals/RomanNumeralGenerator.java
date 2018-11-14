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

        for(int i = 0; i < decimal; i++) {
            roman += "I";
        }

        return roman;
    }

    private enum RomanArabic {

        TEN("X", 10),
        FIVE("V", 5);

        private final int decimal;
        private final String roman;

        RomanArabic(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
