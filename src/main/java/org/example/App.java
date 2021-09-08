/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String quantity = scan.nextLine();
        System.out.print("What is the state? ");
        String state = scan.nextLine();

        double quan = Double.parseDouble(quantity);
        double tot = quan;
        if(state.equals("WI"))
        {
            double tax = quan*.055;
            String sub = String.format("$%.2f",quan);
            String taxy = String.format("$%.2f",tax);
            tot = tot+tax;
            System.out.println(String.format("The subtotal is %s.\nThe tax is %s.",sub,taxy));
        }
        String total = String.format("$%.2f",tot);
        System.out.print(String.format("The total is %s",total));
    }
}