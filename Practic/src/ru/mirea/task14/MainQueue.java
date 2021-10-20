package Practic.src.ru.mirea.task14;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue
{
    public static void main(String[] args)
    {
        int[] a1 = new int[5];
//        for (int i = 0; i < a1.length; i++)
//        {
//            a1[i] = ((int) (Math.random() * 10));
//            System.out.print(a1[i] + " ");
//        }
        a1[0] = 1;
        a1[1] = 3;
        a1[2] = 5;
        a1[3] = 7;
        a1[4] = 9;

        //System.out.println();
        int[] a2 = new int[5];
//        for (int i = 0; i < a2.length; i++) {
//            a2[i] = ((int) ((Math.random() * 10)));
//            System.out.print(a2[i] + " ");
//        }
        a2[0] = 2;
        a2[1] = 4;
        a2[2] = 6;
        a2[3] = 8;
        a2[4] = 0;

        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        for (int i = 0; i < 5; i++)
        {
            first.offer(a1[i]);
            second.offer(a2[i]);
        }
        int count = 0;
        boolean res = false;
        for (int i = 0; i < 106; i++)
        {
            if (first.peek() == null)
            {
                System.out.println("second " + count);
                res = true;
                break;
            }
            else if (second.peek() == null)
            {
                System.out.println("first " + count);
                res = true;
                break;
            }

            count++;

            if (first.peek() == 0 && second.peek() == 9)
            {
               first.offer(first.poll());
               first.offer(second.poll());
            }
            else if (second.peek() == 0 && first.peek() == 9)
            {
                second.offer(first.poll());
                second.offer(second.poll());
            }
            else if (second.peek() > first.peek())
            {
                second.offer(first.poll());
                second.offer(second.poll());
            }
            else if (first.peek() > second.peek())
            {
                first.offer(first.poll());
                first.offer(second.poll());
            }
        }
        if (!res) System.out.println("Botva!"); //если не укладываемся в ходы
    }
}
