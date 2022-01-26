/*
Find the middle of a given linked list

Given a singly linked list, find the middle of the linked list. For example, if the given linked list is 1->2->3->4->5 then the output should be 3. 
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. For example, if given linked list is 1->2->3->4->5->6 then the output should be 4. 
*/

import java.util.*;

class Node {
    int data;
    Node next;
}

class Linked {
    Node head;
    
    void insert(int number){
        Node node = new Node();
        node.data = number;
        
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    
    int length() {
        Node n = head;
        int i=0;
        while(n != null){
            //System.out.print(n.data + " ");
            n = n.next;
            i++;
        }
        //System.out.println();
        return i;
    }
    
    void printMiddle() {
        int middle = length()/2;
        
        Node n = head;
        for(int i=0; i<middle; i++){
            n = n.next;
        }
        
        System.out.print(n.data + " ");
    }
}

public class Main {
    public static void main(String[] args){
        Linked linked = new Linked();
        
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.insert(4);
        linked.insert(5);
        
        linked.length();
        //System.out.println(linked.length());
        linked.printMiddle();
    }
}
