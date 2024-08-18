package dev.dhruv.factory.vehicle;

public abstract class Vehicle {
    public abstract String getVehicle();
}

class TwoWheeler extends Vehicle {

    @Override
    public String getVehicle() {
        return "I'm a Two Wheeler Vehicle";
    }
}

class FourWheeler extends Vehicle {

    @Override
    public String getVehicle() {
        return "I'm a Four Wheeler Vehicle";
    }
}

class Client {
    private Vehicle vehicle;

    public Client(int type) {
        if (type == 1) {
            vehicle = new TwoWheeler();
        } else if (type == 2) {
            vehicle = new FourWheeler();
        } else {
            vehicle = null;
        }
    }

    public void cleanup() {
        if (vehicle != null) {
            vehicle = null;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
