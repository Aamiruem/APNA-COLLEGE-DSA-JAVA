// public class Palindrome{
//     public static void main(String[] args){
        
//         int n = 5;

//         for(int i = 1; i<=n; i++){
//             //spaces
//             for(int j =1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             //first half numbers 
//             for(int j =i; j>=1; j--){
//                 System.out.print(j);
//             }

//             //first half numbers 
//             for(int j =2; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// output:-
//     1
//    212
//   32123
//  4321234
// 543212345







public class Palindrome{
    public static void main(String[] args){
        
        int n = 5;

        for(int i = 1; i<=n; i++){
            //spaces
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            //first half numbers 
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }

            //first half numbers 
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// output:-
//     11
//    2112
//   321123
//  43211234
// 5432112345

