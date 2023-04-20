package java_lang.java_standard_procedure.Ex11;

import java.util.*;
import static java.util.Collections.*;


import static java.util.Collections.addAll;

public class Ex11_19_Collections {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);  // 오른쪽으로 두 칸 이동?
        System.out.println(list);

        swap(list, 0, 2);  //  인덱스 0과 2 교환
        System.out.println(list);

        shuffle(list);  // 무작위 위치 변경
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        sort(list);
        System.out.println(list);

        int idx = binarySearch(list, 3);  // 3이 저장된 index 반환
        System.out.println("index of 3 = " + idx);

        System.out.println("max="+max(list));
        System.out.println("min="+min(list));
        System.out.println("min="+max(list, reverseOrder()));

        fill(list, 9);  // list를 9로 채우기
        System.out.println(list);

        // list와 같은 크기의 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList="+newList);

        System.out.println(disjoint(list, newList));  // 공통요소가 없으면 true

        copy(list, newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list, 2, 1);
        System.out.println(list);

        Enumeration e = enumeration(list);  // 복제? 이름이 부여된 문자 값으로 이루어진 리스트를 나타내는 자료 유형
        ArrayList list2 = list(e);
        System.out.println(list2);


    }


}
