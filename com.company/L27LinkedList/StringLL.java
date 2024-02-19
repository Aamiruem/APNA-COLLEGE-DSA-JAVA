import java.util.LinkedList;

public class StringLL {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.addFirst("MY");
        ll.addLast("NAME");
        ll.addLast("Aamir");

        System.out.println(ll);

        ll.add(2, "IS");
        System.out.println(ll);

        System.out.println(ll.size());
    }
}
