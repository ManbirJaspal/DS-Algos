package com.manbirjaspal.LinkedList;

public class DeleteAtStart {
}

class LinkedList4 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = null;

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public void deleteHead() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return;
    }

    public void printList()
    {
        Node currNode = head;

        System.out.print("LinkedList: ");

        while(currNode != null) {
            System.out.print(currNode.data + "->");

            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        LinkedList4 ls = new LinkedList4();

        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);

        ls.printList();

        ls.deleteHead();

        ls.printList();
    }

}




