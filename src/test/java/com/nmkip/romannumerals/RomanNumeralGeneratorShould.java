package com.nmkip.romannumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.nmkip.romannumerals.RomanNumeralGenerator.romanFor;
import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Roman Numeral Generator should")
public class RomanNumeralGeneratorShould {

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
            "20, XX",
            "40, XL",
            "60, LX",
            "90, XC",
            "400, CD",
            "900, CM",
            "234, CCXXXIV",
            "344, CCCXLIV",
            "999, CMXCIX",
            "3999, MMMCMXCIX"
    })
    public void
    generate_roman_numeral_for_a_given_decimal_number(int decimal, String roman) {
        assertThat(romanFor(decimal)).isEqualTo(roman);
    }


}
