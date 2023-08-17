package Java_Practical;

import java.util.Scanner;

public class Pr1 {
    //AREA OF CIRCLE
    public static void Area(int r){
        double ar = 3.14*r*r;
        System.out.println("Area of the circle is: " + ar);

    }
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        Area(r);
        input.close();
    }
}
