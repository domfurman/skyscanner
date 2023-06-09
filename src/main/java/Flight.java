class Flight {
    String departure;
    String arrival;
    int price;

    public Flight(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival + ", cost: " + this.price;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getArrival() {
        return this.arrival;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return "Flight from " + this.departure + " to " + this.arrival + ", cost: " + this.price;
    }
}