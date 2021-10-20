package Practic.src.ru.mirea.task13.myArr;


public class Main
{
    public static void out(MyArr<Integer> id)
    {
        for (int i = 0; i < id.size(); i++)
        {
            System.out.print(id.get(i) + " ");
        }
    }

    public static void main(String[] args)
    {
        MyArr<Integer> id = new MyArr<>();
        id.add(1);
        id.add(2);
        id.add(3);
        System.out.print("Массив: ");
        out(id);
        System.out.println();

        System.out.print("Размер массива: ");
        System.out.println(id.size());

        System.out.println("Удаление элемента с индексом 0");
        id.delete(0);
        out(id);
        System.out.println();

        System.out.println("Элемент с индексом 0");
        System.out.println(id.get(0));

        System.out.println("Измененный элемент с индексом 0");
        id.update(0, 9);
        System.out.print(id.get(0));
    }
}
