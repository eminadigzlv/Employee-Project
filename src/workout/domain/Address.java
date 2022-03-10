package az.workout.domain;

import java.io.Serializable;

public class Address  implements Serializable
{   private  long id;
    private  Country country;
    private  City city;
    private  String info;
    private  long zipCode;

    public Address( ) {
        this.id = 0;
        this.country = new Country();
        this.city = new City();
        this.info = "";
        this.zipCode=0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country=" + country +
                ", city=" + city +
                ", info='" + info + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
