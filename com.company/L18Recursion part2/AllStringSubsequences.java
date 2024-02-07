public class AllStringSubsequences{
    public static void subsequences(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be 
        subsequences(str, idx+1, newStr +currChar);

        // or not to be
        subsequences(str, idx+1, newStr);
    }
    public static void main(String[] args){
        String str = "abcd";
        subsequences(str, 0, "");
    }
}