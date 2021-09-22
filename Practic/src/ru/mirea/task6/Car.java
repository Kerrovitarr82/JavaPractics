package Practic.src.ru.mirea.task6;

public class Car implements Nameable, Priceable{
    private String name;
    private double price;

    public Car(){
        name = "Audi";
        price = 10000;
    }

    public String getName(){ return name; }
    public double getPrice() {return price;}
}
