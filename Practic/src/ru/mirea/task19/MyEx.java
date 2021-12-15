package Practic.src.ru.mirea.task19;

import java.util.Scanner;

class TriangleException extends Exception
{
    public String toString()
    {
        return "Ошибка! Неверно заданы углы";
    }
}

class Triangle {
    private int a, b, c;

    public Triangle(int a1, int b1, int c1)
    {
        try {
            if ((a1 != 90 && b1 != 90 && c1 != 90) || ((a1 + b1 + c1) != 180))
                throw new TriangleException();
        }
        catch(TriangleException e)
        {
            System.out.println(e.toString());
            return;
        }

        a = a1;
        b = b1;
        c = c1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class MyEx {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();

        Triangle tr = new Triangle(a,b,c);

        System.out.println(tr.toString());
    }
}
