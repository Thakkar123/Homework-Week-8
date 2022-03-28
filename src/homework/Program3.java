package homework;

//3. Write a Java program that takes the user to provide a single character from the
//        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//        error message.
//        For eg:
//        Input an alphabet: p
//        Expected Output:
//        Input letter is Consonant

import java.util.Scanner;

public class Program3 {

public void alphabet()
        {
        char c;
        System.out.println("Enter the character");
        Scanner p = new Scanner(System.in);
        c = p.next().charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Input letter is Vowel");
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.println("Input letter is Consonant");
            } else
                System.out.println("Not an alphabet");
        }
public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.alphabet();
    }
}
