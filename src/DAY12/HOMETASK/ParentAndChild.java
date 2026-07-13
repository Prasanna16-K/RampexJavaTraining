package DAY12.HOMETASK;

    class Car9 {

        Car9() {
            System.out.println("Car Ready");
        }

        void display() {
            System.out.println("Normal Car");
        }
    }

    class SportsCar6 extends Car9 {

        void display() {
            System.out.println("Sports Car");
        }
    }

    public class ParentAndChild {

        public static void main(String[] args) {

            SportsCar6 car = new SportsCar6();

            car.display();
        }
    }