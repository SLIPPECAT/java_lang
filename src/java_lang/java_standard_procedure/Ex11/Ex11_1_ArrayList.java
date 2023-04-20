package java_lang.java_standard_procedure.Ex11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1_ArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new String("하이요"));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        System.out.println(list1);
        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println(list2);

        list2.set(2,"AA");
        System.out.println(list2);

        for (int i = list2.size()-1; i >=0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }

        System.out.println(list1);
        System.out.println(list2);

        }

}
