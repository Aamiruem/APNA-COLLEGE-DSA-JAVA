import java.util.*;

public class CircumferenceOfCircle{
    public static double getCircumference(double radius){
        Double r = 2*3.14*radius;
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();

        System.out.println(getCircumference(r));
    }
}