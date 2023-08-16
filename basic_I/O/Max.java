import java.util.Scanner;

class Max{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        //String s = "ankita";
         //=s.substring(i, i+3)
        //int max;

        if (num1>num2 && num1>num3){
            System.out.println("First number is greatest among the three.");
        }
        else if (num2>num3) {
            System.out.println("Second number is greatest among the three.");
        } 
        else {
            System.out.println("Third number is greatest among the three.");
        }

        scanner.close();
    }
}