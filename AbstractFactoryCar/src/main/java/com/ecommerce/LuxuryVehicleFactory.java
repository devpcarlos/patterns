package com.ecommerce;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Car crateCar() {
        return new luxuryCar();
    }

    @Override
    public Motorcycle crateMotorcycle() {
        return new LuxuryMotorcycle();
    }
}
