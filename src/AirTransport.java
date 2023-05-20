public abstract class AirTransport extends Transport{
    private int altitude;
    public void setAltitude(int altitude) {this.altitude = altitude;
    }
    public int getAltitude() {
        return altitude;
    }

    private int range;
    public void setRange(int range) {
        if(altitude > 0){this.range = range;}
    }
    public int getRange() {
        return range;
    }

    public AirTransport(int id, String model, int maxSpeed, int capacity, String currentLocation, int altitude, int range){
        super(id, model, maxSpeed, capacity, currentLocation);

        this.altitude = altitude;
        this.range = range;
    }

    public AirTransport(int id) {
        super(id);
    }

    public String toString() {
        return "Air" + super.toString();
    }
}
