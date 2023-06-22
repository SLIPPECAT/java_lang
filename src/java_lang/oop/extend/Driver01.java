package java_lang.oop.extend;

import java.util.HashMap;

public class Driver01 {
    public static void main(String[] args) {
        Animal anAnimal = new Animal();
        Mammalia aMammalia = new Mammalia();
        Bird aBird = new Bird();
        Whale aWhale = new Whale();
        Bat aBat = new Bat();
        TreeSparrow aTreeSparrow = new TreeSparrow();
        Penguin aPenguin = new Penguin();

        anAnimal.showMe();
        aMammalia.showMe();
        aBird.showMe();
        aWhale.showMe();
        aBat.showMe();
        aTreeSparrow.showMe();
        aPenguin.showMe();
    }
}
