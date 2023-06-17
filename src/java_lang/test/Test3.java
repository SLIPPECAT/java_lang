package java_lang.test;

import java_lang.innerclass.Person;

import java.awt.print.Book;

public class Test3 {
    int value;

    Test3(int value){
        this.value = value;
    }

    private static void swap(Test3 a, Test3 b){
        int temp = a.value;
        System.out.println(a);
        System.out.println(b);
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        Test3 a = new Test3(1);
        Test3 b = new Test3(2);
        System.out.println(a);
        System.out.println(b);

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);

        swap(a, b);

        System.out.println("---------swap---------");

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);
    }
}
