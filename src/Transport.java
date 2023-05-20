public abstract class Transport {
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    private String model;
    public void setModel(String model) {
        if (!model.isEmpty()) {
            this.model = model;
        }
    }
    public String getModel() {
        return model;
    }

    private int maxSpeed;
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0){this.maxSpeed = maxSpeed;}
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int capacity;
    public void setCapacity(int capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
        }
    }
    public int getCapacity() {
        return capacity;
    }

    private String currentLocation;
    public void setCurrentLocation(String currentLocation) {
        if (!currentLocation.isEmpty()) {
            this.currentLocation = currentLocation;
        }
    }
    public String getCurrentLocation() {
        return currentLocation;
    }

    public Transport(int id, String model, int maxSpeed, int capacity, String currentLocation){
        this(id);

        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.currentLocation = currentLocation;
    }

    public Transport(int id) {
        this.id = id;
    }

    public abstract String getType();
    //public abstract int getAvailableCapacity();

    public String toString() {
        return "Transport";
    }
}
