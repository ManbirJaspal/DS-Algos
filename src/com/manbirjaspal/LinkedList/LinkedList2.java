package com.manbirjaspal.LinkedList;

public class LinkedList2 {

}

class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int data) {

        //Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        if(head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        last.next = new_node;


        return;
    }

        public void push(int new_data) {
            Node new_node = new Node(new_data);

            new_node.next = head;

            head = new_node;

        }

        public void printList() {
            Node tnode = head;
            while(tnode != null) {
                System.out.print(tnode.data + "->");
                tnode = tnode.next;
            }
            System.out.print("null");
        }


    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.insert(6);
        llist.insert(7);
        llist.push(8);
        llist.push(9);
        llist.insert(10);



        System.out.println("\n Created Linked List is : ");
        llist.printList();
    }

}

