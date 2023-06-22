package java_lang.oop.extend;

public class Driver02 {
    public static void main(String[] args) {
        Animal anAnimal = new Animal();
        Animal aMammalia = new Mammalia();
        Animal aBird = new Bird();
        Animal aWhale = new Whale();
        Animal aBat = new Bat();
        Animal aTreeSparrow = new TreeSparrow();
        Animal aPenguin = new Penguin();

        anAnimal.showMe();
        aMammalia.showMe();
        aBird.showMe();
        aWhale.showMe();
        aBat.showMe();
        aTreeSparrow.showMe();
        aPenguin.showMe();
    }
}
