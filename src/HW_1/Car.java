package HW_1;


public class Car {
 String model;
 int power;
 double volumeEngine;
 boolean turbo;
 public Car(){
}
public Car(String model, int power, double volumeEngine, boolean turbo) {
    this.model = model;
    this.volumeEngine = volumeEngine;
    this.turbo = turbo;
};
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';

    };
};