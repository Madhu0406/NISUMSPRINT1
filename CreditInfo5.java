class UserDetails {
    public String name;
    public int id;
    public String email;

    private String creditCard;
    private double creditCardBalance;

    // Constructor to set user details
    UserDetails(String name, int id, String email, String creditCard, double balance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.creditCard = creditCard;
        this.creditCardBalance = balance;
    }

      void showCreditInfo() {
        System.out.println("Credit Card:"+creditCard);
        System.out.println("Credit Balance: ₹" + creditCardBalance);
    }
}

public class CreditInfo5 {
    public static void main(String[] args) {
        UserDetails user = new UserDetails("anam", 101, "anam@gmail.com", "1234567812345678", 10000.0);

        System.out.println("Name: " + user.name);
        System.out.println("ID: " + user.id);
        System.out.println("Email: " + user.email);
        user.showCreditInfo();
    }
}
