import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveArrayListDuplicate {

    public ArrayList<String> removeDuplicates(ArrayList<String> list)
    {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(list);
        list.clear();
        list.addAll(linkedHashSet);
        return list;
    }
    @Test
    public void removeDup()
    {
        ArrayList<String> list= new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("2");
        list.add("3");
        System.out.println("List before :"+list);
        ArrayList<String> list1 = removeDuplicates(list);
        System.out.println("List after :"+list1);
    }
}
