package java_lang;

public class StringTest {

    private static final int MAX_COMPARE = 100000;

    public static void main(String[] args) {
        // String Test
        String test1 = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COMPARE; i++) {
            test1 += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("[걸린시간]: " + "String : " + (end-start) + " ms");

        // String Builder Test
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COMPARE; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("[걸린시간]: " + "StringBuilder : " + (end-start) + " ms");

        // String Buffer Test
        StringBuffer sbu = new StringBuffer();
        for (int i = 0; i < MAX_COMPARE; i++) {
            sbu.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("[걸린시간]: " + "StringBuffer : " + (end-start) + " ms");
    }
}
