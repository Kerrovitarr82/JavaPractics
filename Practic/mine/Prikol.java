package Practic.mine;

import java.util.Scanner;

public class Prikol {
    public static void main(String[] args) {
        try {
            int data = 11 / 5;
            System.out.println(data);
        }
        catch(NullPointerException e) {
                System.out.println(e);
            }
        finally {
                System.out.println("выполнение блока finally");
            }
            System. out. println("оставшийся участок кода");
    }
}

