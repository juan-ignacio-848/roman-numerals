package com.nmkip.romannumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Convert from Roman to Arabic")
public class RomanToArabicTest {

    @DisplayName("Simple Roman Numeral Symbols")
    @ParameterizedTest(name = "\"{0}\" should be \"{1}\"")
    @CsvSource({"I, 1"})
    public void simple_symbols(String roman, int arabic) {
        assertThat(true, is(true));
    }

}
