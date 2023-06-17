package java_lang.effectivejava.chapter02.item09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))){
            return br.readLine();
        } catch (IOException e){
            return defaultVal;
        }
    }

}
