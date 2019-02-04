package com.nmkip.romannumerals;

class RomanNumeralGenerator {
    String romanFor(int arabic) {

        StringBuilder roman = new StringBuilder();

        for (RomanArabic romanArabic : RomanArabic.values()) {
            while (arabic >= romanArabic.arabic) {
                roman.append(romanArabic.roman);
                arabic -= romanArabic.arabic;
            }
        }

        return roman.toString();
    }

    enum RomanArabic {
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

        private String roman;
        private int arabic;

        RomanArabic(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }

    }
}

