package facadepattern;

public class Demo {
    public static void main(String[] args) {
        BookingFacade bookingFacade = new BookingFacade();
        User user = new User("John Doe");
        bookingFacade.createBooking(user, "Avengers: Endgame");
    }
}
