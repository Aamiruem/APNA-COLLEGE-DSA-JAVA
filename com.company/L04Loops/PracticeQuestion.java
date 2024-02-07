// Write a program to print numbers from 1 to 10.

// public class PracticeQuestion{
//     public static void main(String[] args){
//         for(int i = 1; i<11; i++){
//             System.out.print(i+ " ");
//         }
//     }
// }


// Write a program to calculate the sum of first 10 natural number.

// public class PracticeQuestion{
//     public static void main(String[] args){
//         int sum = 0;
//         for(int i = 1; i<=10; i++){
//             sum = sum + i;
//             System.out.println("sum: "+ "+" + sum);
//         }
//     }
// }





// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


// import java.util.Scanner;

// public class PracticeQuestion{
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
//         int num;
        
//         System.out.print("Enter any positive integer: ");
//        int num = console.nextInt();
                
//         System.out.println("Multiplication Table of " + num);
        
//         for(int i=1; i<=10; i++)
//         {
//             System.out.println(num +" x " + i + " = " + (num*i) );
//         }
//     }
// }



// Write a program to find the factorial value of any number entered through the keyboard. 

// import java.util.Scanner;

// public class PracticeQuestion
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int num; // To hold number
//         int fact = 1; // To hold factorial
        
//         System.out.print("Enter any positive integer: ");
//         int num = sc.nextInt();
       
//         for(int i=1; i<=num; i++)
//         {
//             // fact *= i;
//             fact = fact * i;
//         }
        
//         System.out.println("Factorial: "+ fact);
//     }
// } 




// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)


// import java.util.Scanner;

// public class PracticeQuestion
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int base; // To hold base
//         int power; // To hold power
//         int result = 1; // To hold result
        
//         System.out.print("Enter the base number: ");
//         base = sc.nextInt();

//         System.out.print("Enter the power: ");
//         power = sc.nextInt();
       
       
//         for(int i=1; i<=power; i++)
//         {
//             // fact *= i;
//             result = result * base;
//         }
        
//         System.out.println("Result: "+ result);
//     }
// } 



// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.



// import java.util.Scanner;

// public class PracticeQuestion
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
//         int reverse = 0;
        
//         System.out.print("Enter the number ");
//         number = console.nextInt();
        
//         int temp = number;
//         int remainder = 0;
        
//         while(temp>0)
//         {
// 	    remainder = temp % 10;
// 	    reverse = reverse * 10 + remainder;
//             temp /= 10;
//         }

//         System.out.println("Reverse of " + number + " is " + reverse);
//     }
// }




// Question 7

// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.



// import java.util.Scanner;

// public class PracticeQuestion
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
//         char choice;
//         int evenSum = 0;
//         int oddSum = 0;
        
//         do
//         {
//             System.out.print("Enter the number ");
//             number = console.nextInt();
        
//             if( number % 2 == 0)
//             {
//                 evenSum += number;
//             }
//             else
//             {
//                 oddSum += number;
//             }
        
//             System.out.print("Do you want to continue y/n? ");
//             choice = console.next().charAt(0);
            
//         }while(choice=='y' || choice == 'Y');
        
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }  
// }




// Question 8

// Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 



// import java.util.Scanner;

// public class PracticeQuestion
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
        
//         System.out.print("Enter the positive integer ");
//         number = console.nextInt();
        
//         boolean flag = true;
        
//         for(int i = 2; i < number; i++)
// 	{
// 	    if(number % i == 0)
//             {
//                 flag = false;
//                 break;
//             }
//         }

// 	if(flag && number > 1)
//         {
//             System.out.println("Number is prime");
//         }
// 	else
//         {
//             System.out.println("Number is not prime");
//         }
        
//     }  
// }






// Write a program to calculate HCF of Two given number.


import java.util.Scanner;

public class PracticeQuestion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int dividend, divisor;
        int remainder, hcf = 0;
        
        System.out.print("Enter the first number ");
        dividend = console.nextInt();
        
        System.out.print("Enter the second number ");
        divisor = console.nextInt();        
        
        do
	{
            remainder = dividend % divisor;
            
            if(remainder == 0)
            {
                hcf = divisor;
            }
	    else
            {
                dividend = divisor;
                divisor = remainder;
	    }
            
        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
    }  
}







Question 10

Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 

Show the answer.

import java.util.Scanner;

