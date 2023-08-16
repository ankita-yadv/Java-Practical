package matrix;

import java.util.Scanner;

public class DiagonalSum {
    static int sumRight(int matrix[][],int size){
        int sum = 0;
        int i = 0;
        while (i<size) {
            sum += matrix[i][i];
            i++;
        }
        return sum;
    }
    static int sumLeft(int matrix[][],int rows,int cols){
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][cols-1];
            cols--;
            }
        return sum;
    }
    static void showMatrix(int matrix[][],int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of cols: ");
        int cols = input.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element: ");
                matrix[i][j] = input.nextInt();
            }   
        }
        System.out.println("Given matrix is: ");
        showMatrix(matrix, cols);
        System.out.println("Sum of diagonal values to the right is: " + sumRight(matrix,rows));
        System.out.println("Sum of diagonal values to the left is: " + sumLeft(matrix,rows,cols));

        input.close();
    }
}
