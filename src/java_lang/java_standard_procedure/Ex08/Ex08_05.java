package java_lang.java_standard_procedure.Ex08;

public class Ex08_05 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("ae.getMessage() = " + ae.getMessage());
        }
        System.out.println(6);
    }
}