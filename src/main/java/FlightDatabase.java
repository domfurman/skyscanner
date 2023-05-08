import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Cracow", 25));
        this.flights.add(new Flight("London", "Budapest", 35));
        this.flights.add(new Flight("Warsaw", "Berlin", 40));
        this.flights.add(new Flight("Paris", "Amsterdam", 30));
        this.flights.add(new Flight("Tokyo", "Madrid", 250));
        this.flights.add(new Flight("Paris", "Madrid", 50));
        this.flights.add(new Flight("Berlin", "Tokyo", 180));
        this.flights.add(new Flight("Paris", "Warsaw", 65));
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
        for (Flight flight : this.flights) {
            if (city.equals(flight.departure)) {
                results.add(flight);
            }
        }

        return results;
    }

    public ArrayList getFlightsToCity(String city) {
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (Flight flight : this.flights) {
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
        for (Flight flight : results) {
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
        for (Flight flight : this.flights) {
            if (!(cities.contains(flight.departure))) {
                cities.add(flight.departure);
            }
            if (!(cities.contains(flight.arrival))) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

    public Flight cheapestFlight() {
        Flight cheapestFlight = null;
        for (Flight flight : this.flights) {
            if (cheapestFlight == null || cheapestFlight.price > flight.price) {
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }

    public Flight getCheapestFlightFromCity(String city) {
        Flight cheapestFlightFromCity = null;
        for (Flight flight : flights) {
            if ((cheapestFlightFromCity == null || cheapestFlightFromCity.price > flight.price) && city.equals(flight.departure)) {
                cheapestFlightFromCity = flight;
            }
        }
        return cheapestFlightFromCity;
    }
    public Flight getCheapestFlightToCity(String city) {
        Flight cheapestFlightToCity = null;
        for (Flight flight : flights) {
            if ((cheapestFlightToCity == null || cheapestFlightToCity.price > flight.price) && city.equals(flight.arrival)) {
                cheapestFlightToCity = flight;
            }
        }
        return cheapestFlightToCity;
    }
}
