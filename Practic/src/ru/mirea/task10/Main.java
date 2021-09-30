package Practic.src.ru.mirea.task10;

import java.util.Scanner;

public class Main
{

    public static void recursion()
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }

    public static void main(String[] args)
    {
        recursion();
    }
}
