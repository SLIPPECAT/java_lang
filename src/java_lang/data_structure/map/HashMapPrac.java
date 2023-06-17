package java_lang.data_structure.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPrac {

    public static void main(String[] args) {
        // 선언
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>(map1);
        HashMap<String, String> map4 = new HashMap<>(10);
        HashMap<String, String> map5 = new HashMap<>(10, 0.7f);
        HashMap<String, String> map6 = new HashMap<>(){{put("a", "b");}};
        // 값 추가
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "류준영");
        map.put(2, "류성현");
        map.put(3, "류다온");
        System.out.println(map);
        // 값 삭제
//        map.remove(1);
//        map.clear();
        System.out.println(map);
        // 출력
        System.out.println(map.get(1));
        // entrySet 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        // keySet활용 key를 이용해서 value를 찾는 과정이 포함되어 있음
        for (Integer i : map.keySet()){
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }
        // iterator 사용
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }

        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()){
            int key = keys.next();
            System.out.println("[Key]:" + key + " [Value]:" + map.get(key));
        }
    }
}
