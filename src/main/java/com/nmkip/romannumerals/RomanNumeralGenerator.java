package com.nmkip.romannumerals;

public class RomanNumeralGenerator {

    public static String romanFor(int decimal) {

        String roman = "";
        for (RomanDecimal romanDecimal : RomanDecimal.values()) {
            if (decimal >= romanDecimal.decimal) {
                roman += romanDecimal.roman;
                decimal -= romanDecimal.decimal;
            }
        }

        for (int i = 0; i < decimal; i++) {
            roman += "I";
        }

        return roman;
    }

    private enum RomanDecimal {
        TEN("X", 10),
        FIVE("V", 5);

        private String roman;
        private int decimal;

        RomanDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }

    }
}
