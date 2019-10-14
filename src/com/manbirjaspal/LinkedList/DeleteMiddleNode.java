package com.manbirjaspal.LinkedList;

public class DeleteMiddleNode {
}

class LinkedList6 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void insert(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = null;

        if(head == null){
            head = new_node;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next=new_node;
        return;
    }

    public void deleteAtMiddle() {
        if(head == null){
            return;
        }
        if(head.next == null) {
            return;
        }

        Node fastptr = head;
        Node slowptr = head;
        Node prev = null;

        while(fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            prev = slowptr;
            slowptr = slowptr.next;

        }

        prev.next = slowptr.next;
        return;
    }

    public void printList()
    {
        Node currNode = head;

        System.out.print("\nLinkedList: ");

        while(currNode != null) {
            System.out.print(currNode.data + "->");

            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        LinkedList6 ls = new LinkedList6();

        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.insert(50);

        ls.printList();

        ls.deleteAtMiddle();

        ls.printList();
    }



}
