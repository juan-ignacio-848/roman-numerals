package com.nmkip.romannumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Convert from Roman to Arabic")
public class RomanToArabicTest {

    private RomanNumeralConverter converter;

    @BeforeEach
    void setUp() {
        converter = new RomanNumeralConverter();
    }

    @DisplayName("Convert to Arabic")
    @ParameterizedTest(name = "\"{0}\" should be \"{1}\"")
    @CsvSource({"I, 1", "II, 2", "III, 3", "IV, 4", "V, 5", "IX, 9", "X, 10", "XXXIV, 34", "MCMXCII, 1992"})
    public void convertSymbols(String roman, int arabic) {
        assertThat(converter.from(roman), is(arabic));
    }


    @DisplayName("'I', 'X', 'C' and 'M' can be repeated at most 3 times in a row")
    @ParameterizedTest(name = "\"{0}\" should throw an InvalidRomanNumberException")
    @ValueSource(strings = {"IIII", "XXXX", "CCCC", "MMMM"})
    public void maximumThreeRepetitionsInARow(String notRoman) {
        assertThrows(InvalidRomanNumberException.class, () -> converter.from(notRoman));
    }

    @DisplayName("'V', 'L' and 'D' can never be repeated")
    @ParameterizedTest(name = "\"{0}\" should throw an InvalidRomanNumberException")
    @ValueSource(strings = {"DD", "LL", "VV", "DVD", "VLDD", "IDMD"})
    public void nonRepeatableSymbols(String notRoman) {
        assertThrows(InvalidRomanNumberException.class, () -> converter.from(notRoman));
    }
}
