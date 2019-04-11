package com.nmkip.romannumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Roman Numeral Mapper should")
class RomanNumeralMapperShould {

    @DisplayName("Map decimal to roman numeral representation")
    @ParameterizedTest(name = "{0} should be {1}")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "9, IX",
            "10, X",
            "11, XI",
            "14, XIV",
            "20, XX",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "289, CCLXXXIX",
            "400, CD",
            "500, D",
            "898, DCCCXCVIII",
            "900, CM",
            "1000, M"
    })
    void map_decimal_to_numeral(int decimal, String roman) {
        RomanNumeralMapper romanNumeralMapper = new RomanNumeralMapper();
        assertThat(romanNumeralMapper.toRomanNumeral(decimal), is(roman));
    }
}
