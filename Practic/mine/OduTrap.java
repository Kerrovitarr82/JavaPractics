package Practic.mine;

import java.text.DecimalFormat;

public class OduTrap
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
        float[] Ft = new float[5];
        for (int i = 0; i < 4; i++)
        {
            F[i] = x[i]*x[i] + ((1.8f - 1.0f)/2.0f)*y[i];
            Ft[i] = x[i+1]*x[i+1] + ((1.8f - 1.0f)/2.0f) * (y[i] + h*F[i]);
            y[i+1] = y[i] + h/2.0f * (F[i] + Ft[i]);
        }
        String f;
        for (int i = 0; i < 4; i++)
        {
            f = dec.format(F[i]);
            System.out.println("F[x(" + (i) + "), y(" + (i) + ")] = " + f);
            f = dec.format(Ft[i]);
            System.out.println("Ft[x(" + (i) + "), y(" + (i) + ")] = " + f);
        }
        for (int i = 0; i < 5; i++)
        {
            f = dec.format(y[i]);
            System.out.println("y[" + (i) + "] = " + f);
        }
    }
}
