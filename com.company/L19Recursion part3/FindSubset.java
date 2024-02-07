// import java.util.ArrayList;

// public class FindSubset {
//     public static void printSubset(ArrayList<Integer> subset) {
//         for (int i = 0; i < subset.size(); i++) {
//             System.out.print(subset.get(i) + " ");
//         }
//         System.out.println();
//     }

//     public static void findSubset(int n, ArrayList<Integer> subset) {
//         if (n == 0) {
//             printSubset(subset);
//             return;
//         }

//         // add hoga
//         subset.add(n);
//         findSubset(n - 1, subset);

//         // add nahi hoga
//         subset.remove(subset.size() - 1);
//         findSubset(n - 1, subset);
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         ArrayList<Integer> subset = new ArrayList<Integer>();
//         findSubset(n, subset);
//     }
// }












import java.util.*;

public class FindSubset{
    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
            }
            System.out.println();
        } 
        public static void findSubset(int n, ArrayList<Integer> subset){
            if(n == 0){
                printSubset(subset);
                return;
            }
            //add hoga
            subset.add(n);
            findSubset(n-1, subset);

            // add nahi hoga 
            subset.remove(subset.size()-1);
            findSubset(n-1, subset);
        
    }
    public static void main(String[] args){
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}