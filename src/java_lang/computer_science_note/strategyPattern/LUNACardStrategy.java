package java_lang.computer_science_note.strategyPattern;

public class LUNACardStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public LUNACardStrategy(String email, String pw) {
        this.emailId = email;
        this.password = pw;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " paid using LUNACard.");
    }
}
