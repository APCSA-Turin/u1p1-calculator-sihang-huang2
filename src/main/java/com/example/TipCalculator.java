package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations

        double tip = cost * (percent/100.0);
        System.out.println("Tip: " + tip);

        double total = cost + tip;
        System.out.println("Total: " + total);

        double beforeTipTotalPer = Math.round((cost/people) * 100.0)/100.0;
        System.out.println("before tip: " + beforeTipTotalPer);

        double tipPer = Math.round((tip/people) * 100.0)/100.0;
        System.out.println("tip per person: " + tipPer);

        double totalPer = Math.round((total/people) * 100.0)/100.0;
        System.out.println("total per person: " + totalPer);

        //DO NOT DELETE ANY OF THE CODE BELOW

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(tip * 100.0)/100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(total * 100.0)/100.0 + "\n" + 
                       "Per person cost before tip: $" + beforeTipTotalPer + "\n" +
                       "Tip per person: $" + tipPer + "\n" +
                       "Total cost per person: $" + totalPer + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;

        final String exit = "-1";
        Scanner scan = new Scanner(System.in);

        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 

        double tip = cost * (percent/100.0);
        System.out.println("Tip: " + tip);

        double total = cost + tip;
        System.out.println("Total: " + total);

        double beforeTipTotalPer = Math.round((cost/people) * 100.0)/100.0;
        System.out.println("before tip: " + beforeTipTotalPer);

        double tipPer = Math.round((tip/people) * 100.0)/100.0;
        System.out.println("tip per person: " + tipPer);

        double totalPer = Math.round((total/people) * 100.0)/100.0;
        System.out.println("total per person: " + totalPer);
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        String itemsOrdered = "";

        while (condition) {
            //enter your code here 
            String input = scan.nextLine();

            //learned the String.equals method from ai
            if (input.equals(exit)) {
                condition = false;
            } else {
                itemsOrdered = itemsOrdered + input + "\n";
            }
        }

        result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(tip * 100.0)/100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(total * 100.0)/100.0 + "\n" + 
                       "Per person cost before tip: $" + beforeTipTotalPer + "\n" +
                       "Tip per person: $" + tipPer + "\n" +
                       "Total cost per person: $" + totalPer + "\n" +
                       "-------------------------------\n" + 
                       "Items ordered:\n" + 
                       itemsOrdered +
                       "-------------------------------\n";
                       ;

        scan.close();

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 2;
        int percent = 18;
        double cost = 5.99;             
        System.out.println(calculateTip(people,percent,cost));
        //System.out.println(extraCredit(people, percent, cost));
    }
}
        
