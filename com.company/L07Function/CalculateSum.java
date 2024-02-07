import java.util.*;
public class CalculateSum{

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();


        int sum = calculateSum(a, b);
        System.out.println("sum of two numbers is: " + sum);


    }
}