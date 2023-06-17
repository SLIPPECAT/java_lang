package java_lang.effectivejava.chapter02.item09;

import java.io.*;

import static jogamp.opengl.util.av.JavaSoundAudioSink.BUFFER_SIZE;

public class After {

    // try-with-resources 자원을 회수하는 최선
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)){
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
