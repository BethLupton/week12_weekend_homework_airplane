public class Passenger extends Person {

    private int noOfBags;

    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
    }

    public int getNoBags() {
        return noOfBags;
    }
}
