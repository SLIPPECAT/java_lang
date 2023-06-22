//package java_lang.effectivejava.chapter02.item09;
//
//import java.io.*;
//
//import static jogamp.opengl.util.av.JavaSoundAudioSink.BUFFER_SIZE;
//
//public class Before {
//
//    // try-finally 더 이상 자원을 회수하는 최선의 방책이 아니다.
//    static String firstLineOfFile(String path) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        try {
//            return br.readLine();
//        } finally {
//            br.close();
//        }
//    }
//
//    // 자원이 둘 이상이면 try-finally 방식은 너무 지저분하다.
//    static void copy(String src, String dst) throws IOException {
//        InputStream in = new FileInputStream(src);
//        try {
//            OutputStream out = new FileOutputStream(dst);
//            try {
//                byte[] buf = new byte[BUFFER_SIZE];
//                int n;
//                while ((n = in.read(buf)) >= 0)
//                    out.write(buf, 0, n);
//            } finally {
//                out.close();
//            }
//        } finally {
//            in.close();
//        }
//    }
//}
