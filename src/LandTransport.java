public abstract class LandTransport extends Transport {
    private String wheelType;
    public void setWheelType(String wheelType) {

        if (!wheelType.isEmpty()) {this.wheelType = wheelType;}
    }
    public String getWheelType() {
        return wheelType;
    }

    public LandTransport(int id, String model, int maxSpeed, int capacity, String currentLocation, String wheelType){
        super(id, model, maxSpeed, capacity, currentLocation);

        this.wheelType = wheelType;
    }

    public LandTransport(int id) {
        super(id);
    }
    public String toString() {
        return "Land" + super.toString();
    }
}