public class SumAgain
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number1, number2;
        char choice;
        
        do
        {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();
          
            System.out.print("Enter the second number ");
            number2 = console.nextInt();
            
            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
            System.out.println();
            
        }while(choice=='y' || choice == 'Y');
    }  
}









Question 11

Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

Show the answer.

import java.util.Scanner;


public class CountNumbers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number,          
            countPositive = 0, 
            countNegative = 0,
            countZero = 0;

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }  
}




Question 12

Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

Show the answer.

import java.util.Scanner;

public class FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > max)
            {
                max = number;
            }
            
            if(number < min)
            {
                min = number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}







Question 13

Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

Show the answer.

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int digit1,  // To hold first digit (Ones) of number 
            digit2,  // To hold second digit (Tens) of number
            digit3;  // To hold third digit (Hundreds) of number

	for(int number = 1; number <= 500; number++)
	{
            int temp = number;
	    digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;
            
            temp = temp / 10;
            digit3 = temp % 10;

	    if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
            {
	        System.out.println(number);
            }
	}
    }  
}





Question 14

Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... 

Show the answer.

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        int firstTerm = 0,
            secondTerm = 1,
            thirdTerm;
 
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
 
        System.out.print(firstTerm + " " + secondTerm + " ");
 
        for(int i = 3; i <= number; i++)
	{
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
	}
    }  
}





Question 15

Write a program to calculate the sum of following series where n is input by user. 
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

Show the answer.

import java.util.Scanner;

public class SumOfSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
  
        for(int i = 1; i <= number; i++)
	{
            sum += 1.0/i;
	}
        
        System.out.println("sum: " + sum);
    }  
}



Question 16

Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.

Show the answer.

import java.util.Scanner;

public class Ln2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        double sum = 0;
        int sign = 1; 
        
        for(int i = 1; i <= number; i++)
	{
            sum += (1.0 * sign) / i;
            sign *= -1;
	}
        
        System.out.println("log2: " + sum);
    }  
}






Question 17

Write a program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.

Show the answer.

import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number, // To hold the random number
            guess,  // To hold the number guessed by user
            tries = 0; // To hold number of tries
       
        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100
        
        System.out.println("Guess My Number Game");
        System.out.println();
        
        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
                
            tries++;
                
        if (guess > number)
        {
            System.out.println("Too high! Try Again");
        }
        else if (guess < number)
        {
            System.out.println("Too low! Try Again");
        }
        else
        {
	    System.out.println("Correct! You got it in " + tries + " guesses!");
        }
        
        }while (guess != number);
    }  
}






Write a program to print following :

 

i)

**********
**********
**********
**********

ii)

*
**
***
****
*****

iii)

        *
      **
    ***
  ****
*****

 

iv)

        *
      ***
    *****
  *******
*********

v)

        1
      222
    33333
  4444444
555555555

vi)

        1
      212
    32123
  4321234
543212345

 





// (i) Square of asterisks:


public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// (ii) Right-angled triangle of asterisks:


public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// (iii) Inverted right-angled triangle:


public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
// (iv) Pyramid of asterisks:


public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
(v) Pyramid of numbers:


public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

// (vi) Pyramid of numbers with a changing pattern:


public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}







// Question 19

// Write a program to compute sinx for given x. The user should supply x and a positive integer n. We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn

// sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......



import java.util.Scanner;

public class SinXSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for x and n
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Compute sin(x) using the series up to the term involving xn
        double result = computeSinX(x, n);

        // Display the result
        System.out.println("sin(" + x + ") = " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to compute sin(x) using the given series
    private static double computeSinX(double x, int n) {
        double result = 0;

        for (int i = 0; i <= n; i++) {
            result += (Math.pow(-1, i) * Math.pow(x, 2 * i + 1)) / factorial(2 * i + 1);
        }

        return result;
    }

    // Function to compute the factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}




// Question 20

// Write a program to compute the cosine of x. The user should supply x and a positive integer n. We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn

// cos x = 1 - x2/2! + x4/4! - x6/6! .....


import java.util.Scanner;

public class CosXSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for x and n
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Compute cos(x) using the series up to the term involving xn
        double result = computeCosX(x, n);

        // Display the result
        System.out.println("cos(" + x + ") = " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to compute cos(x) using the given series
    private static double computeCosX(double x, int n) {
        double result = 1; // The first term in the series is always 1

        for (int i = 1; i <= n; i++) {
            result += Math.pow(-1, i) * (Math.pow(x, 2 * i) / factorial(2 * i));
        }

        return result;
    }

    // Function to compute the factorial of a number
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}

 