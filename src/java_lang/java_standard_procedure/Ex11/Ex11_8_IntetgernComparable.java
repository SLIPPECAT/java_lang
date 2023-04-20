package java_lang.java_standard_procedure.Ex11;


import java.util.Arrays;
import java.util.Comparator;

public class Ex11_8_IntetgernComparable {
    public static void main(String[] args) {
        Integer[] arr = {30, 50, 10, 40, 20};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);  // 기본 정렬기준 compareTo()로 정렬
        System.out.println(Arrays.toString(arr));

        //sort(Objcect[] objArr, Comparator C)
        Arrays.sort(arr, new DescComp());  // DescCamp에 구현된 정렬 기준으로 정렬
        System.out.println(Arrays.toString(arr));
    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2){
        if(!(o1 instanceof Integer && o2 instanceof Integer)){
            return-1;
        }
        Integer i  = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i.compareTo(i2)*-1;
    }
}