package Java_Practical;

import java.util.Scanner;

public class Pr14 {
    //N PRIME NUMBERS
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        prime(n);
        scan.close();
    }

    private static void prime(int n) {
        for (int i = 2; i < n+1; i++) {
            Boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0) {
                   flag = false; 
                   break;
                }
            }
            if (flag) {
            System.out.print(i + " ");
            }
        }
    }
}
