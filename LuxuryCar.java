package com.company;

public class LuxuryCar extends BasicCar {
    private String type;
    private BasicCar basicCar;

    public LuxuryCar(BasicCar internal, String type) {
        this.basicCar = internal;
        this.type = type;
    }

    @Override
    public void info() {
        System.out.println("Type: " + type);
        basicCar.info();
    }

    @Override
    public int getId() {
        return basicCar.getId();
    }

    @Override
    public void setId(int id) {
        basicCar.setId(id);
    }

    @Override
    public String getName() {
        return basicCar.getName();
    }

    @Override
    public void setName(String name) {
        basicCar.setName(name);
    }

    @Override
    public double getEngineVolume() {
        return basicCar.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        basicCar.setEngineVolume(engineVolume);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BasicCar getBasicCar() {
        return basicCar;
    }

    public void setBasicCar(BasicCar basicCar) {
        this.basicCar = basicCar;
    }
}
