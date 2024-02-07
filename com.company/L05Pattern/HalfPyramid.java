// public class HalfPyramid{
//     public static void main(String[] args){
        
//         int n = 4;


//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//             System.out.print("*");
            
//             }
//             System.out.println();
//         }
        
//     }
// }




// downward HalfPyramid

// public class HalfPyramid{
//     public static void main(String[] args){
        
//         int n = 4;


//         //outer loop
//         for(int i=n; i>=1; i--){
//             //inner loop
//             for(int j=1; j<=i; j++){
//             System.out.print("*");
            
//             }
//             System.out.println();
//         }
        
//     }
// }


// half pyramid rotate 180 degree
public class HalfPyramid{
    public static void main(String[] args){
        
        int n = 4;


        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop space print
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            
            }
            //inner loop star print
            for(int j=1; j<=i; j++){
            System.out.print("*");
            
            }
            System.out.println(" ");
        }
        
    }
}











