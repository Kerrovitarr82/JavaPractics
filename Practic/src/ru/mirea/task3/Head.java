package ru.mirea.task3;
import java.math.*;
public class Head
{
    private int numOfEyes;

    public Head(int numOfEyes)
    {
        this.numOfEyes = numOfEyes;
    }

    public Head()
    {
        this.numOfEyes = 2;
    }

    public void Wink()
    {
        if (numOfEyes == 2)
        {
            int i = (int) (0 + Math.random()*2);
            switch (i)
            {
                case 0:
                    System.out.println("Вам подмигнули правым глазом");
                    break;
                case 1:
                    System.out.println("Вам подмигнули левым глазом");
                    break;
            }
        }
        else if (numOfEyes == 1)
            System.out.println("Вы видите, как человек подмигнул вам своим единственным глазом");
        else if (numOfEyes == 0)
            System.out.println("Вы ждали, что вам подмигнут, но к сожалению люди без глаз этого делать не умеют");
        else if (numOfEyes > 2)
            System.out.println("Вы смотрите как существо перед вами поочередно подмигивает каждым своим глазом");
    }
}
