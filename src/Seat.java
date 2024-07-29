public class Seat {
    private String seatNumber;
    private String seatClass; // e.g., economy, business
    private boolean isAvailable;
    private Flight flight;

    public Seat(String seatNumber, String seatClass, boolean isAvailable, Flight flight) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.isAvailable = isAvailable;
        this.flight = flight;
    }

    // Getters
    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Flight getFlight() {
        return flight;
    }

    // Setters
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
