package org.noob.codewars.train.leetcode.add_two_numbers2;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 * <p>
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class Solution {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();

        // ListNode result = solution.addTwoNumbers(l1, l2);
        // ListNode result = solution.addTwoNumbers1(l1, l2);
        // ListNode result = solution.addTwnNumbers2(l1, l2);
        ListNode result = quickMakeNode(List.of(2, 3, 4));

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    static ListNode quickMakeNode(List<Integer> list) {
        ListNode head = null;
        ListNode tail = null;
        for (Integer val : list) {
            ListNode node = new ListNode(val);
            if (null == head) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }

        return head;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //res存放结果，cur为res的尾指针
        ListNode res = new ListNode();
        ListNode cur = res;
        //表示进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            //如果其中有一个到达结尾了，那么这个链表这一位的的数字就为0。
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            //两个链表的两位相加
            int sum = a + b + carry;
            //大于10进位
            carry = sum / 10;
            //进位完剩下的余数
            sum %= 10;
            //创建一个节点接入res后面
            cur.next = new ListNode(sum);
            cur = cur.next;
            //分别后移
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        //如果最后还有进位的话，增加一个节点
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return res.next;
    }


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return root.next;
    }


    public ListNode addTwnNumbers2(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carray = 0;
        while (l1 != null || l2 != null) {

            int a1 = null == l1 ? 0 : l1.val;
            int a2 = null == l2 ? 0 : l2.val;

            int sum = a1 + a2 + carray;

            if (null == head) {
                head = tail = new ListNode((sum % 10));
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            carray = sum / 10;

            if (null != l1) {
                l1 = l1.next;
            }

            if (null != l2) {
                l2 = l2.next;
            }

        }

        if (1 == carray) {
            tail.next = new ListNode(1);
        }

        return head;
    }

}
