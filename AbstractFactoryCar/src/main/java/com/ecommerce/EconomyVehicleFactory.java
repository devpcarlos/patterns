package com.ecommerce;

public class EconomyVehicleFactory implements VehicleFactory{
    @Override
    public Car crateCar() {
        return new EconomyCar();
    }

    @Override
    public Motorcycle crateMotorcycle() {
        return new EconomyMotorcycle();
    }
}
