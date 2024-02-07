// Linear searching problem

// import java.util.*;


// public class SearchingArrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         //input
//         for(int i =0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();
//         //output
//         for(int i = 0; i<numbers.length; i++){
//             if(numbers[i] == x){
//                 System.out.print("x found at index : " + i);
//             }
        
//         }
//     }
    
// }



// //4 input

// // 1
// // 2
// // 3
// // 5


// // search 3
// // 3
// // output
// // x found at index : 2









import java.util.*;


public class SearchingArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i =0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int arr = 0;
        //output
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.print("x found at index : " + i);
            }
        
        }
    }
    
}



//4 input

// 1
// 2
// 3
// 5


// search 3
// 3
// output
// x found at index : 2