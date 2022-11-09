public class Car {

    private int numberOfWheels = 4;
    private String brand;
    private String model;
    private String licensePlate;
    private boolean hasAirConditioned;

    private int mileage = 0;

    public Car(int numberOfWheels, String brand, String model, String licensePlate, boolean hasAirConditioned) {
        setNumberOfWheels(numberOfWheels);
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.hasAirConditioned = hasAirConditioned;

    }

    public Car(String brand, String model, String licensePlate, boolean hasAirConditioned) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.hasAirConditioned = hasAirConditioned;
    }


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = "NOT DEFINED";
        this.hasAirConditioned = false;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels < 0) {
            System.out.println("Error. El número de ruedas no puede ser  <0");
        } else {
            this.numberOfWheels = numberOfWheels;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isHasAirConditioned() {
        return hasAirConditioned;
    }

    public void setHasAirConditioned(boolean hasAirConditioned) {
        this.hasAirConditioned = hasAirConditioned;
    }

    public int getMileage() {
        return mileage;
    }

    public void travel(int mileage) {

        System.out.println("Se han recorrido " + mileage + " kms");

        this.mileage += mileage;

        System.out.println("Los kms totales del coche son " + this.mileage + "kms");
    }
    public void travel() {
        travel(50);

    }
}
