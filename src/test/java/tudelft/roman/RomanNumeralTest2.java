package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest2 {


    @Test
    public void singleNumber() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert("VII");
        Assertions.assertEquals(7, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert("MMXXIV");
        Assertions.assertEquals(2024, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }


    @Test
    public void numberWithAndWithoutSubtractiveNotation2() {
        RomanNumeral2 roman = new RomanNumeral2();
        int result = roman.convert("LVIII");
        Assertions.assertEquals(58, result);
    }
}
