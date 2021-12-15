package Practic.src.ru.mirea.task29;

import java.io.*;

class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int cash = 10000;

    public int getCash() {
        return cash;
    }
}

public class SerialEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo currencyInfo = new CurrencyInfo();
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();
        currencyInfo = null;
        System.out.println(currencyInfo);

        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        currencyInfo = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(currencyInfo.getCash());
    }
}
