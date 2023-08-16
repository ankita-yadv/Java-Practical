package Java_Practical;

import java.util.Scanner;

public class Pr2 {
    //SUM OF SERIES
    public static void Sum(int n) {
        double s = 0;
        for (double i = 1; i < n+1; i++) {
            s += 1/i;
            System.out.println(s);
            System.out.println(i);
        }
        System.out.println("Sum of series is: "+s);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Sum(n);
        in.close();
    }
}
