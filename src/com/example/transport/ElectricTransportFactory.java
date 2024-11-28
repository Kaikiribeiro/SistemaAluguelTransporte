package com.example.transport;

public class ElectricTransportFactory extends TransportFactory {
    @Override
    public Transport createScooter() {
        return new ElectricScooter();
    }

    @Override
    public Transport createBike() {
        return new ElectricBike();
    }
}
