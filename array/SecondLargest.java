package array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    static int secLar(int arr[],int l){
        Arrays.sort(arr);
        return arr[l-2];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = scanner.nextInt();

        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            System.out.print("Enter the element: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Second largest number of the array is: " + secLar(arr,len));

        scanner.close();
    }
}
