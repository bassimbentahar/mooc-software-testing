package tudelft.roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomanNumeral2 {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    }

    public static int convert(String romanNumeral) {
        char charAt = romanNumeral.charAt(0);
        int stringLength = romanNumeral.length();
        if (stringLength == 1) return map.get(charAt);

        int lastIndex = stringLength - 1;
        int total = map.get(romanNumeral.charAt(lastIndex));

        for (int index = lastIndex; index >= 0; index--) {
            int currentNumber = map.get(romanNumeral.charAt(index));
            int before = index  > 0 ? map.get(romanNumeral.charAt(index-1)) : 0;
            if (currentNumber <= before) {
                total += before;

            }else  {
                total -= before;
            }

        }
        return total;

        /* Alternative
        for (int index = lastIndex-1; index >= 0; index--) {
            int currentNumber = map.get(romanNumeral.charAt(index));
            int after = map.get(romanNumeral.charAt(index+1));

            if (currentNumber < after) {
                total -= currentNumber;

            }else  {
                total += currentNumber;
            }
        }
        * */
    }
}
