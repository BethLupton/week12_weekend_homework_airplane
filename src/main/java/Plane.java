public enum Plane {

    BOEING747(524, 735000.00),
    AIRBUSA320(250, 83000.00),
    SAM26000(48, 336000.00),
    SML10000(4, 3360.00);

    private final int capacity;
    private final double weight;

    Plane(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
