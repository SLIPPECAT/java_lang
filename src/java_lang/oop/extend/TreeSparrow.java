package java_lang.oop.extend;

public class TreeSparrow extends Bird implements Flyable{
    TreeSparrow(){
        myClass = "참새";
    }

    @Override
    public void fly() {
        System.out.println(myClass + " 날고 있삼.. 허우적!!! 허우적!!!");
    }
}
