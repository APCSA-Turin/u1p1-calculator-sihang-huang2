package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations

        double tip = Math.round(cost * (percent/100.0) * 100.0)/100.0;
        double total = Math.round((cost + tip) * 100.0)/100.0;

        double beforeTipTotalPer = Math.round((cost/people) * 100.0)/100.0;
        double tipPer = Math.round((tip/people) * 100.0)/100.0;
        double totalPer = Math.round((total/people) * 100.0)/100.0;

        //DO NOT DELETE ANY OF THE CODE BELOW

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + total + "\n" + 
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

        double tip = Math.round(cost * (percent/100.0) * 100.0)/100.0;
        double total = Math.round((cost + tip) * 100.0)/100.0;

        double beforeTipTotalPer = Math.round((cost/people) * 100)/100.0;
        double tipPer = Math.round((tip/people) * 100)/100.0;
        double totalPer = Math.round((total/people) * 100)/100.0;
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        String itemsOrdered = "";

        while (condition) {
            //enter your code here 
            String input = scan.nextLine();
            if (input.equals(exit)) {
                condition = false;
            } else {
                itemsOrdered = itemsOrdered + input;
            }
        }

        result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + total + "\n" + 
                       "Per person cost before tip: $" + beforeTipTotalPer + "\n" +
                       "Tip per person: $" + tipPer + "\n" +
                       "Total cost per person: $" + totalPer + "\n" +
                       "-------------------------------\n" + 
                       "Items Ordered: \n" + 
                       itemsOrdered +
                       "-------------------------------\n";
                       ;

        scan.close();

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
