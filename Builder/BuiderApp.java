package by.Prohorov;

public class BuiderApp {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new FordMondeoBuilder());
        Car car = director.buildCar();
        System.out.println(car);
        director.setBuilder(new FordFocusBuilder());
        car = director.buildCar();
        System.out.println(car);
    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    String name;
    Transmission transmission;
    int maxSpeed;

    public void setName(String name) {this.name = name;}
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    public String toString() {
        return "Car [name=" + name + ", transmission=" + transmission
                + ", maxSpeed=" + maxSpeed + "]";
    }


}

abstract class CarBuilder {
    Car car;
    void createCar() {car = new Car();}

    abstract void buildName();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }
}

class FordMondeoBuilder extends CarBuilder {
    void buildName() {car.setName("Ford Mondeo");}
    void buildTransmission() {car.setTransmission(Transmission.AUTO);}
    void buildMaxSpeed() {car.setMaxSpeed(210);}
}

class FordFocusBuilder extends CarBuilder {
    void buildName() {car.setName("Ford Focus");}
    void buildTransmission() {car.setTransmission(Transmission.MANUAL);}
    void buildMaxSpeed() {car.setMaxSpeed(200);}
}

class Director{
    CarBuilder builder;
    void setBuilder(CarBuilder b) {builder = b;}

    Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildTransmission();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }
}