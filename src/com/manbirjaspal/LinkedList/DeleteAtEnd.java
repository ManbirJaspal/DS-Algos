package com.manbirjaspal.LinkedList;

public class DeleteAtEnd {
}

class LinkedList5{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
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

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("EmptyList, Please insert data to delete");
            return;
        }
        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        current = null;
        previous.next = current;


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
        LinkedList5 ls = new LinkedList5();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.printList();
        ls.deleteAtEnd();
        ls.printList();
    }
}

