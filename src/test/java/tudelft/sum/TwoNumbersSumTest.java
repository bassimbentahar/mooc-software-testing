package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void addSmallNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(new ArrayList<>(Arrays.asList(2, 4, 3)), new ArrayList<>(Arrays.asList(5, 6, 4)));

        Assertions.assertEquals( new ArrayList<>(Arrays.asList(7, 0, 8)), result);

    }

    @Test
    public void addLargNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(new ArrayList<>(Arrays.asList(9,9,9,9,9,9,9)), new ArrayList<>(Arrays.asList(9,9,9,9)));

        Assertions.assertEquals( new ArrayList<>(Arrays.asList(8,9,9,9,0,0,0,1)), result);

    }

}
