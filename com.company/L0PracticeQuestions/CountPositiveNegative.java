// import java.util.*;


// public class CountPositiveNegative {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }






// another way:

// import java.util.Scanner;

// public class CountPositiveNegative
// {
//    public static void main(String[] args)
//    {
//       int num, countP=0, countN=0, countZ=0;
//       Scanner scan = new Scanner(System.in);
      
//       System.out.print("Enter 10 Numbers: ");
//       for(int i=0; i<10; i++)
//       {
//          num = scan.nextInt();
//          if(num<0)
//             countN++;
//          else if(num>0)
//             countP++;
//          else
//             countZ++;
//       }
      
//       System.out.println("\nTotal Positive Number: " +countP);
//       System.out.println("Total Negative Number: " +countN);
//       System.out.println("Total Zero: " +countZ);
//    }
// }






import java.util.Scanner;

public class CountPositiveNegative
{
public static void main(String[] args)
{
    int num, countP=0, countN=0, countZ=0;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("1. Count Positive Number Only");
    System.out.println("2. Count Negative Number Only");
    System.out.println("3. Count Zero Only");
    System.out.println("4. Count Positive and Negative Number");
    System.out.println("5. Count Positive Number and Zero");
    System.out.println("6. Count Negative Number and Zero");
    System.out.println("7. Count Positive, Zero and Negative Number");
    System.out.print("Enter Your Choice (1-7): ");
    int choice = scan.nextInt();
    
if(choice>=1 && choice<=7)
{
    System.out.print("\nEnter the Size: ");
    int tot = scan.nextInt();
    System.out.print("Enter " +tot+ " Numbers: ");
        if(choice==1)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num>0)
                countP++;
            }
        }
        else if(choice==2)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num<0)
                countN++;
            }
        }
        else if(choice==3)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num==0)
                countZ++;
            }
        }
        else if(choice==4)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num>0)
                countP++;
            else if(num<0)
                countN++;
            }
        }
        else if(choice==5)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num>0)
                countP++;
            else if(num==0)
                countZ++;
            }
        }
        else if(choice==6)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num<0)
                countN++;
            else if(num==0)
                countZ++;
            }
        }
        else if(choice==7)
        {
            for(int i=0; i<tot; i++)
            {
            num = scan.nextInt();
            if(num>0)
                countP++;
            else if(num<0)
                countN++;
            else
                countZ++;
            }
        }
        if(countP!=0)
        {
            if(countP==1)
            System.out.println("\nThere is only 1 Positive Number Found.");
            else
            System.out.println("\nThere are " +countP+ " Positive Numbers Found.");
        }
        if(countN!=0)
        {
            if(countN==1)
            System.out.println("\nThere is only 1 Negative Number Found.");
            else
            System.out.println("\nThere are " +countN+ " Negative Numbers Found.");
        }
        if(countZ!=0)
        {
            if(countZ==1)
            System.out.println("\nThere is only 1 Zero found.");
            else
            System.out.println("\nThere are " +countZ+ " Zero Found.");
        }
    }
    else
        System.out.println("\nInvalid Input!");
}
}