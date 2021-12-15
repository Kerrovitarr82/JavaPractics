package Practic.src.ru.mirea.task23;

class Car {
    String model;
}

public class HashEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Ferrari";
        Car car2 = new Car();
        car2.model = "Ferrari";
        Car car3 = new Car();
        car3.model = "Mazda";
        Car car4 = new Car();
        car4.model = "BMW";
        Car car5 = new Car();
        car5.model = "Audi";

        System.out.println("\nСравниваем хэш код имени модели\n");
        int hash1 = car1.model.hashCode();
        System.out.println(hash1);
        int hash2 = car2.model.hashCode();
        System.out.println(hash2);
        int hash3 = car3.model.hashCode();
        System.out.println(hash3);
        int hash4 = car4.model.hashCode();
        System.out.println(hash4);
        int hash5 = car5.model.hashCode();
        System.out.println(hash5);

        System.out.println("\nСравниваем хэш код объекта\n");
        hash1 = car1.hashCode();
        System.out.println(hash1);
        hash2 = car2.hashCode();
        System.out.println(hash2);
        hash3 = car3.hashCode();
        System.out.println(hash3);
        hash4 = car4.hashCode();
        System.out.println(hash4);
        hash5 = car5.hashCode();
        System.out.println(hash5);
    }
}
