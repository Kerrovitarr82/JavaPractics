package Practic.src.ru.mirea.task22;

import java.util.Scanner;

class VictorianChair implements Chair {
    String name = "Викторианский стул";

    @Override
    public String getName() {
        return name;
    }
}
class ManyFuncChair implements Chair {
    String name = "Многофункциональный стул";

    @Override
    public String getName() {
        return name;
    }
}
class MagicChair implements Chair {
    String name = "Магический стул";

    @Override
    public String getName() {
        return name;
    }
}

class ChairFactory {
    public Chair createChair (ChairType type) {
        Chair chair = null;

        switch (type) {
            case VICTORIANCHAIR:
                chair = new VictorianChair();
                break;
            case MANYFUNCCHAIR:
                chair = new ManyFuncChair();
                break;
            case MAGICCHAIR:
                chair = new MagicChair();
                break;
        }

        return chair;
    }
}

enum ChairType {
    VICTORIANCHAIR,
    MANYFUNCCHAIR,
    MAGICCHAIR
}

class Client {
    private ChairFactory chairFactory = new ChairFactory();

    void Sit(ChairType type) {
        Chair chair = chairFactory.createChair(type);
        System.out.println("Вы сели на " + chair.getName());
    }
}

public class FactoryEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Викторианский стул\n2) Многофункциональный стул\n3) Магический стул");
        int sw = sc.nextInt();
        Client client = new Client();
        switch (sw) {
            case 1:
                client.Sit(ChairType.VICTORIANCHAIR);
                break;
            case 2:
                client.Sit(ChairType.MANYFUNCCHAIR);
                break;
            case 3:
                client.Sit(ChairType.MAGICCHAIR);
                break;
        }
    }
}
