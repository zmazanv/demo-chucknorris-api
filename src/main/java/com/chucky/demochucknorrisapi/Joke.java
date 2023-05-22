package com.chucky.demochucknorrisapi;
// POJO - Plain Old Java Object

public class Joke {
    private String id;
    private String value;

    public Joke(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
