package DAY12.HOMETASK;



class Engine3 {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car7 {

    Engine3 engine = new Engine3();

    void drive() {
        engine.start();
        System.out.println("Driving");
    }
}

class SportsCar5 extends Car7 {

    void race() {
        System.out.println("Racing");
    }
}

public class IsAHasA {

    public static void main(String[] args) {

        SportsCar5 car = new SportsCar5();

        car.drive();
        car.race();
    }
}