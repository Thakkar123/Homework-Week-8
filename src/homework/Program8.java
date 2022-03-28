package homework;

//8. Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@

import java.util.Scanner;

public class Program8 {
public static void triangle1()
        {
        int i,j,n;
        System.out.println("Input number of rows");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        s.close();
            for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            System.out.print("@");
            System.out.println("");
            }
        }
public static void main(String[] args) {
        triangle1();
    }
}

