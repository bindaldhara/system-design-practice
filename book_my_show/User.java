package book_my_show;
public class User {
    private String userId;
    private String name;
    
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // User can make a booking and use the payment strategy
    public void bookShow(Show show, String seatNumber, PaymentStrategy paymentStrategy, BookingSystem bookingSystem) {
        bookingSystem.bookSeat(show, seatNumber);
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(paymentStrategy);
        paymentContext.payAmount(300.0); // Assume fixed ticket price
    }
}
