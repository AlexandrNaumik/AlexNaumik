package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;
public class Lorry extends com.company.vehicles.Car {
    private int bodyLoadCapacity;

    public int getBodyLoadCapacity() {
        return bodyLoadCapacity;
    }

    public void setBodyLoadCapacity(int bodyLoadCapacity) {
        this.bodyLoadCapacity = bodyLoadCapacity;
    }
}
