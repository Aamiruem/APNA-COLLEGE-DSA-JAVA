package L30Stack;
public class LinkedListStack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        /* public Stack() {
            this.head = null;
        } */

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

     /*    System.out.println(s.pop()); // Output: 3
        System.out.println(s.pop()); // Output: 2
        System.out.println(s.pop()); // Output: 1
        System.out.println(s.pop()); */ // Output: Stack is empty

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop(); // This line will cause an exception because the stack is empty
        }
    }
}
