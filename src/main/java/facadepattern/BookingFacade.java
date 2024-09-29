package facadepattern;

public class BookingFacade {
    public void createBooking(User user, String movieName) {
        TicketSystem ticketSystem = new TicketSystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        NotificationSystem notificationSystem = new NotificationSystem();

        boolean isTicketAvailable = ticketSystem.checkTicketAvailability();
        if (isTicketAvailable) {
            ticketSystem.bookTicket(user, movieName);
            paymentSystem.makePayment(user);
            notificationSystem.sendNotification(user);
        }
    }

}
