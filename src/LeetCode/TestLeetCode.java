package LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLeetCode {
    @Test
    @DisplayName("RomanToInt")
    public void RomanToInt(){
        String s = "MCMXCIV";
        romanToInt R = new romanToInt();
        System.out.println(R.romanToInt(s));
    }
}
