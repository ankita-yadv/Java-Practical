package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * OddEvenArray
 */
public class OddEvenArray {
    static ArrayList<Integer> oddArr(int arr[],int l){
        ArrayList<Integer> arrO = new ArrayList<Integer>();
        for (int i : arr) {
            if (i%2!=0) {
                arrO.add(i);
            }
        }
        return arrO;
    }
    static ArrayList<Integer> evenArr(int arr[],int l){
        ArrayList<Integer> arrE = new ArrayList<Integer>();
        for (int i : arr) {
            if (i%2==0) {
                arrE.add(i);
            }
        }
        return arrE;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = scanner.nextInt();

        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter the element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Odd array is: " + oddArr(arr, len));
        System.out.println("Even array is: " + evenArr(arr, len));

        scanner.close();
    }
}