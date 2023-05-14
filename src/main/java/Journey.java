public class Journey {
    Flight startingAirport;
    Flight endingAirport;

    public Journey(Flight departure, Flight arrival) {
        this.startingAirport = departure;
        this.endingAirport = arrival;
    }

    public String toString() {
        return "Flight from " + this.startingAirport.getDeparture() + " to " + this.endingAirport.getArrival() +
                "\nwith stop at " + this.startingAirport.getArrival() + "\ncosts " +
                (startingAirport.getPrice() + endingAirport.getPrice());
    }
}
