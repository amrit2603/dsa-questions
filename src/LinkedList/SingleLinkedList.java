package LinkedList;

public class SingleLinkedList {
    public static void main(String[] args) {

        Node n1 = new Node(10 , null);
        Node n2 = new Node(13 , null);
        Node n3 = new Node(18 , null);
        Node n4 = new Node(21 , null);

        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = n4 ;

        Node head = n1;

        Node temp = head ;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
