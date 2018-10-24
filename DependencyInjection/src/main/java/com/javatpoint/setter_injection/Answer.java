package com.javatpoint.setter_injection;

public class Answer {
    private int id;
    private String name;
    private String by;

    public Answer() {
    }

    public Answer(int id, String name, String by) {
        this.id = id;
        this.name = name;
        this.by = by;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String displayInfo() {
        return id + " " + name + " " + by;
    }

}
