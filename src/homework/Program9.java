package homework;

// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Program9 {
public static void fibonacci()
        {
        int a = 0;
        int b = 1;
        int c, i;
        int count = 10;
        System.out.println(a+ " "+b);
            for (i = 2; i < count; ++i) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
            }
        }
public static void main(String[] args) {
        fibonacci();
    }
}
