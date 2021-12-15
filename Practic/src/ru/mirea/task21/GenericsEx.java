package Practic.src.ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

class Metro {
    private List<String> list = new ArrayList<String>();

    Metro() {
        list.add("Красная ветка");
        list.add("Синяя ветка");
        list.add("Желтая ветка");
        list.add("Зеленая ветка");
        list.add("Коричневая ветка");
        list.add("МЦК");
        list.add("МЦД");
    }

    void PrintList(boolean b) {
        if (b) {
            for (int i = 1; i < list.size(); i = i +2) {
                System.out.println(list.get(i));
            }
        }
        else {
            for (int i = 0; i < list.size(); i = i +2) {
                System.out.println(list.get(i));
            }
        }
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        Metro metro = new Metro();
        System.out.println("Нечетные элементы");
        metro.PrintList(true);
        System.out.println("Четные элементы");
        metro.PrintList(false);
    }
}
