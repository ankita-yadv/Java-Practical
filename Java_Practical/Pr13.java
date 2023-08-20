package Java_Practical;

import java.util.Scanner;

public class Pr13 {
    //PALINDROME
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.next();
        int size = str.length();
        palindrome(str,size);
        in.close();
    }

    private static void palindrome(String str,int size) {
        Boolean flag = false;
        for (int i = 0; i < size/2; i++) {
            if ((str.charAt(i))==(str.charAt(size-1-i))) {
                flag = true;
            }
            else flag = false;
        }
        if (flag) {
            System.out.println("Given string is palindrome");
        }
        else System.out.println("Given string is not palindrome");
        
    }
}
