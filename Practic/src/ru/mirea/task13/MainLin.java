package Practic.src.ru.mirea.task13;
import java.util.*;

public class MainLin
{
    public static void main(String[] args)
    {
        LinkedList<Integer> id = new LinkedList<>();
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);
        id.add(3);
        id.addFirst(1);
        id.addLast(9);

        System.out.println("Начальный массив");
        System.out.println(id.size());
        System.out.println(id);

        System.out.println("Добавили элемент с индексом 3");
        id.add(3, 7);
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

        System.out.println("Вывод элементов с 1 по 6");
        System.out.println(id.subList(1, 7));

        System.out.println("Удаление последнего элемента");
        id.removeLast();
        System.out.println(id);

        System.out.println("Удаление первого элемента");
        id.removeFirst();
        System.out.println(id);
    }
}
