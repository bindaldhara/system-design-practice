import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingSystem {
     private static BookingSystem instance;
    private Map<String, List<Seat>> showSeatsMap;

    private BookingSystem() {
        showSeatsMap = new HashMap<>();
    }

    public static synchronized BookingSystem getInstance() {
        if (instance == null) {
            instance = new BookingSystem();
        }
        return instance;
    }

    public void initializeSeats(Show show, int seatCount) {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= seatCount; i++) {
            seats.add(new Seat("S" + i));
        }
        showSeatsMap.put(show.getShowTime(), seats);
    }

    public List<Seat> getSeats(Show show) {
        return showSeatsMap.get(show.getShowTime());
    }

    public void bookSeat(Show show, String seatNumber) {
        List<Seat> seats = showSeatsMap.get(show.getShowTime());
        for (Seat seat : seats) {
            if (seatNumber.equals(seat.seatNumber) && !seat.isBooked()) {
                seat.bookSeat();
                System.out.println("Seat " + seatNumber + " is booked.");
                return;
            }
        }
        throw new IllegalArgumentException("Seat is either booked or not available.");
    }

    public void cancelBooking(Show show, String seatNumber) {
        List<Seat> seats = showSeatsMap.get(show.getShowTime());
        for (Seat seat : seats) {
            if (seatNumber.equals(seat.seatNumber) && seat.isBooked()) {
                seat.cancelSeat();
                System.out.println("Seat " + seatNumber + " is cancelled.");
                return;
            }
        }
        throw new IllegalArgumentException("Seat not found or not booked.");
    }
}
