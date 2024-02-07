// Find the maximum & minimum number in an array of integers. /

import java.util.*;


public class MaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // int i = 0;

        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE; 

        int min = Integer.MAX_VALUE; 

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];

            }
            if(numbers[i]>max){
                max = numbers[i];
                
            }
        }
        System.out.println("Largest number is: " + max);

        System.out.println("Smallest number is: " + min);
        
        
    }
    
}
















// import java.util.*;

// public class MaxMin {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get the size of the array from the user
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();

//         // Create an array based on the user's input size
//         int[] array = new int[size];

//         // Get array elements from the user
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             array[i] = scanner.nextInt();
//         }

//         // Call the function to find max and min
//         int[] result = findMaxMin(array);

//         // Display the result
//         System.out.println("Maximum: " + result[0]);
//         System.out.println("Minimum: " + result[1]);

//         // Close the scanner
//         scanner.close();
//     }

//     public static int[] findMaxMin(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             // Handle the case of an empty array
//             return new int[]{};
//         }

//         int maxNum = arr[0];
//         int minNum = arr[0];

//         for (int num : arr) {
//             if (num > maxNum) {
//                 maxNum = num;
//             } else if (num < minNum) {
//                 minNum = num;
//             }
//         }

//         // Return an array containing max and min
//         return new int[]{maxNum, minNum};
//     }
// }
