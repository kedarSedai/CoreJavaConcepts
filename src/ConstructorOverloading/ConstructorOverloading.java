package ConstructorOverloading;

public class ConstructorOverloading {
    private String name;
    private int age;
    private String lname;

    public ConstructorOverloading(String name, int age) {
        this.name = name; //THIS is a reference variable in Java that refers to the current object.
        this.age = age;
    }

    public ConstructorOverloading(String name, int age, String lname) {
        this.name = name;
        this.age = age;
        this.lname = lname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLname() {
        return lname;
    }
}
