package com.company;

import java.util.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BasicCar basicCar = new LuxuryCar(new BasicCar(1, "bmw", 4), "luxury");
        BasicCar basicCar1 = new SportCar(new BasicCar(1, "ferrari", 4), "sport");
        BasicCar basicCar2 = new FamilyCar(new BasicCar(1, "nissan", 3.5), "family");

        basicCar.info();
        basicCar1.info();
        basicCar2.info();
    }
}
