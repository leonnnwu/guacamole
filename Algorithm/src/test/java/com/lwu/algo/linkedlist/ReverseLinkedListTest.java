package com.lwu.algo.linkedlist;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/15/16.
 */
public class ReverseLinkedListTest {

    @Tested
    ReverseLinkedList reverseLinkedList;

    @Test
    public void testReverse() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode newHead = reverseLinkedList.reverse(head);

        Assert.assertEquals(newHead.val, 3);
        Assert.assertEquals(newHead.next.val, 2);
        Assert.assertEquals(newHead.next.next.val, 1);
    }
}
