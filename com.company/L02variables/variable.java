/*public class variable {

  public static void main(String[] args) {

    int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
  }
}
*/

/*
public class variable{
    public void localVariable(){
        String name = " Aamir ";
        int marks = 97;
        System.out.println(name + " scored " + marks+ "%");
    }
    public static void main(String[] args){
        variable v = new variable();
        v.localVariable();
    }
}







public class variable{
    public void notLocalVariable(){
        String name = " Aamir ";
        int marks = 97;
        System.out.println(name + " scored " + marks+ "%");
    }
    public static void main(String[] args){
        variable v = new variable();
        v.notLocalVariable();
    }
}
*/

// give an error
/*public class variable {
    public void localVariable(){
        String name = "Aamir";
        int marks = 98;

    }
    public void notLocalVariable(){
        System.out.println(name + " Scored " + marks + " %.");

    }

    public static void main(String[] args){
        variable v = new variable();
        v.notLocalVariable();
    }
}*/

// Instance variable
/*public class variable{
    public String name = "Aamir";
    public int marks = 98;

    public void instanceVariable(){
        System.out.println(name + " scored " + marks + "%");
    }
    public static void main(String[] args){
        variable v = new variable();
        v.instanceVariable();
    }

}*/

// class static variable

/*public class variable{
    public static String name;
    public static int marks;

    public static void main(String[] args){
        name = " Aamir ";
        marks = 98;

        System.out.println(name + " scored " +marks + "%");
    }

}*/

// If variable is not declared static the it gives an error.

/*public class variable{
    public String name;
    public int marks;


    public static void main(String[] args){
        name = "Aamir";
        marks = 98;
        System.out.println(name +"Scored" + marks + "%");
    }
}




public class variable {

  public static void main(String[] args) {
    // variables
    String name = "Tony Stark";
    int age = 48;
    double price = 25.23;
    int a = 25;
    int b = 10;

    int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    System.out.println(first + " + " + second + " = "  + sum);
  }
}

//sum code

public class variable {

  public static void main(String[] args) {
    // variables
    int a = 10;
    int b = 25;
    // int sum = a + b;
    // System.out.println(sum);


    // int diff = a - b;
    // System.out.println(diff);


    // int product = a * b;
    // System.out.println(product);

    float a1 = 10;
    float b1 = 25;

    float div = a1 / b1;
    System.out.println(div);
  }
}

Quiz solve

public class variable {

  public static void main(String[] args) {
    // variables
    int a = 10;
    int b = 5;
    // int ans = (a*b)/(a-b); //answer = 10

    int ans = a*b/a-b; // answer = 0
    System.out.println(ans);
  }
}






import java.util.*;

public class variable {

  public static void main(String[] args) {
    // variables
    System.out.println("Enter any name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();


    System.out.println(name);
  }
}







import java.util.*;

public class variable {

  public static void main(String[] args) {
    // input variables

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int b = sc.nextInt();
    int sum = a + b;

    System.out.println(sum);
  }
}
*/

// public class variable {

//   public static void main(String[] args) {

//     String name = "tony stark";
//     int age = 48;
//     double price = 25.25;
//     int a = 10;
//     int b = 25;

//     b = 20;
//     name = "ironman";
//     System.out.println(name + "\n" + a + "\n" +b + "\n" + age + "\n" + price);

//     int first = 10;
//     int second = 20;

//     // add two numbers
//     int sum = first + second;
//     System.out.println(first + " + " + second + " = "  + sum);
//   }
// }

import java.util.*;

public class variable {

    public static void main(String[] args) {
    int n = 0;
    int st = 1;
    int sp = n - 1;

    int number_of_line = 1;

    while (number_of_line <= n) {
      // print spaces
        for (int i = 0; i < sp; i++) {
        System.out.print("  ");
        }

      // print stars
        for (int i = 0; i < st; i++) {
        System.out.print("* ");
        }

      // prepare for next line
        System.out.println();
        st++;
        sp--;
        number_of_line++;
        }
    }
}
