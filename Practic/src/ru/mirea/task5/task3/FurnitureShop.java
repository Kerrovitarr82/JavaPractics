package Practic.src.ru.mirea.task5.task3;

public class FurnitureShop
{
    private Furniture chair = new Chair("brown", "medium");
    private Furniture table = new Table("black", "large");
    private int sum = 0;
    private int tables = 0;
    private int chairs = 0;
    private int money = 5000;

    public void getBalance()
    {
        System.out.println("Your balance is " +money+".");
    }

    public void setMoney(int money)
    {
        this.money += money;
        System.out.println("Your balance is " +this.money+".");
    }

    public void addToCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("Chair added to cart");
            sum += chair.cost;
            chairs++;
        }
        if (choice == 2)
        {
            System.out.println("Table added to cart");
            sum += table.cost;
            tables++;
        }
    }

    public void deleteFromCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("One chair deleted");
            chairs--;
            sum -= chair.cost;
        }
        if (choice == 2)
        {
            System.out.println("One table deleted");
            tables--;
            sum -= table.cost;
        }
    }

    public void cart()
    {
        System.out.println("In your cart now " +tables+ " tables and " +chairs+ " chairs. Total is " +sum+ ".");
    }

    public void pay()
    {
        if (money >= sum)
        {
            money -=sum;
            System.out.println("You bye " +tables+ " tables and " +chairs+ " chairs.Your balance now is " +money+ ".");
            tables = 0;
            chairs = 0;
            sum = 0;
        }
        else
        {
            System.out.println("Total is " +sum+ ".You don't have enough money. Delete something from cart and try again.");
        }
    }

}
