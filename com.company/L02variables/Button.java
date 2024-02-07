import java.util.*;
public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1){
        System.out.println("Hello!");
        }
        else if(button == 2){
        System.out.println("Asalamualaikum!");
        }
        else if(button == 3){
        System.out.println("Bonjour!");
        }

        else if(button >= 4){
        System.out.println("Invalid Button!");
        }
        
    
    }
}
