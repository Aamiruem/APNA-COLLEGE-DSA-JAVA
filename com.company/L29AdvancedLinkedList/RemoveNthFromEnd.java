public class RemoveNthFromEnd {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        } 

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // removing SIZEth node from last i.e. head
        if (n == size) {
            return head.next;
        }

        // find previous node
        int ptf = size - n; // position to find
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; // previous node
        int cp = 1; // current position

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Call removeNthFromEnd method
        RemoveNthFromEnd solution = new RemoveNthFromEnd();
        int n = 2;
        ListNode newHead = solution.removeNthFromEnd(head, n);

        // Print modified linked list
        System.out.println("\nLinked List after removing " + n + "th node from the end:");
        printLinkedList(newHead);
    }

    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
