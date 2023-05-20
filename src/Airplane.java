public class Airplane extends AirTransport implements Moveable {
    private String wingSpan;
    public void setWingSpan(String wingSpan) {
        if (!wingSpan.isEmpty()) {
            this.wingSpan = wingSpan;
        }
    }
    public String getWingSpan() {
        return wingSpan;
    }

    public Airplane(int id, String model, int maxSpeed, int capacity, String currentLocation, int altitude, int range, String wingSpan){
        super(id, model, maxSpeed, capacity, currentLocation, altitude, range);

        this.wingSpan = wingSpan;
    }


    public Airplane(int id) {
        super(id);
    }
    public String getType() {
        return "Airplane";
    }

    public void fly(){

    }

    public void move(){

    }

    public String toString() {
        return super.toString() + "Airplane";
    }
}
