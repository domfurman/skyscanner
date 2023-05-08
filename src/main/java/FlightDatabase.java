import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Cracow"));
        this.flights.add(new Flight("London", "Budapest"));
        this.flights.add(new Flight("Warsaw", "Berlin"));
        this.flights.add(new Flight("Paris", "Amsterdam"));
        this.flights.add(new Flight("Tokyo", "Madrid"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Paris", "Warsaw"));
    }

    public void checkIfFlightExists(String dep, String arr) {
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (dep.equals(flight.departure) && arr.equals(flight.arrival)) {
                System.out.println("Flight exists");
                return;
            }
        }
        System.out.println("Flight does not exists");
    }

    public ArrayList getFlightsFromCity(String city) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departure)) {
                results.add(flight);
            }
        }

        return results;
    }

    public ArrayList getFlightsToCity(String city) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.arrival)) {
                results.add(flight);
            }
        }
        return results;
    }

    public void displayFlights(ArrayList<Flight> results) {
        if (results.isEmpty()) {
            System.out.println("Flights not found");
        }
        for (int i = 0; i< results.size(); i++) {
            Flight flight = results.get(i);
            System.out.println(flight.getDetails());
        }
    }

    public void displayFlightsFromCity(String city) {
        ArrayList<Flight> results = getFlightsFromCity(city);
        displayFlights(results);
    }
    public void displayFlightsToCity(String city) {
        ArrayList<Flight> results = getFlightsToCity(city);
        displayFlights(results);
    }

    public ArrayList getCities() {
        ArrayList<String> cities = new ArrayList<String>();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            if (!(cities.contains(flight.departure))) {
                cities.add(flight.departure);
            }
            if (!(cities.contains(flight.arrival))) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }
}
