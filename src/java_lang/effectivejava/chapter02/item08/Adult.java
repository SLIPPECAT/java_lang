package java_lang.effectivejava.chapter02.item08;

public class Adult {
    public static void main(String[] args){
        try (Room myRoom = new Room(7)){
            System.out.println("안녕~");
        }
    }
}
