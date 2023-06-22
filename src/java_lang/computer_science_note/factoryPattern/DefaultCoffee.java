package java_lang.computer_science_note.factoryPattern;

class DefaultCoffee extends Coffee{
    private int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice(){
        return this.price;
    }


}
