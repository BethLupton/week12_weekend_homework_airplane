public class Pilot extends Person {

    private String rank;
    private String licenseNumber;

    public Pilot(String name, String rank, String licenseNumber) {
        super(name);
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
