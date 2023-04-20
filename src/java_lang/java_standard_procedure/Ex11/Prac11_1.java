package java_lang.java_standard_procedure.Ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Prac11_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);  // list에 추가
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        System.out.println(list);

        HashSet set = new HashSet(list);  // 알아서 정렬하고 중복 제외  [2,2,2,3,6,7]
        System.out.println(set);
        TreeSet tset = new TreeSet(set);  // 중복 제외하고 정렬  [2,3,6,7]
        System.out.println(tset);
        Stack stack = new Stack();
        stack.addAll(tset);  // [2,3,6,7]  // 잘 모르겠다.
        System.out.println(stack);

        while(!stack.empty()){
            System.out.println(stack.pop());  // 7, 6, 3, 2
        }

    }
}
