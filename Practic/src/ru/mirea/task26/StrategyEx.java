package Practic.src.ru.mirea.task26;

import java.util.Scanner;

interface PayStrategy {

    public void pay(Client client);
}

class QiwiPayStrategy implements PayStrategy {

    @Override
    public void pay(Client client) {
        System.out.println("Оплата с помощью Qiwi");
        client.cash -= 3000;
    }
}

class VisaPayStrategy implements PayStrategy {

    @Override
    public void pay(Client client) {
        System.out.println("Оплата с помощью Visa");
        client.cash -= 2000;
    }
}
class Client {

    PayStrategy payStrategy;
    int cash = 5000;

    public void pay() {
        payStrategy.pay(this);
    }

}

public class StrategyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client = new Client();
        System.out.println("1) С помощью Qiwi\n2) С помощью карты");
        int sw = sc.nextInt();
        switch (sw) {
            case 1:
                client.payStrategy = new QiwiPayStrategy();
                client.pay();
                System.out.println("Ваш баланс после оплаты с помощью Qiwi: " + client.cash);
                break;
            case 2:
                client.payStrategy = new VisaPayStrategy();
                client.pay();
                System.out.println("Ваш баланс после оплаты с помощью карты: " + client.cash);
                break;
        }
    }
}