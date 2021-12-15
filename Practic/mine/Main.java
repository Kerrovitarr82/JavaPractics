package Practic.mine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        float[] x = new float[n+1];
        x[0] = 0.2f;
        //x[0] = 0.8f;
        System.out.println("x[0] = " + x[0]);
        //float h = (float) 3.0/n;
        float h = (float) 3.0/n;
        float[] f = new float[n+1];
        float F = 0.0f;
        DecimalFormat dec = new DecimalFormat("#.#####");
        for (int i = 1; i < n+1; i++)
        {
            x[i] = x[i-1] + h;
            System.out.println("x[" + i + "] = " + x[i]);
        }
        for (int i = 0; i < n+1; i++)
        {
            f[i] = (float) ((float) (x[i] + 1.4)/(x[i] * x[i] + x[i] + 1.8));
            //f[i] = (float) ((float) (x[i] + 1.6)/(x[i] * x[i] + x[i] + 3.2));
            String f_t = dec.format(f[i]);
            System.out.println("F(x[" + i + "]) = " + f_t);
            if (i > 0 && i < n)
                F += f[i];
        }
        String F_t = dec.format(F);
        System.out.println("Сумма f[i] = " + F_t);
        float I = (float) ((h/2.0) * (f[0] + f[n] + 2.0 * F));
        System.out.println(h);
        String I_t = dec.format(I);
        System.out.println("I = " + I_t);
    }
}
