public class Car extends LandTransport implements Moveable{
    private String wheelBase;
    public void setWheelBase(String wheelBase) {

        if (!wheelBase.isEmpty()) {this.wheelBase = wheelBase;}
    }
    public String getWheelBase() {
        return wheelBase;
    }

    public Car(int id, String model, int maxSpeed, int capacity, String currentLocation, String wheelType, String wheelBase){
        super(id, model, maxSpeed, capacity, currentLocation, wheelType);

        this.wheelBase = wheelBase;
    }

    public Car(int id) {
        super(id);
    }
    public String getType() {
        return "Car";
    }

    public void move() {

    }

    public String toString() {
        return super.toString() + "Car";
    }
}
