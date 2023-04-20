package java_lang.java_standard_procedure.EX14;

import java.util.function.Predicate;

public class EX14_3_Function_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;  // p를 매개변수로 받아서 boolean 타입으로 반환한다.
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));  // true

        String str1 = "abc";
        String str2 = "abc";

        // str1과 str2가 같으지 비교한 결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }

}
