package java_lang.java_standard_procedure.EX14;


import java.util.Comparator;
import java.util.stream.Stream;

public class EX14_5_Stream {
    public static void main(String[] args) {
        Stream<Student> studnetsStream = Stream.of(
                new Student("김", 3, 300),
                new Student("이", 1, 200),
                new Student("박", 3, 250),
                new Student("한", 2, 150),
                new Student("류", 4, 300),
                new Student("류", 3, 100)
        );

        studnetsStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {return this.name;}
    int getBan() {return this.ban;}
    int getTotalScore() {return this.totalScore;}

    public int compareTo(Student s){
        return s.totalScore - this.totalScore;
    }

}
