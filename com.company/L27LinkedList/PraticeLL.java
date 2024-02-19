public class PraticeLL {
    Node head;
    private int size;

    PraticeLL(){
        int size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFisrt(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
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
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list,  Nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list, Nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        PraticeLL list = new PraticeLL();

        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        list.printList();

        list.addFisrt("This");

        list.printList();

        System.out.println(list.getSize());
        list.removeFirst();

        list.printList();

        list.removeLast();
        list.printList();
    }
}