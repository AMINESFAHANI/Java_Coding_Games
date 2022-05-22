package com.xyz;


import org.junit.Test;
import com.xyz.*;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {



    @Test
    public void testNewLinkedList(){
        SinglyLinkedList singly = new SinglyLinkedList();
        assertTrue(singly.isEmpty());
    }

    @Test
    public void shouldTestNodeCreatedSuccessfully() {
        SinglyLinkedList singly = new SinglyLinkedList();
        Node actual = singly.CreateNode(10);
        assertNotEquals(null, actual);

    }

    @Test
    public void shouldTestLinkedListAddASingleNode() {
        SinglyLinkedList linkList = new SinglyLinkedList ();
        assertEquals(true, linkList.isEmpty());
        linkList.add(10);

        assertEquals(10, linkList.getHeadNode());
        assertEquals(null, linkList.getNextNode());
    }

    @Test
    public void shouldTestNodeCreatedSuccessfully1() {
        SinglyLinkedList singly = new SinglyLinkedList();
        Node actual = singly.add(10);
        assertNotEquals(null, actual);
    }

}
