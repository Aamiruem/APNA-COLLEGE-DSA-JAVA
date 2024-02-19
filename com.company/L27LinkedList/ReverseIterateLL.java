public class ReverseIterateLL {
        Node head;
        private int size;

        ReverseIterateLL() {
            int size = 0;
        }

        public class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
                size++;
            }
        }

        public void addFisrt(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        public void printList() {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }

        public void reverseIterate() {
            if (head == null || head.next == null) {
                return;
            }
            Node prevNode = head;
            Node currNode = head.next;
            while (currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                //update
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;
        }

        public Node reverseRecursive(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        public static void main(String[] args) {
            ReverseIterateLL list = new ReverseIterateLL();

            list.addLast(1);
            list.addLast(2);
            list.addLast(3);
            list.addLast(4);
            list.addLast(5);
            list.addLast(6);
            list.addLast(7);
            list.printList();

            // using reverse iterative method

            // list.reverseIterate();
            // list.printList();

            // using reverse recursive method
            
            list.head = list.reverseRecursive(list.head);
            list.printList();
        }
    }


