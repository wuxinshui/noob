package org.noob.codewars.train.leetcode.merge_two_sorted_lists21;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *  
 * <p>
 * 提示：
 * <p>
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution21 {

    /**
     * if (l1 == null) {
     * return l2;
     * } else if (l2 == null) {
     * return l1;
     * } else if (l1.val < l2.val) {
     * l1.next = mergeTwoLists(l1.next, l2);
     * return l1;
     * } else {
     * l2.next = mergeTwoLists(l1, l2.next);
     * return l2;
     * }
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode-solu/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists_copy(ListNode list1, ListNode list2) {
        if (null == list1) {
            return list2;
        } else if (null == list2) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists_copy(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists_copy(list1, list2.next);
            return list2;
        }

    }

    /**
     * 方法一：递归
     * 思路
     * <p>
     * 我们可以如下递归地定义两个链表里的 merge 操作（忽略边界情况，比如空链表等）：
     * <p>
     * \left\{ \begin{array}{ll} list1[0] + merge(list1[1:], list2) & list1[0] < list2[0] \\ list2[0] + merge(list1, list2[1:]) & otherwise \end{array} \right.
     * {
     * list1[0]+merge(list1[1:],list2)
     * list2[0]+merge(list1,list2[1:])
     * ​
     * <p>
     * list1[0]<list2[0]
     * otherwise
     * ​
     * <p>
     * <p>
     * 也就是说，两个链表头部值较小的一个节点与剩下元素的 merge 操作结果合并。
     * <p>
     * 算法
     * <p>
     * 我们直接将以上递归过程建模，同时需要考虑边界情况。
     * <p>
     * 如果 l1 或者 l2 一开始就是空链表 ，那么没有任何操作需要合并，所以我们只需要返回非空链表。否则，我们要判断 l1 和 l2 哪一个链表的头节点的值更小，然后递归地决定下一个添加到结果里的节点。如果两个链表有一个为空，递归结束。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode-solu/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists_official(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists_official(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_official(l1, l2.next);
            return l2;
        }
    }


}
