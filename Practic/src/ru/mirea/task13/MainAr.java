package Practic.src.ru.mirea.task13;

import java.util.*;

public class MainAr
{
    public static void main(String[] args)
    {
        ArrayList <Integer> id = new ArrayList<>();
        id.add(1);
        id.add(2);
        id.add(3);

        System.out.println("Начальный массив");
        System.out.println(id.size());
        System.out.println(id);

        System.out.println("Добавили четвертый элемент");
        id.add(3, 4);
        System.out.println(id.size());
        System.out.println(id);

        System.out.println("Вывели элемент по индексу 2");
        System.out.println(id.get(2));

        System.out.println("Вывели последнее вхождение 3");
        System.out.println(id.lastIndexOf(3));

        System.out.println("Поменяли элемент с индексом 2");
        id.set(2, 9);
        System.out.println(id);

        System.out.println("Индекс элемента со значением 2");
        System.out.println(id.indexOf(2));

        System.out.println("Вывод элементов с 1 по 2");
        System.out.println(id.subList(1, 3));
    }
}
