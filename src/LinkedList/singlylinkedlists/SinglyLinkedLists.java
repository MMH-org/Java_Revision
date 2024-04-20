package src.LinkedList.singlylinkedlists;


public class SinglyLinkedLists {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +" 🔗 ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(12);
        Node node1 = new Node(56);
        Node node2 = new Node(23);
        Node node3 = new Node(43);
        Node node4 = new Node(89);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=node4;

        display(node);
    }
}
