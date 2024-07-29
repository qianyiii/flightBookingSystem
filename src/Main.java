import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create some seats for the flight
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(new Seat("1A", "Economy", true, null));
        seats.add(new Seat("1B", "Economy", true, null));
        seats.add(new Seat("1C", "Economy", true, null));
        seats.add(new Seat("2A", "Business", true, null));
        seats.add(new Seat("2B", "Business", true, null));

        // Create a flight
        Flight flight = new Flight("AA123", "JFK", "LAX", LocalDate.of(2024, 7, 29), LocalTime.of(8, 0), seats);

        // Assign the flight to each seat
        for (Seat seat : seats) {
            seat.setFlight(flight);
        }

        // Create a passenger
        Passenger passenger = new Passenger("P001", "John Doe", "john.doe@example.com", "1234567890");

        // Find available seats on the flight
        ArrayList<Seat> availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats:");
        for (Seat seat : availableSeats) {
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ")");
        }

        // Create a reservation for the first available seat
        if (!availableSeats.isEmpty()) {
            Seat seatToBook = availableSeats.get(0);
            Reservation reservation = passenger.createReservation(flight, seatToBook);
            System.out.println("Reservation created: " + reservation.getReservationID());
        }

        // Check available seats again
        availableSeats = flight.findAvailableSeats();
        System.out.println("Available seats after booking:");
        for (Seat seat : availableSeats) {
            System.out.println(seat.getSeatNumber() + " (" + seat.getSeatClass() + ")");
        }
    }
}
