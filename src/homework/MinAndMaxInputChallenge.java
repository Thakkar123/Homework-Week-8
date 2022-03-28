package homework;

//2. -Read the numbers from the console entered by the user and print the minimum
//        and maximum number the user has entered.
//        -Before the user enters the number, print the message Enter number:
//        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
//        number.
//        Hint:
//        -Use an endless while loop.
//        -Create a class with the name MinAndMaxInputChallenge.

import java.util.Scanner;

public class MinAndMaxInputChallenge {

public static void minmax()
        {
        int min = Integer.MIN_VALUE; // MIN_VALUE -- stores the minimum possible value of integer
        int max = Integer.MAX_VALUE; // MAX_VALUE -- store the maximum possible value of integer
        int number;
        boolean b;
        Scanner s = new Scanner(System.in);
        while (true)
        {
        System.out.println("Enter number");
        b = s.hasNextInt();
                if (b) {
                number = s.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min)
                    min = number;
            } else {
                break;
            }
            s.nextInt();
        }
        System.out.println("Min = " + min + "Max= " + max);
        s.close();
        }
public static void main(String[] args) {
        minmax();
        }
    }