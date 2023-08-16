package string;
import java.util.Arrays;
import java.util.Scanner;

public class Subtring {

    public static String getSmallestAndLargest(String s, int k) {
        // String smallest = "";
        // String largest = "";
        
        int len = s.length()-2;
        String str[] = new String[len];
        
        for(int i=0;i<len;i++){
            str[i] = s.substring(i, i+3);
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //return smallest + "\n" + largest;
        return str[0] +"\n" + str[str.length-1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}