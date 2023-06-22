package java_lang.oop.extend;

public class Bat extends Bird implements Flyable{
    Bat(){
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼.. 슈웅!!! 슈웅!!!");
    }
}
