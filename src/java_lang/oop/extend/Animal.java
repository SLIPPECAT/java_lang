package java_lang.oop.extend;

public class Animal {

    public String name;

    String myClass;

    Animal(){
        myClass = "동물";
    }

    void showMe(){
        System.out.println(myClass);
    }

    void showName() {
        System.out.printf("안녕 나는 %s야. 반가워 \n", name);
    }
}
