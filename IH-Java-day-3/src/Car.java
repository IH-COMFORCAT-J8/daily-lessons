public class Car extends Vehicle {
    
    private boolean hasAirConditioned;
    private boolean isOffRoad;
    
    public Car(String brand, String model, String licensePlate, boolean hasAirConditioned, boolean isOffRoad) {
        super(4, brand, model, licensePlate);
        this.hasAirConditioned = hasAirConditioned;
        this.isOffRoad = isOffRoad;
    }

    public boolean isHasAirConditioned() {
        return hasAirConditioned;
    }

    public void setHasAirConditioned(boolean hasAirConditioned) {
        this.hasAirConditioned = hasAirConditioned;
    }

    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad(boolean offRoad) {
        isOffRoad = offRoad;
    }
}