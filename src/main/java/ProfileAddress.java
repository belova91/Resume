public class ProfileAddress {
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public ProfileAddress(String country, String city, String street, String house, String apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return this.getCountry() + ", " + this.getCity() + ", ул. " + this.getStreet() + ", д. " + this.getHouse() + ", офис " + this.getApartment() + ".";
    }

}
