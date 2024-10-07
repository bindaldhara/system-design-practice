package book_my_show;
public class BookMyShow {
    public static void main(String[] args) {
        Movie movie = new Movie(1, "Inception");
        Screen screen = new Screen("S1", "Screen 1", 50);
        Show show = new Show("SH1", movie, screen, "10:00 AM");

        theater theater = new theater("T1", "PVR");
        theater.addScreen(screen);

        BookingSystem bookingSystem = BookingSystem.getInstance();
        bookingSystem.initializeSeats(show, screen.getTotalSeats());

        // User books a seat using a payment method
        User user = new User("U1", "Dhara");
        user.bookShow(show, "S1", new CreditCardPayment("1234-5678-9876-5432"), bookingSystem);

        User user2 = new User("U2", "Dhara Bindal");
        user2.bookShow(show, "S7", new CreditCardPayment("1234-5678-9876-5432"), bookingSystem);

        User user3 = new User("U3", "Bindal Dhara");
        user3.bookShow(show, "S4", new CreditCardPayment("1234-5678-9876-5432"), bookingSystem);
    }
}