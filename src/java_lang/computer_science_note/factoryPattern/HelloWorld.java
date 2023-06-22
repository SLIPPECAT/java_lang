package java_lang.computer_science_note.factoryPattern;

public class HelloWorld {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee(Menu.Latte, 4000);
        Coffee ame = CoffeeFactory.getCoffee(Menu.Americano, 3000);
        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory Americano ::" + ame);
    }
}
