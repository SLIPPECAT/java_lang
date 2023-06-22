package java_lang.computer_science_note.factoryPattern;

class CoffeeFactory {
    public static Coffee getCoffee(Menu menu, int price){
//        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
//        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
//        else { return new DefaultCoffee(); }
        if (menu == Menu.Latte) return new Latte(price);
        else if (menu == Menu.Americano) return new Americano(price);
        else { return new DefaultCoffee(); }
    }
}
