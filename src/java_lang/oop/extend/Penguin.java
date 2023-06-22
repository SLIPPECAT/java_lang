package java_lang.oop.extend;

public class Penguin extends Animal implements Swimable{
    public String habitat;

    Penguin(){
        myClass = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 수영 중. 푸악!!! 푸악!!!");
    }

    public void showHabitat(){
        System.out.printf("%s는 %s에 살아 \n", name, habitat);
    }
}
