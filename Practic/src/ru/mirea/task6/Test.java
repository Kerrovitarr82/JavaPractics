package Practic.src.ru.mirea.task6;

public class Test {
    public static void main(String[] args)
    {
        Planet mars = new Planet();
        Car audi = new Car();
        Animal dog = new Animal();
        Phone phone = new Phone();

        System.out.println(mars.getName());
        System.out.println(audi.getName());
        System.out.println(dog.getName());

        System.out.println("BMW costs " + audi.getPrice() + "$");
        System.out.println("Phone costs " + phone.getPrice() + "$");
    }
}
