//package java_lang.computer_science_note.factoryPattern;
//
//import java.util.EnumMap;
//import java.util.Map;
//import java.util.function.Supplier;
//
//public class CoffeeFactoryEnum {
//    private static final Map<Menu, Supplier<Coffee>> coffeeMap = new EnumMap<>(Menu.class);
//
//    static {
//        coffeeMap.put(Menu.Latte, Latte::new);
//        coffeeMap.put(Menu.Americano, Americano::new);
//    }
//
//    public static Coffee getCoffee(Menu menu, int price){
//        return coffeeMap.getOrDefault(menu, DefaultCoffee::new).get().getPrice(price);
//    }
//}
