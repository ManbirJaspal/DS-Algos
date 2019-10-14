package com.manbirjaspal.LinkedList;

public class LinkedList1 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;

        }

    }

    //Method to insert new node

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



    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.printList();
    }


}
