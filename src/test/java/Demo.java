import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void reverse() {
        String rev = stringReverse("tejal");
        System.out.println(rev);
    }

    @Test
    public void reverseNum() {
        String rev = numberReverse(232434);
        System.out.println(rev);
    }

    public String stringReverse(String s) {
        char[] chars = s.toCharArray();
        String reverse = "";
        for (int i = chars.length; i > 0; i--) {
            reverse = reverse + chars[i-1];
        }
        return reverse;
    }

    public String numberReverse(int s) {
        String s1 = String.valueOf(s);
        char[] chars = s1.toCharArray();
        String reverse = "";
        for (int i = chars.length; i > 0; i--) {
            reverse = reverse + chars[i-1];
        }
        return reverse;
    }
}
