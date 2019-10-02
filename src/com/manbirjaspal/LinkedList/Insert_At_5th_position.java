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



         
    }
}
