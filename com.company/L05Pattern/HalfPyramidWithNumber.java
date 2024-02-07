// public class HalfPyramidWithNumber{
//     public static void main(String[] args){
        
//         int n = 5;

//         // inner loop
//         for(int i = 1; i<=n; i++){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println("");

//         }


    
//     }
// }

// output:-
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5







// public class HalfPyramidWithNumber{
//     public static void main(String[] args){
        
//         int n = 5;

//         // inner loop
//         for(int i = n; i>=1; i--){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();

//         }
//     }
// }



// output:-
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1




public class HalfPyramidWithNumber{
    public static void main(String[] args){
        
        int n = 5;

        // inner loop
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }
}
// output:-
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1






