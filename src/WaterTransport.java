public abstract class WaterTransport extends Transport {
    private String hullType;
    public void setHullType(String hullType) {

        if (!hullType.isEmpty()) {this.hullType = hullType;}
    }
    public String getHullType() {
        return hullType;
    }

    public WaterTransport(int id, String model, int maxSpeed, int capacity, String currentLocation, String hullType) {
        super(id, model, maxSpeed, capacity, currentLocation);

        this.hullType = hullType;
    }

    public WaterTransport(int id) {
        super(id);
    }

    public String toString() {
        return "Water" + super.toString();
    }
}
