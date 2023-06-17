package java_lang.data_structure.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrac {

    public static void main(String[] args) {
        // 선언
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<Integer>(set1);
        TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));
        // 값 추가
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        // 값 삭제
        set.remove(1);
        set.clear();
        System.out.println(set);
        // 크기 구하기
        System.out.println(set.size());
        // 값 출력
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(3));
        System.out.println(set.lower(3));

        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            System.out.printf(iter.next()+"  ");
        }

    }
}
