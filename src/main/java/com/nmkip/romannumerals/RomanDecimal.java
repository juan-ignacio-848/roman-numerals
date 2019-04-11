package com.nmkip.romannumerals;

enum RomanDecimal {
    ONE_THOUSAND("M", 1000),
    NINE_HUNDRED("CM", 900),
    FIVE_HUNDRED("D", 500),
    FOUR_HUNDRED("CD", 400),
    ONE_HUNDRED("C", 100),
    NINETY("XC", 90),
    FIFTY("L", 50),
    FORTY("XL", 40),
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1);

    private final String roman;
    private final int decimal;

    RomanDecimal(String roman, int decimal) {
        this.roman = roman;
        this.decimal = decimal;
    }

    String roman() {
        return roman;
    }

    int decimal() {
        return decimal;
    }
}
