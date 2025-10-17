package rotten.pizza;

import java.util.*;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("1 Margherita");
        System.out.println("2 Pepperoni");
        System.out.println("3 Hawaiian");

        System.out.print("Choose number: ");
        String choice = sc.nextLine();
        String pizza = "";
        if (choice.equals("1")) pizza = "Margherita";
        else if (choice.equals("2")) pizza = "Pepperoni";
        else pizza = "Hawaiian";

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());

        double price = 0;
        switch (pizza) {
            case "Margherita": price = 12.50; break;
            case "Pepperoni":  price = 14.50; break;
            case "Hawaiian":   price = 14.00; break;
        }
        double total = qty * price * 1.19;

        String receipt = pizza + " x" + qty + " = " + total + " EUR";
        System.out.println(receipt);
    }
}