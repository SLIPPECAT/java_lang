package java_lang.computer_science_note.factoryPattern;

public class Americano extends Coffee{
    private int price;

    public Americano(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}
