package array;

import java.util.Scanner;

public class ArraySum {
    static int sum(int arr[]){
        int s = 0;
        for (int a:arr){
            s += a;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int l = scanner.nextInt();

        int arr[] = new int[l];

        for(int i=0;i<l;i++){
            System.out.print("Enter the element: ");
            arr[i] = scanner.nextInt();

        }
        System.out.println("Sum of the given array is: " + sum(arr));

        scanner.close();
    }
}
