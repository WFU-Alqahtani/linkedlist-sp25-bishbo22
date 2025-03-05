import java . util .*;

class Node{
    int data;
    Node next=null;

    public Node(int i){
        data=i;
    }
    public Node(int i, Node n){
        data=i;
        next=n;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(10));
        Node curr = head;
        for (int i = 0; i < 10; i++) {
            Node temp = new Node(rand.nextInt(10));
            curr.next = temp;
            curr = curr.next;
        }

        //print
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter one of the values to delete: ");
        int x = kb.nextInt();

        // deletion
        if (head.data == x){
            head = head.next;
        }
        Node temp = head;
        curr = head.next;
        while (curr != null){
            if (curr.data == x && curr.next != null){
                temp.next = curr.next;
            }
            if (curr.data == x && curr.next == null){
                temp.next = null;
            }
            curr = curr.next;
            temp = temp.next;
        }


        //print again
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}