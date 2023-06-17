package java_lang.effectivejava.chapter03.item14;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
    public static void main(String[] args) {
        Set<String> s= new TreeSet();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
