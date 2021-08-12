import org.junit.platform.commons.util.StringUtils;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {

        String anagram1 = s1.replaceAll("\\s", "");
        String anagram2 = s2.replaceAll("\\s", "");
        if ((anagram1.length() != anagram2.length()))
            return false;
        if (StringUtils.isBlank(anagram1) || StringUtils.isBlank(anagram2))
            return false;
        char[] chars1 = anagram1.toLowerCase().toCharArray();
        char[] chars2 = anagram2.toLowerCase().toCharArray();
        sort(chars1);
        sort(chars2);
        boolean equals = Arrays.equals(chars1, chars2);
        if (equals)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        boolean anagram = isAnagram("Keep", "Peek");
        printAnagram(anagram);
        anagram = isAnagram("Mother In Law", "Hitler Woman");
        printAnagram(anagram);
        anagram = isAnagram("Mother In Laww", "Hitler Woman");
        printAnagram(anagram);

    }

    private static void printAnagram(boolean anagram) {
        if (anagram)
            System.out.println("Its an Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
