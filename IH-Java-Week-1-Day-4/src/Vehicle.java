public abstract class Vehicle {

    private final int id;
    private int numOfWheels;
    private String brand;
    private String model;
    private String licensePlate;
    private static int idCounter = 0;

    private int mileage = 0;

    public Vehicle(int numOfWheels, String brand, String model, String licensePlate) {
        this.id = ++this.idCounter;
        this.numOfWheels = numOfWheels;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public abstract void moveForward(int meters);

}
