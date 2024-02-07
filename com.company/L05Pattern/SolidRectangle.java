// public class SolidRectangle{
//     public static void main(String[] args){
//         int n = 4;
//         int m = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// import java.util.*;

// public class SolidRectangle{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n:");

//         int n = sc.nextInt();
//         System.out.println("Enter m:");

//         int m = sc.nextInt();
//         // System.out.println("Enter m:");

//         // int n = 4;
//         // int m = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }






// import java.util.*;

// public class SolidRectangle{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n:");

//         int n = sc.nextInt();
//         System.out.println("Enter m:");

//         int m = sc.nextInt();
//         // System.out.println("Enter m:");

//         // int n = 4;
//         // int m = 5;

//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=m; j++){
//                 //cell-> (i,j)
//                 if(i==1||j==1||i==n||j==m){
//                 System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
// }




public class SolidRectangle{
    public static void main(String[] args){
        
        int n = 4;
        int m = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                //cell-> (i,j)
                if(i==1||j==1||i==n||j==m){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}




