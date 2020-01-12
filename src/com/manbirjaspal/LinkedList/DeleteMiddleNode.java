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

    private void sendPost() throws  {

        String url = "https://chat.googleapis.com/v1/spaces/AAAAUfABqBU/messages?key=<WEBHOCK-KEY>";

        final HttpClient client = new DefaultHttpClient();

        final HttpPost request = new HttpPost(url);
        // FROM HERE

        request.addHeader("Content-Type", "application/json; charset=UTF-8");

        final StringEntity params = new StringEntity("{\"text\":\"Hello from Java!\"}", ContentType.APPLICATION_FORM_URLENCODED);
        request.setEntity(params);

        // TO HERE
        final HttpResponse response = client.execute(request);

        final BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
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
