package java_lang.computer_science_note.strategyPattern;

public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundolA", 100);
        Item B = new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACARD
        cart.pay(new LUNACardStrategy("kundo@Email.com", "pukubababo"));

        // pay by KAKAOCARD
        cart.pay(new KAKAOCardStrategy("RYU", "123456789", "123", "12/01"));
    }
}
