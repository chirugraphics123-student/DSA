package Recursion;
import java.util.Scanner;
public class Factorial {
    static long fact(long n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n=sc.nextInt();
        sc.close();
        if(n<0){
            System.out.println("Invalid!!");
            System.exit(0);
        }
        System.out.println("Factorial: "+fact(n));
    }
}
