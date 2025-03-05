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
            curr.next = new Node(rand.nextInt(10));
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
        int x = 0;
        try{
            x = kb.nextInt();
        }catch (InputMismatchException e){
            System.out.print("Please Restart the Program and Use a Value that is an Integer.");
            System.exit(1);
        }

        // deletion
        if (head.data == x){
            head = head.next;
        }
        Node temp = head;
        curr = head.next;
        while (curr != null){
            if (curr.data == x){
                temp.next = curr.next; // Skip current node
            } else {
                temp = temp.next; // Move forward only if no deletion
            }
            curr = curr.next;
        }


        //insert at the head
        head.next = new Node(20,head.next);
        //insert at the end
        curr = head;
        Node newNode2 = new Node(40,null);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode2;
        //insert at node 4
        int num = 4;
        curr = head;
        temp = head;
        for(int i = 0;i < num;i++){
            if(i<num - 2){
                curr = curr.next;
            }
            else{
                temp = curr.next;
            }
        }
        curr.next = new Node(60,temp.next);

        //print again
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}