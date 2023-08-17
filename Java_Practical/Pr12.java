package Java_Practical;

import java.util.Scanner;

public class Pr12 {
    // HCF LCM
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int num1 = in.nextInt();
        System.out.print("Enter second num: ");
        int num2 = in.nextInt();
        
        int hcf = hcf(num1, num2);
        int prod = num1 * num2;
        int lcm = Lcm(hcf, prod);
        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: " + lcm);
        in.close();
    }
    public static int hcf(int a,int b) {
        if (b==0) {
            return a;
        }
        return hcf(b,a%b);
    }

    private static int Lcm(int hcf, int prod) {
        return prod / hcf;
    }
}
