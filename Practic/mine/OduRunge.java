package Practic.mine;

import java.text.DecimalFormat;

public class OduRunge
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
        float[] K1 = new float[4];
        float[] K2 = new float[4];
        float[] K3 = new float[4];
        float[] K4 = new float[4];
        for (int i = 0; i < 4; i++)
        {
            K1[i] = x[i]*x[i] + ((1.8f - 1.0f)/2.0f)*y[i];
            K2[i] = (x[i]+h/2.0f)*(x[i]+h/2.0f) + ((1.8f - 1.0f)/2.0f)*(y[i] + (h*K1[i])/2.0f);
            K3[i] = (x[i]+h/2.0f)*(x[i]+h/2.0f) + ((1.8f - 1.0f)/2.0f)*(y[i] + (h*K2[i])/2.0f);
            K4[i] = (x[i]+h)*(x[i]+h) + ((1.8f - 1.0f)/2.0f)*(y[i] + h*K3[i]);
            y[i+1] = y[i] + h/6.0f * (K1[i] + 2.0f*K2[i] + 2.0f*K3[i] +K4[i]);
        }
        String f;
        for (int i = 0; i < 4; i++)
        {
            f = dec.format(K1[i]);
            System.out.println("K1[" + i + "] = " + f);
        }
        for (int i = 0; i < 4; i++)
        {
            f = dec.format(K2[i]);
            System.out.println("K2[" + i + "] = " + f);
        }
        for (int i = 0; i < 4; i++)
        {
            f = dec.format(K3[i]);
            System.out.println("K3[" + i + "] = " + f);
        }
        for (int i = 0; i < 4; i++)
        {
            f = dec.format(K4[i]);
            System.out.println("K4[" + i + "] = " + f);
        }
        for (int i = 0; i < 5; i++)
        {
            f = dec.format(y[i]);
            System.out.println("y[" + (i) + "] = " + f);
        }
    }
}
