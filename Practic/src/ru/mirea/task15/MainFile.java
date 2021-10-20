package Practic.src.ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class MainFile
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner= new Scanner(System.in);
        String text;
        //String t = "Жизнь прежде смерти. Сила прежде слабости. Путь прежде цели.";

        while (true)
        {
            System.out.println("1. Записать данные в файл, перед этим его перезаписав\n2. Вывести данные из файла\n3. Записать данные в конец файла");
            int i = scanner.nextInt();
            switch (i)
            {
                case 1:
                    FileWriter writer = new FileWriter("file.txt", false);
                    text = scanner.nextLine();
                    text = scanner.nextLine();
                    writer.write(text + "\n" + text + " (Дубль)");
                    writer.close();
                    break;
                case 2:
                    FileReader reader = new FileReader("file.txt");
                    Scanner scanner1 = new Scanner(reader);
                    while (scanner1.hasNextLine())
                    {
                        System.out.println(scanner1.nextLine());
                    }
                    reader.close();
                    break;
                case 3:
                    FileWriter writer2 = new FileWriter("file.txt", true);
                    text = scanner.nextLine();
                    text = scanner.nextLine();
                    writer2.write("\n" + text);
                    writer2.close();
                    break;
            }
        }
    }
}
