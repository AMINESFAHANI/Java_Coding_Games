
package com.xyz;
import org.junit.Test;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class SinglyLinkedList {
    private  Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }



    public Node CreateNode(int i) {

    return new Node(i);
    }

    public boolean isEmpty() {
      if(this.getNode()==null) return true;
      else return false;
    }

    public Node add(int i) {
       this.setNode(new Node(i));
       return this.node;
    }

    public int getHeadNode() {
        return this.getNode().data;
    }

    public Node getNextNode() {
       return this.getNode().next;
    }
}
class Node{
    int data;
    Node next=null;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }
}