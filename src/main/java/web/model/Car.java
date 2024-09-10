package web.model;

public class Car {
    private int id;
    private String model;
    private int engine;
    private int serial;

    public Car(int id, String model, int engine, int serial) {
        this.id = id;
        this.model = model;
        this.engine = engine;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public Car setId(int id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getEngine() {
        return engine;
    }

    public Car setEngine(int engine) {
        this.engine = engine;
        return this;
    }

    public int getSerial() {
        return serial;
    }

    public Car setSerial(int serial) {
        this.serial = serial;
        return this;
    }
}
