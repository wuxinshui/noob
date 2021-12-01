package org.noob.codewars.train.leetcode.ersan_merge_k_sorted_lists23;

public class Solution23 {

    public static void main(String[] args) {

    }

    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     * <p>
     * 执行用时：
     * 195 ms
     * , 在所有 Java 提交中击败了
     * 10.53%
     * 的用户
     * 内存消耗：
     * 40.9 MB
     * , 在所有 Java 提交中击败了
     * 5.07%
     * 的用户
     * 通过测试用例：
     * 133 / 133
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len <= 0) {
            return null;
        }
        ListNode cur = null;
        for (int i = 0; i < len; i++) {
            cur = mergeTwo(cur, lists[i]);
        }
        return cur;
    }

    private ListNode mergeTwo(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }


    /**
     * * https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
     * * <p>
     * * https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode-solu/
     * * <p>
     * <p>
     * <p>
     * 我们可以想到一种最朴素的方法：用一个变量 ans 来维护以及合并的链表，第 ii 次循环把第 ii 个链表和 ans 合并，答案保存到 ans 中。
     * <p>
     * <p>
     * 复杂度分析
     * <p>
     * 时间复杂度：假设每个链表的最长长度是 nn。在第一次合并后，ans 的长度为 nn；第二次合并后，ans 的长度为 2\times n2×n，第 ii 次合并后，ans 的长度为 i\times ni×n。第 ii 次合并的时间代价是 O(n + (i - 1) \times n) = O(i \times n)O(n+(i−1)×n)=O(i×n)，那么总的时间代价为 O(\sum_{i = 1}^{k} (i \times n)) = O(\frac{(1 + k)\cdot k}{2} \times n) = O(k^2 n)O(∑
     * i=1
     * k
     * ​
     * (i×n))=O(
     * 2
     * (1+k)⋅k
     * ​
     * ×n)=O(k
     * 2
     * n)，故渐进时间复杂度为 O(k^2 n)O(k
     * 2
     * n)。
     * 空间复杂度：没有用到与 kk 和 nn 规模相关的辅助空间，故渐进空间复杂度为 O(1)O(1)。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists_official_1(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; ++i) {
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }

    /**
     * 方法二：分治合并
     * 思路
     * <p>
     * 考虑优化方法一，用分治的方法进行合并。
     * <p>
     * 将 kk 个链表配对并将同一对中的链表合并；
     * 第一轮合并以后， kk 个链表被合并成了 \frac{k}{2}
     * 2
     * k
     * ​
     * 个链表，平均长度为 \frac{2n}{k}
     * k
     * 2n
     * ​
     * ，然后是 \frac{k}{4}
     * 4
     * k
     * ​
     * 个链表， \frac{k}{8}
     * 8
     * k
     * ​
     * 个链表等等；
     * 重复这一过程，直到我们得到了最终的有序链表。
     * <p>
     * 复杂度分析
     * <p>
     * 时间复杂度：考虑递归「向上回升」的过程——第一轮合并 \frac{k}{2}
     * 2
     * k
     * ​
     * 组链表，每一组的时间代价是 O(2n)O(2n)；第二轮合并 \frac{k}{4}
     * 4
     * k
     * ​
     * 组链表，每一组的时间代价是 O(4n)O(4n)......所以总的时间代价是 O(\sum_{i = 1}^{\infty} \frac{k}{2^i} \times 2^i n) = O(kn \times \log k)O(∑
     * i=1
     * ∞
     * ​
     * <p>
     * 2
     * i
     * <p>
     * k
     * ​
     * ×2
     * i
     * n)=O(kn×logk)，故渐进时间复杂度为 O(kn \times \log k)O(kn×logk)。
     * 空间复杂度：递归会使用到 O(\log k)O(logk) 空间代价的栈空间。
     * <p>
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists_official_2(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    class Status implements Comparable<Status> {
        int val;
        ListNode ptr;

        Status(int val, ListNode ptr) {
            this.val = val;
            this.ptr = ptr;
        }

        public int compareTo(Status status2) {
            return this.val - status2.val;
        }
    }



}
