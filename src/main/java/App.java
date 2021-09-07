import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final String WISCONSIN_LABEL = "WI";
    private static final double WISCONSIN_TAX_RATE = 5.5;
    public static void main(String[] args) {
        double orderAmount;
        String state;
        double tax;
        double total;
        Scanner reader = new Scanner(System.in);
        try {
            // Input
            System.out.print("What is the order amount? ");
            orderAmount = Double.parseDouble(reader.nextLine());
            System.out.print("What is the state? ");
            state = reader.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input! Please restart the program and try again.");
            return;
        }
        // Processing
        total = orderAmount;
        if(state.equalsIgnoreCase(WISCONSIN_LABEL)){
            tax = total * (WISCONSIN_TAX_RATE / 100);
            // Special Case Output
            System.out.printf("The tax is $%.2f.\n", tax);
            total += tax;
        }
        // Output
        System.out.printf("The total is $%.2f.\n", total);
    }
}
