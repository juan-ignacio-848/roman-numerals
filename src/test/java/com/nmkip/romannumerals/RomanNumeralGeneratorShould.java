package com.nmkip.romannumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("RomanNumeralGenerator should")
class RomanNumeralGeneratorShould {

    @DisplayName("Generate a roman numeral for a given decimal number")
    @ParameterizedTest(name = "\"{0}\" should be \"{1}\"")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X",
            "11, XI",
            "15, XV",
            "18, XVIII",
            "18, XVIII",
            "20, XX",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "846, DCCCXLVI",
            "900, CM",
            "1000, M",
            "1999, MCMXCIX",
    })
    void
    generate_roman_numeral_for_a_given_decimal_number(int decimal, String roman) {
        RomanNumeralGenerator romanNumeralGenerator = new RomanNumeralGenerator();
        assertThat(romanNumeralGenerator.romanFor(decimal)).isEqualTo(roman);
    }


}
