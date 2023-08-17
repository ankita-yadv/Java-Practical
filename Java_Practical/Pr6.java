package Java_Practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr6 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee name: ");
        String name = in.readLine();
        System.out.print("Enter employee code: ");
        int code = Integer.parseInt(in.readLine());
        System.out.println("----EMPLOYEE DETAILS----");
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        in.close();
    }
}
