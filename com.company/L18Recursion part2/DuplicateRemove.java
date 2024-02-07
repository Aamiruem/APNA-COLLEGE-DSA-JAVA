// public class DuplicateRemove {
//     public static boolean[] map = new boolean[26];

//     public static String removeDuplicates(String str, int idx, String newStr) {
//         if (idx == str.length()) {
//             return newStr;
//         }

//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a']) {
//             return removeDuplicates(str, idx + 1, newStr);
//         } else {
//             newStr += currChar;
//             map[currChar - 'a'] = true;
//             return removeDuplicates(str, idx + 1, newStr);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abbccda";
//         System.out.println("String after removing duplicates: " + removeDuplicates(str, 0, ""));
//     }
// }









public class DuplicateRemove{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str, idx + 1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar - 'a'] = true;
                removeDuplicates(str, idx + 1, newStr);
        }
    }
    public static void main(String[] args){
        String str = "abbccda";
        removeDuplicates(str, 0, " ");
    }
}