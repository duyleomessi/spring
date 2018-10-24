package com.javatpoint.setter_injection;

public class Employee {
    private Address address;
    private int id;
    private String name;
    private String city;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name+" "+city);
    }
}
