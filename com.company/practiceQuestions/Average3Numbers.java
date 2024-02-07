import java.util.*;

public class Average3Numbers{
    public static int Average3Numbers(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = Average3Numbers(a, b, c);
        System.out.println("Average of three numbers:" + avg);
    }
}