package recursion;
import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ans = 'Y';
        
        while(ans=='Y' || ans=='y'){
            System.out.print("Enter the number: ");
            int n = scanner.nextInt();
            System.out.println("Factorial of given number is: " + fact(n));
            System.out.print("Do you want to run again(Y/N)?");
            ans = scanner.next().charAt(0);
        }
        System.out.println("Program is closing now");

        scanner.close();
    }
}