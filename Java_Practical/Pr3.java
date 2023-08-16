package Java_Practical;

public class Pr3 {
    //COMMAND LINE ARGUEMENT
    public static void main(String[] args) {
        if (args.length==1){
            System.out.println(args[0]);
        }
        else{
            for (String val : args) {
                System.out.println(val);
            }
        }
    }
}
