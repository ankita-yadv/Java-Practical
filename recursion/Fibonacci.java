package recursion;

import java.util.Scanner;

public class Fibonacci {
    static int[] fibo(int n){
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=0;i<n-2;i++){
            arr[i+2] = arr[i] + arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = scanner.nextInt();
        int a[] = fibo(n);
        System.out.println("Fibonacci series is: ");
        for (int arr : a) {
            System.out.println(arr);
        }
        scanner.close();
    }
}
