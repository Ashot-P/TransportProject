public class Speedboat extends WaterTransport implements Moveable{
    private int hullLength;
    public void setHullLength(int hullLength) {
        if(hullLength > 0){this.hullLength = hullLength;}
    }
    public int getHullLength() {
        return hullLength;
    }

    public Speedboat(int id, String model, int maxSpeed, int capacity, String currentLocation, String hullType, int hullLength){
        super(id, model, maxSpeed, capacity, currentLocation, hullType);

        this.hullLength = hullLength;
    }

    public Speedboat(int id) {
        super(id);
    }

    public String getType() {
        return "Speedboat";
    }

    public void sail(){

    }

    public void move(){

    }

    public String toString() {
        return super.toString() + "Speedboat";
    }
}
