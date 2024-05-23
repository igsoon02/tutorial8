class Truck extends Vehicle {

    private double milesDriven;
    private double fuelConsumed;
    private double cargoweight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoweight) {
        super(make, model, year);

        this.fuelConsumed = fuelConsumed;
        this.milesDriven = milesDriven;
        this.cargoweight = cargoweight;

    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getCargoweight() {
        return cargoweight;
    }


    @Override
    public double calculateFuelEfficiency(double milesDriven, double fuelConsumed){

        return milesDriven/(fuelConsumed + (cargoweight * 0.5));
    }


}