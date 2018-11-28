package com.nmkip.romannumerals;

public class RomanNumeralGenerator {

    public static String romanFor(int decimal) {

        String roman = "";
        for (RomanDecimal romanDecimal : RomanDecimal.values()) {
            while (decimal >= romanDecimal.decimal) {
                roman += romanDecimal.roman;
                decimal -= romanDecimal.decimal;
            }
        }

        return roman;
    }

    private enum RomanDecimal {
        THOUSAND("M", 1000),
        FIVE_HUNDRED("D", 500),
        ONE_HUNDRED("C", 100),
        FIFTY("L", 50),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);

        private String roman;
        private int decimal;

        RomanDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }

    }
}
