package src.LinkedList;

public class linkedListBasic {
    public static class Node{
        int data; // value
        Node next; // address of next node

        // constructions
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        // create node
        Node node0 = new Node(5);
        Node node1 = new Node(3);
        Node node2 = new Node(9);
        Node node3 = new Node(8);
        Node node4 = new Node(16);

        // link node together
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        System.out.println(node0.next.next.next.next.data);
    }
}
