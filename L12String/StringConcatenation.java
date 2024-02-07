// import java.util.Scanner;

// public class StringConcatenation {
//     public static void main(String[] args) {
//         // Concatenation
//         String firstName = "tony";
//         String lastName = "Stark";
//         String fullName = firstName  + " " +   lastName;
//         System.out.println(fullName);

//     }
// }

import java.util.Scanner;

public class StringConcatenation {

  public static void main(String[] args) {
    // Concatenation
    String firstName = "tony";
    String lastName = "Stark";
    String fullName = firstName + " @ " + lastName;
    System.out.println(fullName.length());

    //charAt
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }
  }
}
