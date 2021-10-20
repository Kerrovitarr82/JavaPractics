package Practic.src.ru.mirea.task14;
import java.util.*;

public class MainStack
{
    private static void win1(Stack<Integer> first, Stack<Integer> second, ArrayList<Integer> buf1, ArrayList<Integer> buf2)
    {
        buf1.add(0, first.pop());
        buf1.add(0, second.pop());
        for (int j = 0; j < buf1.size(); j++)
        {
            first.push(buf1.get(j));
        }
        for (int j = 0; j < buf2.size(); j++)
        {
            second.push(buf2.get(j));
        }
    }

    private static void win2(Stack<Integer> first, Stack<Integer> second, ArrayList<Integer> buf1, ArrayList<Integer> buf2)
    {
        buf2.add(0, first.pop());
        buf2.add(0, second.pop());
        for (int j = buf1.size() - 1; j >= 0; j--)
        {
            first.push(buf1.get(j));
        }
        for (int j = buf2.size() - 1; j >= 0; j--)
        {
            second.push(buf2.get(j));
        }
    }

    public static void main(String[] args)
    {
        int[] a1 = new int[5];
        for (int i = 0; i < a1.length; i++)
        {
            a1[i] = ((int) (Math.random() * 10));
            System.out.print(a1[i] + " ");
        }
//        a1[0] = 1;
//        a1[1] = 3;
//        a1[2] = 5;
//        a1[3] = 7;
//        a1[4] = 9;

        System.out.println();
        int[] a2 = new int[5];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = ((int) ((Math.random() * 10)));
            System.out.print(a2[i] + " ");
        }
//        a2[0] = 2;
//        a2[1] = 4;
//        a2[2] = 6;
//        a2[3] = 8;
//        a2[4] = 0;

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        for (int i = 0; i < 5; i++)
        {
            first.push(a1[i]);
            second.push(a2[i]);
        }

        int count = 0;
        boolean res = false;

        System.out.println();
        ArrayList<Integer> buf1 = new ArrayList<>();
        ArrayList<Integer> buf2 = new ArrayList<>();
        for (int i = 0; i < 106; i++)
        {
            buf1.clear();
            buf2.clear();
            if (first.empty())
            {
                System.out.println("second " + count);
                res = true;
                break;
            }
            else if (second.empty())
            {
                System.out.println("first " + count);
                res = true;
                break;
            }
            count++;
            while(first.size() != 1)
                buf1.add(first.pop());
            while(second.size() != 1)
                buf2.add(second.pop());
            if (first.peek() == 0 && second.peek() == 9)
            {
                win1(first, second, buf1, buf2);
            }
            else if (second.peek() == 0 && first.peek() == 9)
            {
                win2(first, second, buf1, buf2);
            }
            else if (second.peek() > first.peek())
            {
                win2(first, second, buf1, buf2);
            }
            else if (first.peek() > second.peek())
            {
                win1(first, second, buf1, buf2);
            }
        }
        if (!res) System.out.println("Botva!"); //если не укладываемся в ходы
    }
}
