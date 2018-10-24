package com.javatpoint.setter_injection;

public class Address {
    private String city;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.country = country;
    }

    public Address() { }

    public String getCity() {
        return city;
    }


    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setCountry(String country) {
        this.country = country;
    }
}
