package com.nmkip.romannumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.nmkip.romannumerals.RomanNumeralGenerator.*;
import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("Roman Numeral Generator should")
public class RomanNumeralGeneratorShould {

    @DisplayName("Generate a roman numeral for a given decimal number")
    @ParameterizedTest(name = "\"{0}\" should be \"{1}\"")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
            "6, VI",
    })
    public void
    generate_roman_numeral_for_a_given_decimal_number(int decimal, String roman) {
        assertThat(romanFor(decimal)).isEqualTo(roman);
    }


}
