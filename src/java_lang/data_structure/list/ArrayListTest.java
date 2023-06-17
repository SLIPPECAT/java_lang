package java_lang.data_structure.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(50);

        arr.add(1);
        arr.add(2);

        System.out.println(arr);
    }

}
