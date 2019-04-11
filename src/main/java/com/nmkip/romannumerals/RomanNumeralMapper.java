package com.nmkip.romannumerals;

class RomanNumeralMapper {

    String toRomanNumeral(int decimal) {

        StringBuilder roman = new StringBuilder();

        for (RomanDecimal romanDecimal : RomanDecimal.values()) {
            while (decimal >= romanDecimal.decimal()) {
                roman.append(romanDecimal.roman());
                decimal -= romanDecimal.decimal();
            }
        }

        return roman.toString();
    }

}
