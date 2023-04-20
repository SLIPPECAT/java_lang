package java_lang.java_standard_procedure.Ex12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2_Iterator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("류", 1, 1));
        list.add(new Student("준", 1, 2));
        list.add(new Student("영", 1, 3));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
//            Student a = (Student) it.next();
            Student s = it.next();
            System.out.println(s.name);
        }
    }
}

    class Student {
        String name = "";
        int ban;
        int no;

        public Student(String name, int ban, int no) {
            this.name = name;
            this.ban = ban;
            this.no = no;
    }
}
