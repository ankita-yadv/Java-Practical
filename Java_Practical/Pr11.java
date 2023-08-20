package Java_Practical;

import java.util.Scanner;

//PARAMATERIZED CONSTRUCTOR

/*Gross Salary{
    //Gross Salary = Basic + HRA + DA + Allowance – PF
    //HRA = 20% of Basic 
    //DA = 50% of basic 
    //PF = 11% of basic

}*/

public class Pr11 {
    Pr11(int basic, int allow) {
        double HRA = basic * 0.20;
        double DA = basic * 0.50;
        double PF = basic * 0.11;
        double salary = basic + HRA + DA + allow - PF;
        System.out.println("Gross salary is: " + salary);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the basic pay: ");
        int basic = in.nextInt();
        System.out.print("Enter the allowance: ");
        int allow = in.nextInt();
        new Pr11(basic, allow);
        in.close();
    }
}
