package java_lang.innerclass;

abstract public class Person {
    abstract void eat();
}

class TestAnonymousInner {
    public static void main(String[] args) {
        // 주어진 코드의 내부 동작
        Person p = new Person() {
            void eat() { System.out.println("nice fruits"); }
        };
        p.eat();
    }
}