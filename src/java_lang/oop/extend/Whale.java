package java_lang.oop.extend;

public class Whale extends Mammalia implements Swimable{
    Whale(){
        myClass = "고래";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 수영 중. 어프!!! 어프!!!");
    }
}
