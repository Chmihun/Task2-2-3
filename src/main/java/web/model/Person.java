package web.model;

public class Person {
    private int id;
    private String name;
    private String surName;
    private int year;

    public Person() {
    }

    public Person(int id, String name, String surName, int yea) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.year = yea;
    }

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Person setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Person setYear(int year) {
        this.year = year;
        return this;
    }
}
