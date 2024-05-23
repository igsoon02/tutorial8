class Car extends Vehicle {

    private double milesDriven;
    private double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);

        this.fuelConsumed = fuelConsumed;
        this.milesDriven = milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double getMilesDriven() {
        return milesDriven;
    }


}
