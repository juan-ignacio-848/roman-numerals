package com.nmkip.romannumerals;

public class RomanNumeralConverter {

    private Numeral[] knownNumerals = new Numeral[] {
                new Numeral("M", 1000),
                new Numeral("CM", 900),
                new Numeral("D", 500),
                new Numeral("CD", 400),
                new Numeral("C", 100),
                new Numeral("XC", 90),
                new Numeral("L", 50),
                new Numeral("XL", 40),
                new Numeral("X", 10),
                new Numeral("IX", 9),
                new Numeral("V", 5),
                new Numeral("IV", 4),
                new Numeral("I", 1)
    };

    public int toArabic(String roman) {
        int arabic = 0;
        for (Numeral knownNumeral : knownNumerals) {
                while (roman.length() > 0) {
                    if (!roman.startsWith(knownNumeral.getRoman())) {
                        break;
                    }
                    arabic += knownNumeral.getArabic();
                    roman = removeConsumedNumeralFrom(roman, knownNumeral.getRoman());
                }
        }

        return  arabic;
    }

    private String removeConsumedNumeralFrom(String romanNumeral, String consumed) {
        return romanNumeral.substring(consumed.length());
    }

    private class Numeral {
        private String roman;
        private int arabic;

        public Numeral(String roman, int arabic) {
            this.roman = roman;
            this.arabic = arabic;
        }

        public String getRoman() {
            return roman;
        }

        public int getArabic() {
            return arabic;
        }
    }
}
