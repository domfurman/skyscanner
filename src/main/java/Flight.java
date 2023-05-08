class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getArrival() {
        return this.arrival;
    }
}