package Practic.src.ru.mirea.task8.image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Img extends JFrame
{
    public Img(String href) throws IOException {
        super("Image");
        setSize(498, 498);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(href));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }
}
