import org.junit.jupiter.api.Test;

public class ReverseString {

    private String reverseStringWithoutFunc(String  str)
    {
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i=chars.length;i>0;i--)
        {
           reverse=reverse+chars[i-1];
        }
        return reverse;
    }
    @Test
    public void printReverse()
    {
        String data="Tejal";
        System.out.println("Reverse of "+data+" is "+ reverseStringWithoutFunc(data));
    }
}
