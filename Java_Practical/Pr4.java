package Java_Practical;

import java.util.Arrays;
import java.util.Scanner;

public class Pr4 {
    //SORT ELEMENTS
    public static void sort(int arr[]) {
        System.out.println("Given array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nSorted array is: ");
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the element: ");
            arr[i] = input.nextInt();
        }
        sort(arr);
        input.close();
    }
}
