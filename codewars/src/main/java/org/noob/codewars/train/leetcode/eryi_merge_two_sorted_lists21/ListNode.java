package org.noob.codewars.train.leetcode.eryi_merge_two_sorted_lists21;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        printNode(node1);
        ListNode listNode = makeNode(3);
        printNode(listNode);
    }

    public static ListNode printNode(ListNode node) {
        if (null == node) {
            System.out.println("打印完成");
            return node;
        }
        System.out.println("节点： " + node.val);
        return printNode(node.next);
    }

    public static ListNode makeNode(int count) {

        ListNode node = new ListNode(count);

        if (count < 0) {
            return node;
        }

        return node.next = makeNode(--count);
    }

}
