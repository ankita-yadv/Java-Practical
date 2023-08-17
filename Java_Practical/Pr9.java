package Java_Practical;

import java.util.Scanner;

public class Pr9 {
    static void showMatrix(int matrix[][],int rows,int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void showTrans(int matrix[][],int rows,int cols){
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("\t" + matrix[j][i]);
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
        showMatrix(matrix,rows,cols);

        System.out.println("Transpose of matrix is: ");
        showTrans(matrix,rows,cols);

        input.close();
    }
}
