package java_lang.data_structure.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {

    public static void main(String[] args) {
        // HashSet 생성
        HashSet<Integer> set = new HashSet<>();
        // 값 추가
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        // 값 삭제
        set.remove(1);
        set.clear();
        System.out.println(set);
        // 값 출력
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
        System.out.println(set1);
        Iterator iter = set1.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        // 값 검색
        System.out.println(set1.contains(1));
    }
}
