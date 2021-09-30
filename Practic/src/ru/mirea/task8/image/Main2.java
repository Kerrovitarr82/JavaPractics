package Practic.src.ru.mirea.task8.image;

import java.io.IOException;

public class Main2
{
    public static void main(String[] args) throws IOException
    {
        new Img(args.length != 0 ? args[0] : "Practic/src/ru/mirea/task8/rock/rock-12.png").setVisible(true);
    }
}
