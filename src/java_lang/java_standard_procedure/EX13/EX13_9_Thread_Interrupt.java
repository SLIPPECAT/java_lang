package java_lang.java_standard_procedure.EX13;

import javax.swing.*;

public class EX13_9_Thread_Interrupt {
    public static void main(String[] args) throws Exception {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력값은 " + input +"입니다.");
        th1.interrupt();
        System.out.println("th1.isInterrupted() = " + th1.isInterrupted());
    }
}

class ThreadEx9_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x =0; x < 2500000000L; x++);
        }
        System.out.println("카운트가 종료됐습니다.");
    }
}
