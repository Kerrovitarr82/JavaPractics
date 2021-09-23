package Practic.src.ru.mirea.task8;

import javax.swing.*;

public class Main extends Animation
{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/0.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/1.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/2.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/3.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/4.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/5.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/6.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/7.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/8.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/9.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/10.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/11.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/12.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/13.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/14.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/15.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/16.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/17.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/18.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/19.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/20.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/21.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/22.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/23.gif").getImage());
        framlist.add(new ImageIcon("Practic/src/ru/mirea/task8/manime/24.gif").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 25; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(15);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
