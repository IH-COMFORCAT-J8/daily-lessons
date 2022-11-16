public class Motorbike extends Vehicle {

    private boolean isRacing;
    private boolean isAutomatic;

    public Motorbike(String brand, String model, String licensePlate, boolean isRacing, boolean isAutomatic) {
        super(2, brand, model, licensePlate);
        this.isRacing = isRacing;
        this.isAutomatic = isAutomatic;
    }

    public boolean isRacing() {
        return isRacing;
    }

    public void setRacing(boolean racing) {
        isRacing = racing;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public void setNumOfWheels(int numOfWheels) {
        if (numOfWheels > 3) {
            System.err.println("No es una moto");
        } else {
            super.setNumOfWheels(numOfWheels);
        }
    }

    @Override
    public void moveForward(int meters) {
        
    }
    
}
