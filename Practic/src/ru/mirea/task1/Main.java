package ru.mirea.task1;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;


public class Main
{
    public static void Fact(int n)
    {
        int factor = 1;
        for (int i = 1; i <= n; i++)
            factor *= i;
        System.out.println(factor);
    }

    public static void main(String[] args)
    {
        int sum = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++)
            sum += arr[i];
        System.out.println(sum);
        sum = 0;

        int j = 0;
        while (j < 10)
        {
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
        sum = 0;
        j = 0;

        do
        {
            sum += arr[j];
            j++;
        }
        while(j < 10);
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++)
            System.out.print(s1.charAt(i));

        double num = 1.0;
        for (int i = 1; i <= 10; i++)
            System.out.print(num/i + " ");

        System.out.println();

        int[] randArr = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < randArr.length; i++)
        {
            randArr[i] = (int) (Math.random() * 30);
            System.out.print(randArr[i] +" ");
        }
        System.out.println();
        Arrays.sort(randArr);
        for (int i = 0; i < randArr.length; i++)
        {
            System.out.print(randArr[i] +" ");
        }

        System.out.println();

        Fact(5);
    }
}
