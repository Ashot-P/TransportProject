public class Sailboat extends WaterTransport implements Moveable{
    private int mastHeight;
    public void setMastHeight(int mastHeight) {
        if(mastHeight > 0){this.mastHeight = mastHeight;}
    }
    public int getMastHeight() {
        return mastHeight;
    }

    public Sailboat(int id, String model, int maxSpeed, int capacity, String currentLocation, String hullType, int mastHeight){
        super(id, model, maxSpeed, capacity, currentLocation, hullType);

        this.mastHeight = mastHeight;
    }

    public Sailboat(int id) {
        super(id);
    }

    public String getType() {
        return "Sailboat";
    }

    public void sail(){

    }

    public void move(){

    }

    public String toString() {
        return super.toString() + "Sailboat";
    }
}
