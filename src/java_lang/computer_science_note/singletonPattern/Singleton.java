package java_lang.computer_science_note.singletonPattern;

public class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }


}
