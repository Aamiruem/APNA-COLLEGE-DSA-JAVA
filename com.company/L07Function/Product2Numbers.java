import java.util.*;
public class Product2Numbers{

    public static int Product2Numbers(int a, int b){
        int product = a * b;
        return product;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();


        int product = Product2Numbers(a, b);
        System.out.println("Product of two numbers is: " + product);


    }
}