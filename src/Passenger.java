import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String passengerID;
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Reservation> reservations;

    public Passenger(String passengerID, String name, String email, String phoneNumber) {
        this.passengerID = passengerID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    // Getters
    public String getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    // Setters
    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    // Method to create a reservation
    public Reservation createReservation(Flight flight, Seat seat) {
        String reservationID = generateRandomString(10);
        Reservation reservation = new Reservation(reservationID, this, seat, flight);
        reservations.add(reservation);
        seat.setAvailability(false);
        return reservation;
    }

    // Private method to generate a random string
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return result.toString();
    }
}

