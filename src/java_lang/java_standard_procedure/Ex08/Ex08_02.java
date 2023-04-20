package java_lang.java_standard_procedure.Ex08;

public class Ex08_02 {
    public static void main(String[] args) {
        System.out.println(1);
    try{
        System.out.println(0/0);
        System.out.println(2);
    } catch(ArithmeticException e){
        System.out.println(3);
        }
        System.out.println(4);
    }
}
