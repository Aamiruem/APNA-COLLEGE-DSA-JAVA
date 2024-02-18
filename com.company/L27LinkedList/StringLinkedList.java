// package L27LinkedList;

// import java.util.*;

// import java.util.LinkedList;
// public class StringLinkedList {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<String>();
//         list.addFirst("is");
//         list.addFirst("a");
//         System.out.println(list);

//         list.addFirst("This");
//         list.addLast("list");
//         System.out.println(list);


//         System.out.println(list.size());

//         for (int i = 0; i < list.size(); i++) {
//             System.out.print(list.get(i) + " -> ");
//         }
//         System.out.println("NULL");

//         // list.removeFirst();
//         // System.out.println(list);

//         // list.removeLast();
//         // System.out.println(list);

//         list.remove(3);
//         System.out.println(list);
//     }
// }







// package L27LinkedList;
import java.util.*;
import java.util.LinkedList;

public class StringLinkedList {

    public static void main(String args[]) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add elements to the list
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");

        // Print the linked list
        System.out.println(list);

        // Access elements by index and print
        System.out.println(list.get(0));

        // Print the size of the list
        System.out.println(list.size());

        // Remove elements by index
        list.remove(3);

        // Remove the first and last elements
        list.removeFirst();
        list.removeLast();

        // Print the modified linked list
        System.out.println(list);
    }
}


