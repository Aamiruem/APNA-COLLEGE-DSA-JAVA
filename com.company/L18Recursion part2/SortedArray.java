// public class SortedArray{
//     public static boolean isSorted(int arr[], int idx){
//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx] < arr[idx+1]){
//             //array is sorted till now
//             return isSorted(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         // array is  sorted increasing order then answered is true
//         // int arr[] = {1,2,3,4,5,6,7,8};   // true

//         // array is not sorted increasing order then answered is false
//         int arr[] = {1,2,3,4,5,6,7,8, 5,7}; // false
//         System.out.println(isSorted(arr, 0));
//     }
// }



//Time complexity = o(n)

public class SortedArray{
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        // opposite condition to get a same answered 
        if(arr[idx] >= arr[idx+1]){
            //array is sorted till now
        }
            return isSorted(arr, idx+1);
        
    }
    public static void main(String args[]){
        // array is  sorted increasing order then answered is true
        int arr[] = {1,2,3,4,5,6,7,8};   // true
        System.out.println(isSorted(arr, 0));
    }
}