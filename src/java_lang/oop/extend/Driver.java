package java_lang.oop.extend;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showHabitat();

        Animal pingu = new Penguin();

        pingu.name ="핑구";
//         pingu.habitat = "EBS';

        pingu.showName();
        // pingu.showHabitat();

        // Penguin haapyfeet = new Animal();

//        Flyable fly1 = new Bat();
//        fly1.fly();
//
//        Flyable fly2 = new TreeSparrow();
//        fly2.fly();
//
//        Swimable[] swimers = new Swimable[2];
//
//        swimers[0] = new Whale();
//        swimers[1] = new Penguin();
//
//        for (Swimable swimer : swimers){
//            swimer.swim();
//        }
    }
}
