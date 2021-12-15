package Practic.src.ru.mirea.task28;

class Car {
    String name;
    Wheels wheels = new Wheels();
    
    class Wheels {
        private boolean exists = true;

        public void stole() {
            System.out.println("Колеса украли!");
            exists = false;
        }
    }

    void anon(){}
}

public class AnonEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.wheels.stole();

        Car car1 = new Car() {
            public void anon() {
                System.out.println("Это анонимный класс. Только тссс...");
            }
        };
        car1.anon();
    }
}
