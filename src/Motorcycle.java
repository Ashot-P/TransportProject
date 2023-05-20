public class Motorcycle extends LandTransport implements Moveable{
    private String suspension;
    public void setSuspension(String suspension) {
        if (!suspension.isEmpty()) {this.suspension = suspension;}
    }
    public String getSuspension() {
        return suspension;
    }

    public Motorcycle(int id, String model, int maxSpeed, int capacity, String currentLocation, String wheelType, String suspension){
        super(id, model, maxSpeed, capacity, currentLocation, wheelType);

        this.suspension = suspension;
    }

    public Motorcycle(int id) {
        super(id);
    }

    public String getType() {
        return "Motorcycle";
    }

    public void move() {

    }

    public String toString() {
        return super.toString() + "Motorcycle";
    }
}
