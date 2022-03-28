package homework;

/*12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.) */

import java.util.Scanner;

public class Program12 {

public static void prime()
    {
    int number,temp;
    boolean isPrime = true;
    System.out.println("Please input the number");
    Scanner s = new Scanner(System.in);
    number = s.nextInt();
    s.close();

    for(int i=2; i<=number/2;i++){
        temp = number % i;
        if(temp==0){
            isPrime = false;
            break;
        }
    }
    if(isPrime)
        System.out.println(number+ " is a prime number");
    else
        System.out.println(number+ " is not a prime number");
    }

public static void main(String[] args) {
    prime();
    }
}
