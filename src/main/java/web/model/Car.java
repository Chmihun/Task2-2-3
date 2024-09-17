package web.model;

public class Car {
    private int id;
    private String model;
    private int engine;
    private int serial;

    public Car(int id, String model, int serial, int engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public int getSerial() {
        return serial;
    }

}
