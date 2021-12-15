package Practic.src.ru.mirea.task18;

import java.util.Scanner;

enum Customer {
    DENIS_SHATOV(12121212), MAX_ANDR(212121221);

    private int inn;

    Customer(int INN) {
        inn = INN;
    }

    double getInn() {
        return inn;
    }
}

public class TryCatchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ИНН Дениса Шатова");
        try {
            int inn = scanner.nextInt();
            if (inn == Customer.DENIS_SHATOV.getInn()) {
               System.out.println("ИНН введен верно");
            }
            else {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("ИНН указан неверно!!!");
        }
    }
}
