import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private String reservationID;
    private Passenger passenger;
    private Seat seat;
    private Flight flight;
    private String reservationDate;

    public Reservation(String reservationID, Passenger passenger, Seat seat, Flight flight) {
        this.reservationID = reservationID;
        this.passenger = passenger;
        this.seat = seat;
        this.flight = flight;
        this.reservationDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    // Getters
    public String getReservationID() {
        return reservationID;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    // Setters
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
}
