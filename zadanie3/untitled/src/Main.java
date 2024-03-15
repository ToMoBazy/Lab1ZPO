import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car("Audi","A4",new CarSpeed()));
        cars.add(new Car("Mercedes","S",new CarSpeed()));
        cars.add(new Car("Opel","Corsa",new CarSpeed()));


        for (Car car: cars){
            System.out.println("Car No." + cars.indexOf(car));
            System.out.println(car.getCarName());
            System.out.println(car.getMaxSpeed());
        }
    }
}