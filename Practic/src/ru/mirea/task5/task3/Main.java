package Practic.src.ru.mirea.task5.task3;
import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("1) Add chair to cart\n2) Add table to cart\n3) Delete chair from cart\n4) Delete table from cart\n5) Show cart\n6) Balance\n7) Pay\n8) Set balance\n9) Exit");
        while (true)
        {
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    shop.addToCart(1);
                    break;
                case 2:
                    shop.addToCart(2);
                    break;
                case 3:
                    shop.deleteFromCart(1);
                    break;
                case 4:
                    shop.deleteFromCart(2);
                    break;
                case 5:
                    shop.cart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    shop.pay();
                    break;
                case 8:
                    System.out.println("How many money you want to add?");
                    choice = in.nextInt();
                    shop.setMoney(choice);
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

}
