// sum of three numbers 


import java.util.*;

public class SumOf3Numbers{
    public static int SumOf3Numbers(int a, int b, int c){
        int sum = a+b+c;
        return sum; 
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = SumOf3Numbers(a, b, c);
        System.out.println(sum);
    }
}