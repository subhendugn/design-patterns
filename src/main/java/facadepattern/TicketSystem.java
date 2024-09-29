package facadepattern;

public class TicketSystem {
    public boolean checkTicketAvailability() {
        return true;
    }

    public void bookTicket(User user, String movieName) {
        System.out.println("Ticket booked for " + user.getName() + " for movie " + movieName);
    }
}
