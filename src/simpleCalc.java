//Assignment 1 - CP2406
//by Stephen Anthony Chandra
//SN: 13251860

import java.util.Scanner;

public class simpleCalc {

    public static void main(String args[])
    {
        float a;
        float b;
        int opIn;
        int result;

        System.out.println("Welcome to simpleCalculator_program!");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        a = input.nextFloat();

        System.out.println("Please enter the second number: ");
        b = input.nextFloat();

        Scanner choice = new Scanner(System.in);

        System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
        result = choice.nextInt();

        while (result !=5) {
            if (result == 1) {
                System.out.println("You have choose operation 1!");
                System.out.println("Your first input: " + (a));
                System.out.println("Your second input: " + (b));
                System.out.println("Your answer is " + (a) + " + " + (b) + " = " + (a + b));

                System.out.println("Do you want to choose another operation or input new number? 1(for operation) / 2(for new input)");
                opIn = input.nextInt();
                if (opIn == 1)
                {
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
                else {

                    System.out.println("Please enter the first number: ");
                    a = input.nextFloat();

                    System.out.println("Please enter the second number: ");
                    b = input.nextFloat();
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
            } else if (result == 2) {
                System.out.println("You have choose operation 2!");
                System.out.println("Your first input: " + (a));
                System.out.println("Your second input: " + (b));
                System.out.println("Your answer is " + (a) + " / " + (b) + " = " + (a / b));

                System.out.println("Do you want to choose another operation or input new number? 1(for operation) / 2(for new input)");
                opIn = input.nextInt();
                if (opIn == 1)
                {
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
                else {

                    System.out.println("Please enter the first number: ");
                    a = input.nextFloat();

                    System.out.println("Please enter the second number: ");
                    b = input.nextFloat();
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
            } else if (result == 3) {
                System.out.println("You have choose operation 3!");
                System.out.println("Your first input: " + (a));
                System.out.println("Your second input: " + (b));
                System.out.println("Your answer is " + (a) + " - " + (b) + " = " + (a - b));

                System.out.println("Do you want to choose another operation or input new number? 1(for operation) / 2(for new input)");
                opIn = input.nextInt();
                if (opIn == 1)
                {
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
                else {

                    System.out.println("Please enter the first number: ");
                    a = input.nextFloat();

                    System.out.println("Please enter the second number: ");
                    b = input.nextFloat();
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
            } else if (result == 4) {
                System.out.println("You have choose operation 4!");
                System.out.println("Your first input: " + (a));
                System.out.println("Your second input: " + (b));
                System.out.println("Your answer is " + (a) + " * " + (b) + " = " + (a * b));

                System.out.println("Do you want to choose another operation or input new number? 1(for operation) / 2(for new input)");
                opIn = input.nextInt();
                if (opIn == 1)
                {
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
                else {

                    System.out.println("Please enter the first number: ");
                    a = input.nextFloat();

                    System.out.println("Please enter the second number: ");
                    b = input.nextFloat();
                    System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                    result = choice.nextInt();
                }
            }else if (result == 5) {
                System.out.println("Thank you for using our program!");
                break;
            }
            else if (result != 1 && result != 2 && result != 3 && result != 4 && result !=5) {
                System.out.println("Please enter a valid choice!");
                System.out.println("Please choose the operation! 1 for sum, 2 for division, 3 for minus, 4 for times, 5 for quit");
                result = choice.nextInt();
            }
        }
    }

}
