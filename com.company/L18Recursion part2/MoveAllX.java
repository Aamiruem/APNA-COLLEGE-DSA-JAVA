// remove all x from the string all 'x' characters

// public class MoveAllX{
//     public static void moveAllX(String str, int idx, int count, String newStr) {
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newStr);
//         }
//         else{
//             newStr += currChar;
//             moveAllX(str, idx+1, count, newStr);
//         }
//     }
//     public static void main(String[] args){
//         String str = "axbcxxd";
//         // moveAllX(str, idx, count, newStr);
//             moveAllX(str, 0, 0, " ");
//     }
// }

// count => length => n
// Time complexity => o(n + count) => o(n + n) => o(2n) => o(n)


// move aside from the string all 'x' characters
public class MoveAllX{
    public static void moveAllX(String str, int idx, int count, String newStr) {
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else{
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args){
        String str = "axbcxxd";
        // moveAllX(str, idx, count, newStr);
            moveAllX(str, 0, 0, " ");
    }
}


