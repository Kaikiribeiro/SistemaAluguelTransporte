package com.example.transport;

public class HumanPoweredTransportFactory extends TransportFactory {
    @Override
    public Transport createScooter() {
        return new RollerSkates();  // Pode ser um erro, mas você pode mudar conforme necessário.
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }
}
