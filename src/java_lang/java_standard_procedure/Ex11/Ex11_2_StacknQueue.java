package java_lang.java_standard_procedure.Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2_StacknQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        System.out.println(st);

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println(q);

        while(!st.empty())
            System.out.println(st.pop());

        while(!q.isEmpty())
            System.out.println(q.poll());





    }
}
