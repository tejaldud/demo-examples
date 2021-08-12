import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public int wordCount(String str) {
        if (StringUtils.isBlank(str)) { return 0; }
        String[] split = str.split("\\s+");
        return  split.length;
    }

    public Map<String, Integer> countOccurrenceOfWord(String str)
    {
        Map<String,Integer> occurrenceOfWord= new HashMap<String,Integer>();

        if (StringUtils.isBlank(str)) { }
        String[] split = str.split("\\s+");
        for (String s:split
             ) {
            if(occurrenceOfWord.containsKey(s))
                occurrenceOfWord.put(s,occurrenceOfWord.get(s)+1);
            else
                occurrenceOfWord.put(s,1);
        }

        return occurrenceOfWord;
    }

    @Test
    public void wordCount()
    {
        String s="I am an            Strin g";
        System.out.println(wordCount(s));
    }

    @Test
    public void occurenceOfWordCount()
    {
        String s="This this is is done by apple apple";
        System.out.println(countOccurrenceOfWord(s));
        for (Map.Entry entry: countOccurrenceOfWord(s).entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
}
