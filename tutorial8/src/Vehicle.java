public abstract class Vehicle {


    private String make;
    private String model;
    private int year;

    public Vehicle (String make, String model, int year){

        this.make = make;
        this.model = model;
        this.year = year;

    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public int getYear() {
        return this.year;
    }


    public double calculateFuelEfficiency(double milesDriven, double fuelConsumed){

        return milesDriven/fuelConsumed;
    }
}
