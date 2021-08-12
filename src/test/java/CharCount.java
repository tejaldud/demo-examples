import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class CharCount {

    public int charCountWithoutSpace(String str) {
        if (StringUtils.isBlank(str)) { return 0; }
        String replaceAll = str.replaceAll("\\s+", "");
        System.out.println("after space:"+replaceAll.length());
        return  replaceAll.length();
    }

    @Test
    public void charCountWithoutSpace()
    {
        String s="I am an           Strin g";
        System.out.println(s.length());
        System.out.println(charCountWithoutSpace(s));
    }
}
