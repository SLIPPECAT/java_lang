package java_lang.java_standard_procedure.EX13;

public class EX13_6_Thread_Priority {
    // main, NORM_PRIORITY = 5
    public static void main(String[] args) {
        ThreadEx6_1 th1 = new ThreadEx6_1();
        ThreadEx6_2 th2 = new ThreadEx6_2();

        th2.setPriority(7);

        System.out.println("th1.getPriority() = " + th1.getPriority());
        System.out.println("th2.getPriority() = " + th2.getPriority());

        th1.start();
        th2.start();
    }
}

class ThreadEx6_1 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 10000000; x++);
        }
    }
}
class ThreadEx6_2 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 10000000; x++);
        }
    }
}