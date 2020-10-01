package com.company;

public class BasicCar {
    private int id;
    private String name;
    private double engineVolume;


    public BasicCar() {
    }

    public BasicCar(int id, String name, double engineVolume) {
        this.id = id;
        this.name = name;
        this.engineVolume = engineVolume;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void info() {
        System.out.println("id: " + id + "name: " + name + "engine volume: " + engineVolume);
    }
}
