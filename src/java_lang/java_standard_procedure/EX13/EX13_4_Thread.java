package java_lang.java_standard_procedure.EX13;

import javax.swing.*;

// 사용자가 입력을 마치고 난 이후에 작용
public class EX13_4_Thread {
    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
            try{
                // 1초간 시간 지연
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
