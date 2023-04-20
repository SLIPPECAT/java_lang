package java_lang.java_standard_procedure.Ex12;

public class EX12_7_Overriding {
    class Parent {
        void parentMethod() {
        }
    }

    class Child extends Parent {
        @Override
        void parentMethod(){}
    }
}
