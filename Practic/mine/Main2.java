package Practic.mine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        int n;
        DecimalFormat dec = new DecimalFormat("#.#####");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        float[] x = new float[n];
        float[] f = new float[n];
        //float a = 0.8f;
        //float b = 4.8f;
        float a = 0.2f;
        float b = 3.2f;
        float[] A = new float[n];
        float[] t = new float[n];
        float[] FT = new float[n];
        switch (n)
        {
            case 4:
                A[0] = A[3] = 0.347854f;
                A[1] = A[2] = 0.652145f;
                t[0] = -0.861136f;
                t[3] =  0.861136f;
                t[1] = -0.339981f;
                t[2] =  0.339981f;
                for (int i = 0; i < n; i++)
                {
                    x[i] = (float) (((a+b)/2.0) + ((b-a)/2.0) * t[i]);
                    f[i] = (float) ((float) (x[i] + 1.4)/(x[i] * x[i] + x[i] + 1.8));
                    FT[i] = A[i] * f[i];
                }
                for (int i = 0; i < n; i++)
                    System.out.println("x[" + i + "] = " + x[i]);
                for (int i = 0; i < n; i++)
                    System.out.println("f[" + i + "] = " + f[i]);
                break;
            case 6:
                A[0] = A[5] = 0.171324f;
                A[1] = A[4] = 0.360761f;
                A[2] = A[3] = 0.467913f;
                t[0] = -0.932464f;
                t[5] =  0.932464f;
                t[1] = -0.661209f;
                t[4] =  0.661209f;
                t[2] = -0.238619f;
                t[3] =  0.238619f;
                for (int i = 0; i < n; i++)
                {
                    x[i] = (float) (((a+b)/2.0) + ((b-a)/2.0) * t[i]);
                    f[i] = (float) ((float) (x[i] + 1.4)/(x[i] * x[i] + x[i] + 1.8));
                    FT[i] = A[i] * f[i];
                }
                for (int i = 0; i < n; i++)
                    System.out.println("x[" + i + "] = " + x[i]);
                for (int i = 0; i < n; i++)
                    System.out.println("f[" + i + "] = " + f[i]);
                break;
            case 8:
                A[0] = A[7] = 0.101228f;
                A[1] = A[6] = 0.222381f;
                A[2] = A[5] = 0.313706f;
                A[3] = A[4] = 0.362683f;
                t[0] = -0.960289f;
                t[7] =  0.960289f;
                t[1] = -0.796666f;
                t[6] =  0.796666f;
                t[2] = -0.525532f;
                t[5] =  0.525532f;
                t[3] = -0.183434f;
                t[4] =  0.183434f;
                for (int i = 0; i < n; i++)
                {
                    x[i] = (float) (((a+b)/2.0) + ((b-a)/2.0) * t[i]);
                    f[i] = (float) ((float) (x[i] + 1.4)/(x[i] * x[i] + x[i] + 1.8));
                    FT[i] = A[i] * f[i];
                }
                for (int i = 0; i < n; i++)
                    System.out.println("x[" + (i+1) + "] = " + x[i]);
                for (int i = 0; i < n; i++)
                    System.out.println("f[" + (i+1) + "] = " + f[i]);
                break;
        }
        float F = 0.0f;
        for (int i = 0; i < n; i++)
            F += FT[i];
        float I = (float) (((b-a)/2.0) * F);
        String I_t = dec.format(I);
        System.out.println("I = " + I_t);
    }
}
