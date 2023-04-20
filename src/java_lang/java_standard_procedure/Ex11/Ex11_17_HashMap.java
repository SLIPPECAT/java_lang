package java_lang.java_standard_procedure.Ex11;

import java.util.*;

public class Ex11_17_HashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("감자바", 90);
        map.put("이자바", 100);
        map.put("나자바", 70);
        map.put("안자바", 80);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();  // 정렬하고 다시 맴으로 만들어주는 건가?
            System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단: " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점: "+total);
        System.out.println("평균: "+(float)total/set.size());
        System.out.println("최고점수: "+Collections.max(values));
        System.out.println("최저점수: "+Collections.min(values));


    }

}
