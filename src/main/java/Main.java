import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        //flightDatabase.checkIfFlightExists("Berlin", "Cracow");
        //flightDatabase.displayFlightsFromCity("Paris");
        //flightDatabase.displayFlightsToCity("Cracow");
        //System.out.println(flightDatabase.getCities());
        //System.out.println(flightDatabase.getCheapestFlightToCity("Madrid").getDetails());
        //flightDatabase.getFlights("Berlin", "Kiev");
        ArrayList<Journey> journeys = flightDatabase.getFlights("Berlin", "Kiev");
        System.out.println(journeys);


    }
}

