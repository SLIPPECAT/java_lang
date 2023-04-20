package java_lang.java_standard_procedure.Ex11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9_HashSet {
    public static void main(String[] args) {
        Object[] objArr = {"1", new String("1"),"2", "2","3", "3","4","4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);  // HashSet에 objArr의 요소들을 저장..
        }
        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
