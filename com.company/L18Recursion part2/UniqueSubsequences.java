// import java.util.HashSet;

// public class UniqueSubsequences {
//     public static void subsequences(String str, int idx, String newStr, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(newStr)) {
//                 return;
//             } else {
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }
//         char currChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx + 1, newStr + currChar, set);

//         // or not to be
//         subsequences(str, idx + 1, newStr, set);
//     }

//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<String>();
//         subsequences(str, 0, "", set);
//     }
// }












import java.util.HashSet;

public class UniqueSubsequences{
    public static void uniqueSubsequences(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
            return;
            }
        }
        char currChar = str.charAt(idx);
        // to be 
        uniqueSubsequences(str, idx+1, newStr +currChar, set);

        // or not to be
        uniqueSubsequences(str, idx+1, newStr, set);
    }
    public static void main(String[] args){
        String str = "AAA";
        HashSet<String> set = new HashSet<String>();
        uniqueSubsequences(str, 0, "", set);
    }
}
