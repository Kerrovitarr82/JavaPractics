package Practic.src.ru.mirea.task25;

interface Service {
    public int getPrice();
    public String getLabel();
}

class Tea implements Service {
    private String label;
    private int price;

    public Tea(String label, int price) {
        this.label = label;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}
class Coffee implements Service {
    private String label;
    private int price;

    public Coffee(String label, int price) {
        this.label = label;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}
class OptionDecorator implements Service {
    private Service service;
    private String label;
    private int price;

    public OptionDecorator(Service service, String label, int price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    public int getPrice() {
        return this.price + service.getPrice();
    }

    public String getLabel() {
        return this.label + service.getLabel();
    }

}
class Cake extends OptionDecorator {
    public Cake(Service service) {
        super(service, "Пирожок", 500);
    }
}
class Cinnabon extends OptionDecorator {
    public Cinnabon(Service service) {
        super(service, "Синабон", 700);
    }
}

public class DecoratorEx {
    public static void main(String[] args) {
        Service tea = new Tea("Чай", 200);
        Service cake = new Cake(tea);
        System.out.println(cake.getPrice());

        Service coffee = new Coffee("Кофе", 250);
        Service cinnabon = new Cinnabon(coffee);
        System.out.println(cinnabon.getPrice());
    }
}