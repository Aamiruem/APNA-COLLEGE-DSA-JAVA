import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        // String Declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your Name: " + name);
    }
}
