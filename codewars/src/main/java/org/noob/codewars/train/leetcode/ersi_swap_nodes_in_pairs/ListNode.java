package org.noob.codewars.train.leetcode.ersi_swap_nodes_in_pairs;

import java.util.concurrent.atomic.AtomicLong;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    private final static AtomicLong counter = new AtomicLong(1);

    public static ListNode makeNode(int count) {
        if (count == 0) {
            return null;
        }


        ListNode node = new ListNode(count);

        node.next = makeNode(--count);

        return node;
    }

    public static ListNode printNode(ListNode head) {

        if (null == head) {
            System.out.println("打印完成");
            return head;
        }

        long index = counter.getAndIncrement();
        System.out.printf("iterator node %s: %s", index, head.val);
        System.out.println();

        return printNode(head.next);
    }
}
