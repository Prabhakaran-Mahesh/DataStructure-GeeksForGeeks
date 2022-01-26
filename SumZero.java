/*
Given some resources in the form of linked list you have to canceled out all the resources whose sum up to ) and return the remaining list.

Eg --> 6 -6 8 4 -12 9 8 -8
Output : 9
*/

import java.util.*;

class Node{
    int data;
    Node next;
}

class Linked {
    Node head;
    void insert(int number) {
        Node node = new Node();
        node.data = number;
        
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    void show() {
        Node n = head;
        
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    void sumZero() {
        int sum = 0;
        Node n = head;
        Node m = head.next;
        Node p = head;
        
        while(n.next != null) {
            sum = n.data;
            while(m != null){
                sum += m.data;
                if(sum == 0){
                    if(n == head){
                        head = m.next; 
                        n = head;
                        p = head;
                    }
                    
                    else{
                        p.next = m.next;
                        
                    }
                }
                m = m.next;
            }
            if(n.next!=null){
                p = n;
                n = n.next;
                m = n.next;
            }
        }
        
    }
}

public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello world : ");
        
        Linked linked = new Linked();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0; i<n; i++){
            linked.insert(scan.nextInt());
        }
        
        linked.show();
        linked.sumZero();
        linked.show();
    }
    
}

