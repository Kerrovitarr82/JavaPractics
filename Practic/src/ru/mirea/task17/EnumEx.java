package Practic.src.ru.mirea.task17;

import java.util.Scanner;

enum Planet {
    MERCURY(0.3, 2.4, 0.38), VENUS(5, 6, 0.9), EARTH(6, 6, 9.8), MARS(0.6, 3.5, 0.38),
    JUPITER(1876.6, 71.3, 2.55), SATURN(562, 60.1, 1.12), URANUS(86, 26.5, 0.97), NEPTUNE(101.6, 24.8, 1.17);

    private double m, r, g;

    Planet(double mass, double rad, double G) {
        m = mass;
        r = rad;
        g = G;
    }

    double getG() {
        return g;
    }
}


public class EnumEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для какой планеты вы хотите вывести силу притяжения?");
        System.out.println("1) Меркурий\n2) Венера\n3) Земля\n4) Марс\n5) Юпитер\n6) Сатурн\n7) Уран\n8) Нептун");
        int sw = scanner.nextInt();
        switch (sw) {
            case 1:
                System.out.println("Сила притяжения = " + Planet.MERCURY.getG());
                break;
            case 2:
                System.out.println("Сила притяжения = " + Planet.VENUS.getG());
                break;
            case 3:
                System.out.println("Сила притяжения = " + Planet.EARTH.getG());
                break;
            case 4:
                System.out.println("Сила притяжения = " + Planet.MARS.getG());
                break;
            case 5:
                System.out.println("Сила притяжения = " + Planet.JUPITER.getG());
                break;
            case 6:
                System.out.println("Сила притяжения = " + Planet.SATURN.getG());
                break;
            case 7:
                System.out.println("Сила притяжения = " + Planet.URANUS.getG());
                break;
            case 8:
                System.out.println("Сила притяжения = " + Planet.NEPTUNE.getG());
                break;
        }

    }
}
