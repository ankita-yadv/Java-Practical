package Java_Practical;

import java.util.Scanner;

public class Pr10 { 
//LEAP YEAR
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the year: ");
    int year = input.nextInt();
    leapYr(year);
    input.close();
}
static boolean leap = false;
private static void leapYr(int year) {
    if (year%4 == 0) {
        leap = true;
        if (year%100 == 0 ) {
            if (year%400 == 0) {
                leap = true;
            }
            else 
                leap = false;
        }
        else leap = true;
    }
    else leap = false;
    if (leap) {
        System.out.println("This is a leap year");
    } 
    else {
        System.out.println("This is not a leap year");
    }
}
}
