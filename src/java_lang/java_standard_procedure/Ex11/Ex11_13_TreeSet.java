package java_lang.java_standard_procedure.Ex11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13_TreeSet {
    public static void main(String[] args) {

        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);  //set.add(new Integer(num));
        }
        System.out.println(set);
    }
}
