import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOperations {

    public HashMap<Character, Integer> getFirstOccurrenceOfChars(String str) {
        HashMap<Character, Integer> score = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (score.containsKey(charAt))
                score.put(charAt, score.get(charAt) + 1);
            else
                score.put(charAt, 1);
        }
        return score;
    }

    private char checkFirstOccerence(String s) {
        HashMap<Character, Integer> firstOccurrenceOfChars = getFirstOccurrenceOfChars(s);
        System.out.println("firstOccurrenceOfChars" + firstOccurrenceOfChars);
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            Integer integer = firstOccurrenceOfChars.get(charAt);
            if (integer == 1)
                return charAt;
        }
        throw new IllegalArgumentException("Wrong parsm");
    }

    @Test
    public void test() {
        char tejaleal = checkFirstOccerence("tejaleal");
        System.out.println("First with Occarance 1 is: " + tejaleal);
        assertEquals('b', checkFirstOccerence("abcdefghija"));
        assertEquals('h', checkFirstOccerence("hello"));
        assertEquals('J', checkFirstOccerence("Java"));
        assertEquals('i', checkFirstOccerence("simplest"));

    }
}
