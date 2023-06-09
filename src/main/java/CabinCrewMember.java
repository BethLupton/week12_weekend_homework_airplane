public enum CabinCrewMember {

    TRENTREZNOR("Purser"),
    JOESTRUMMER("Flight Attendant"),
    DAVIDBOWIE("Flight Attendant"),
    ANNIELENNOX("First Officer");

    private final String rank;


    CabinCrewMember(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
