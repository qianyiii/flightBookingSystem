import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private ArrayList<Seat> seats;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport, LocalDate departureDate, LocalTime departureTime, ArrayList<Seat> seats) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.seats = seats;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    // Setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    // Method to find available seats
    public ArrayList<Seat> findAvailableSeats() {
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
}
