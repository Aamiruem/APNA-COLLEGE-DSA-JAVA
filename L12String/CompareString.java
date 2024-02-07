// public class CompareString {

//     public static void main(String[] args) {
//     String name1 = "Tony";
//     String name2 = "Tony";

//     //1 s1>s2 : +ve value
//     //2 s1 == s2 : 0 value
//     //3 s1<s2 : -ve value

//     if (name1.compareTo(name2) == 0) {
//       System.out.println("Strings are equal");
//     } else {
//       System.out.println("Strings are not equal");
//     }
//   }
// }

// public class CompareString {

//   public static void main(String[] args) {
//     String name1 = "Tony1";
//     String name2 = "Tony";

//     //1 s1>s2 : +ve value
//     //2 s1 == s2 : 0 value
//     //3 s1<s2 : -ve value

//     if (name1 == name2) {
//       System.out.println("Strings are equal");
//     } else {
//       System.out.println("Strings are not equal");
//     }
//   }
// }

// kyu ki java ke undar string object hoti hai
public class CompareString {

  public static void main(String[] args) {
    String name1 = "Tony";
    String name2 = "Tony";

    //1 s1>s2 : +ve value
    //2 s1 == s2 : 0 value
    //3 s1<s2 : -ve value

    if (new String("Tony") == new String("Tony")) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }
}
