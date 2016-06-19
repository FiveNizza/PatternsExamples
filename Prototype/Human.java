package by.Prohorov.Prototype;

public class Human implements IClone{
    private int age;
    private String name;

    public Human() {}

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
//        Human copy = new Human(age, name);
        return new Human(age, name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age;
    }
}
