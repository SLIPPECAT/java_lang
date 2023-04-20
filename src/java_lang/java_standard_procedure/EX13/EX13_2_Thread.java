package java_lang.java_standard_procedure.EX13;


// 싱글 쓰레드와 멀티 쓰레드 비교
public class EX13_2_Thread {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

            for (int i = 0; i < 300; i++)
                System.out.printf("%s", new String("-"));

            System.out.print("소요시간1: " + (System.currentTimeMillis() - startTime));

            for (int j = 0; j < 300; j++)
                System.out.printf("%s", new String("|"));

            System.out.print("소요시간1: " + (System.currentTimeMillis() - startTime));
    }
}
