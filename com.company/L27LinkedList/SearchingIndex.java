// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

// package L27LinkedList;
import java.util.LinkedList;

public class SearchingIndex {



    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(3);

        // Search for the number 7 and display its index
        int searchNumber = 7;
        int index = searchIndex(linkedList, searchNumber);

        if (index != -1) {
            System.out.println("Number " + searchNumber + " found at index: " + index);
        } else {
            System.out.println("Number " + searchNumber + " not found in the linked list.");
        }
    }

    // Method to search for the index of a number in the linked list
    private static int searchIndex(LinkedList<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return i;
            }
        }
        return -1; // Return -1 if the number is not found
    }
}





