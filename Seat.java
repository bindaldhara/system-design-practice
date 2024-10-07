class Seat {
    String seatNumber;
    private boolean isBooked;
    
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        if (!isBooked) {
            isBooked = true;
        } else {
            throw new IllegalStateException("Seat already booked!");
        }
    }

    public void cancelSeat() {
        isBooked = false;
    }
}
