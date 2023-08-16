package matrix;

import java.util.Scanner;

public class Multiplication {
    static void showMatrix(int matrix[][],int rows,int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void showMul(int mat1[][],int mat2[][],int r1,int r2,int c1,int c2){
        int mulMat[][] = new int[c1][r1];
        int k = 0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mulMat[i][j] = (mat1[i][k]*mat2[k][j]) + (mat1[i][k+1]*mat2[k+1][j]) + (mat1[i][k+2]*mat2[k+2][j]);
                //System.out.println(mulMat[i][j]);
            }
        }
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                System.out.print("\t" + mulMat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To multiply two matrix(A,B): cols[A] = rows[B]");

        System.out.print("Enter number of rows for first matrix: ");
        int rows = input.nextInt();

        System.out.print("Enter number of cols for first matrix: ");
        int cols1 = input.nextInt();

        System.out.print("Enter number of cols for second matrix: ");
        int cols2 = input.nextInt();

        int matrix1[][] = new int[rows][cols1];
        int matrix2[][] = new int[cols1][cols2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter the element(A): ");
                matrix1[i][j] = input.nextInt();
            }   
        }

        System.out.println("First matrix is: ");
        showMatrix(matrix1,rows,cols1);

        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter the element(B): ");
                matrix2[i][j] = input.nextInt();
            }   
        }
        
        System.out.println("Second matrix is: ");
        showMatrix(matrix2,cols1,cols2);

        System.out.println("Product of both the matrix is: ");
        showMul(matrix1, matrix2, rows, cols1, cols1, cols2);

        input.close();
    }
}
