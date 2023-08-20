package Java_Practical;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pr8 {
    //ARITHMETIC OPERATIONS USING STRINGTOKEN and TRIM
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string of instruction(in spaces): ");
        String s = in.nextLine();
        StringTokenizer str = new StringTokenizer(s," ");
        ArrayList<String> arr = new ArrayList<String>();
        while (str.hasMoreTokens()) {  
            arr.add(str.nextToken());
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        in.close();
    }
}
