package Practic.src.ru.mirea.task8;

import javax.swing.*;

public class Main extends Animation
{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-0.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-1.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-2.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-3.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-4.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-5.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-6.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-7.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-8.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-9.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-10.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-11.png").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/rock/rock-12.png").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 13; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(30);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
