package com.mycompany.serializationdemo.assignment;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
