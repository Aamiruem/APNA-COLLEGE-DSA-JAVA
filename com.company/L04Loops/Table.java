// import java.util.*;
// public class Table{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number for table:");


//         int n = sc.nextInt();

//         int n1 = 0;
//         for(int i = 1; i<11; i++){
//             System.out.println(i*n);
//         }
//         System.out.print(2*n1);
//     }
// }



// using for loop
/*import java.util.Scanner;  
public class Table{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
//reading a number whose table is to be print  
int num=sc.nextInt();  
//loop start execution form and execute until the condition i<=10 becomes false  
for(int i=1; i <= 10; i++)  
{  
//prints table of the entered number      
System.out.println(num+" * "+i+" = "+num*i);  
}  
}  
} */



//using while loop
import java.util.Scanner;  
public class Table   
{  
public static void main(String args[])  
{  
// number n for which we have to print the  
// multiplication table.  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
//reading a number whose table is to be print  
int num=sc.nextInt();  
System.out.print("Enter range: ");       
//reading a number whose table is to be print  
int range=sc.nextInt();  
int i = 1;  
//while loop starts from 1 and execute up to the range   
while (i <= range)   
{  
//prints table of the entered number up to the range  
System.out.println(num + " * " + i + " = "+ num * i);  
//increments the value of i by 1  
i++;  
}  
}  
}  
