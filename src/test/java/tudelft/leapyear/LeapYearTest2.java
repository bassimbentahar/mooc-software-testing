package tudelft.LeapYear2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.leapyear.LeapYear2;

public class LeapYearTest2 {
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        LeapYear2 ly = new LeapYear2();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        LeapYear2 ly = new LeapYear2();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        LeapYear2 ly = new LeapYear2();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        LeapYear2 ly = new LeapYear2();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
