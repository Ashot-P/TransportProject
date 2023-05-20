public class Helicopter extends AirTransport implements Moveable {
    private int rotorDiameter;
    public void setRotorDiameter(int rotorDiameter) {
        if(rotorDiameter > 0){this.rotorDiameter = rotorDiameter;}
    }
    public int getRotorDiameter() {
        return rotorDiameter;
    }

    public Helicopter(int id, String model, int maxSpeed, int capacity, String currentLocation, int altitude, int range, int rotorDiameter){
        super(id, model, maxSpeed, capacity, currentLocation, altitude, range);

        this.rotorDiameter = rotorDiameter;
    }

    public Helicopter(int id) {
        super(id);
    }

    public String getType() {
        return "Helicopter";
    }

    public void fly(){

    }

    public void move(){

    }

    public String toString() {
        return super.toString() + "Helicopter";
    }
}
