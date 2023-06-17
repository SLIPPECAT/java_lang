package java_lang.effectivejava.chapter04.item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class Main {

    // 골격 구현을 사용해 완성한 구체 클래스
    static List<Integer> intArrayAsList(int[] a){
        Objects.requireNonNull(a);

        // 다이아몬드 연산자를 이렇게 사용하는 건 자바 9부터 가능하다.
        // 더 낮은 버전을 사용한다면 <Integer>로 수정하자.
        return new AbstractList<>(){
            @Override public Integer get(int i){
                return a[i];
            }

            @Override public Integer set(int i, Integer val){
                int oldVal = a[i];
                a[i] = val;
                return oldVal;
            }

            @Override public int size() {
                return a.length;
            }
        };
    }
}
