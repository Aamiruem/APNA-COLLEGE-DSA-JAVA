// public class Find1stLastOccurrence{
//     public static int first = -1;
//     public static int last = 1;

//     public static void findOccurrence(String str, int idx, char element){
//         if(idx == str.length()){
//             System.err.println(first);
//             System.err.println(last);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(currChar == element){
//             if(first == -1){
//                 first = idx;
//             }
//             else{
//                 last = idx;
//             }
//         }
//         findOccurrence(str, idx+1, element);
//     }
//     public static void main(String[] args){
//         String str = "abaacdaefaah";
//         findOccurrence(str, 0, 'a');
//     }
// }



// public class Find1stLastOccurrence {
//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurrence(String str, int idx, char element) {
//         if (idx == str.length()) {
//             System.out.println("First occurrence of " + element + " is index: " + first);
//             System.out.println("Last occurrence of " + element + " is index: " + last);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if (currChar == element) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         findOccurrence(str, idx + 1, element);
//     }

//     public static void main(String[] args) {
//         String str = "abaacdaefaah";
//         findOccurrence(str, 0, 'a');
//     }
// }





public class Find1stLastOccurrence{
    public static int first = -1;
    public static int last = 1;

    public static void findOccurrence(String str, int idx, char element){
        if(idx == str.length()){
        System.err.println("First occurrence of " + element + " is index: " + first);
        System.err.print("Last occurrence of " + element + " is index: " + last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurrence(str, idx+1, element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        findOccurrence(str, 0, 'a');
    }
}

