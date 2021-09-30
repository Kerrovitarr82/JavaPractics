package Practic.src.ru.mirea.task10;

public class Main3
{
    public static String left(int n)
    {
        if (n < 10)
        {
            return Integer.toString(n);
        }
        else
        {
            return (n % 10) + " " + left(n / 10);
        }
    }

    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        System.out.println( left(n));
    }
}
