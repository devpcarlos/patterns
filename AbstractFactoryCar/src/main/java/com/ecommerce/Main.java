package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de vehículos de lujo
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        Car luxuryCar = luxuryFactory.crateCar();
        Motorcycle luxuryMotorcycle = luxuryFactory.crateMotorcycle();

        luxuryCar.design();            // Diseñando un auto de lujo.
        luxuryMotorcycle.design();     // Diseñando una motocicleta de lujo.

        // Creamos una fábrica de vehículos económicos
        VehicleFactory economyFactory = new EconomyVehicleFactory();
        Car economyCar = economyFactory.crateCar();
        Motorcycle economyMotorcycle = economyFactory.crateMotorcycle();

        economyCar.design();           // Diseñando un auto económico.
        economyMotorcycle.design();    // Diseñando una motocicleta económica.
    }
}