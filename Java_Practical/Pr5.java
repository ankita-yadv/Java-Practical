package Java_Practical;

import java.util.Scanner;

public class Pr5 {
    //FIBONACCI SERIES
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter the length");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        System.out.print("Want to run recursively(r) or simple(s): ");
        String ans = in.next();
        int arr[] = new int[len];
        arr[0] = 1;
        arr[1] = 1;
        if (ans.equals("r")) {
            Fib_Recur(len);
        } else {
            Fibonacci(arr,len);
        }
        in.close();
    }

    private static void Fibonacci(int arr[],int len) {
        for (int i = 2; i < len; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int Fib_Recur(int len) {
        return 0;
    }
}
