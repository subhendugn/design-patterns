package facadepattern;

public class PaymentSystem {
    public void makePayment(User user) {
        System.out.println("Payment made for user: " + user.getName());
    }
}
