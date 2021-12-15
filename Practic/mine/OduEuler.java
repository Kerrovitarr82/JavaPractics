package Practic.mine;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OduEuler
{
    public static void main(String[] args)
    {
        DecimalFormat dec = new DecimalFormat("#.#####");
        float h = 0.5f;
        float[] x = new float[5];
        x[0] = 0.0f;
        x[1] = 0.5f;
        x[2] = 1.0f;
        x[3] = 1.5f;
        x[4] = 2.0f;
        float[] y = new float[5];
        y[0] = 1.4f;
        float[] F = new float[5];
        for (int i = 0; i < 4; i++)
        {
            F[i] = x[i]*x[i] + ((1.8f - 1.0f)/2.0f)*y[i];
            y[i+1] = y[i] + h * F[i];
        }
        String f;
        for (int i = 0; i < 5; i++)
        {
            f = dec.format(F[i]);
            System.out.println("F[x(" + (i) + "), y(" + (i) + ")] = " + f);
            f = dec.format(y[i]);
            System.out.println("y[" + (i) + "] = " + f);
        }
    }
}
