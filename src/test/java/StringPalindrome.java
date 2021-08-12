import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class StringPalindrome {

    public String stringReverse(String s) {
        char[] chars = s.toCharArray();
        String reverse = "";
        for (int i = chars.length; i > 0; i--) {
            reverse = reverse + chars[i - 1];
        }
        return reverse;
    }

    public static String reverse(String s) {
        StringBuffer sBuff = new StringBuffer(s);
        sBuff.reverse();
        return sBuff.toString();
    }

    public static boolean isPalidrome(String s) {
        String reverse = reverse(s);
        if(reverse.equalsIgnoreCase(s))
            return true;
        return false;
    }

    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = reader.nextLine();
        boolean palidrome = isPalidrome(input);
        if(palidrome)
            System.out.println("Palindrome!!!");
        else
            System.out.println("not Palidrome");
    }

    @Test
    public void checkPalidrome()
    {
        String input ="tej";
        boolean palidrome = isPalidrome(input);
        if(palidrome)
            System.out.println("Palindrome!!!");
        else
            System.out.println("not Palidrome");
    }
}
