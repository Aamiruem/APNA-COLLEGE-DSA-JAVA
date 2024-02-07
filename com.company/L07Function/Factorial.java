import java.util.*;

public class Factorial{
    public static void printFactorial(int n){
        //loop
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
       printFactorial(n);
    }
}