package array;

import java.util.Scanner;

public class SumOddEven {
    static void sum(int arr[],int l){
        int sumOdd = 0;
        int sumEven = 0;
        for (int i : arr) {
            if(i%2==0){
                sumEven += i;
            }
            else{
                sumOdd +=i;
            }
        }
        System.out.println("Sum of odd place in array is: " + sumOdd);
        System.out.println("Sum of even place in array is: " + sumEven);

    }
    static int sumEven(int arr[],int l){
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int len = scanner.nextInt();

        int arr[] = new int[len];

        for(int i = 0; i<len;i++){
            System.out.print("Enter the element: ");
            arr[i] = scanner.nextInt();
        }
        sum(arr, len);

        scanner.close();
    }
}
