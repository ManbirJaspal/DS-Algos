package com.manbirjaspal.LinkedList;

public class Insert_At_5th_position {

}

class LinkedList3 {

    Node head;

     class Node {
        int data;
        Node next;


        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insert(int new_data){
         Node new_node = new Node(new_data);

         if(head == null) {
             head = new Node(new_data);
             return;
         }

         new_node.next = null;

         Node last = head;
         while(last.next != null) {
             last = last.next;
         }

         last.next = new_node;
         return;
    }

    public void insertAtPostion(int new_data, int pos){
         Node new_node = new Node(new_data);
         new_node.data = new_data;
         new_node.next = null;

         if(head == null) {
             if(pos != 0) {
                 return;
             } else {
                 head = new_node;
             }
         }

         if(head != null && pos == 0) {
             new_node.next = head;
             head = new_node;
             return;
         }

         Node current = head;
         Node previous = null;

         int i = 0;

         while (i < pos) {
             previous = current;
             current = current.next;

             if (current == null) {
                 break;
             }

             i++;
        }

        new_node.next = current;
         previous.next = new_node;


    }

    public void printList()
    {
        Node currNode = head;

        System.out.println("\nLinkedList: ");

        while(currNode != null) {
            System.out.print(currNode.data + "->");

            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        LinkedList3 ls = new LinkedList3();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.printList();
        ls.insertAtPostion(15, 2);
        ls.printList();
    }
}
