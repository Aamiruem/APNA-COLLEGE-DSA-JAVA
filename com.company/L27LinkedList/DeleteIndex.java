// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

package L27LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DeleteIndex {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in the range of 1-50 to add to the linked list (enter -1 to stop):");

        int userInput;
        while (true) {
            userInput = sc.nextInt();
            if (userInput == -1) {
                break;
            }
            if (userInput >= 1 && userInput <= 50) {
                linkedList.add(userInput);
            } else {
                System.out.println("Please enter a number in the range of 1-50.");
            }
        }

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Delete nodes with values greater than 25
        deleteNodesGreaterThan25(linkedList);

        // Print the modified linked list
        System.out.println("Linked List after deleting nodes with values greater than 25: " + linkedList);
    }

    // Method to delete nodes with values greater than 25
    private static void deleteNodesGreaterThan25(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 25) {
                iterator.remove();
            }
        }
    }
}
