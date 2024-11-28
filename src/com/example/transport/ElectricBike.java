package com.example.transport;

public class ElectricBike implements Transport {
    @Override
    public void ride() {
        System.out.println("Usando uma Bicicleta Elétrica!");
    }
}
