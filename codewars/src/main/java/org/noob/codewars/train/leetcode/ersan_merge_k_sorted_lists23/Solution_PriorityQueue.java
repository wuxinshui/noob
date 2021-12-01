package org.noob.codewars.train.leetcode.ersan_merge_k_sorted_lists23;

import java.util.PriorityQueue;


/**
 * 思路
 * <p>
 * 这个方法和前两种方法的思路有所不同，我们需要维护当前每个链表没有被合并的元素的最前面一个，kk 个链表就最多有 kk 个满足这样条件的元素，每次在这些元素里面选取 val 属性最小的元素合并到答案中。在选取最小元素的时候，我们可以用优先队列来优化这个过程。
 * <p>
 * 复杂度分析
 * <p>
 * 时间复杂度：考虑优先队列中的元素不超过 kk 个，那么插入和删除的时间代价为 O(\log k)O(logk)，这里最多有 knkn 个点，对于每个点都被插入删除各一次，故总的时间代价即渐进时间复杂度为 O(kn \times \log k)O(kn×logk)。
 * 空间复杂度：这里用了优先队列，优先队列中的元素不超过 kk 个，故渐进空间复杂度为 O(k)O(k)。
 * <p>
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution_PriorityQueue {
    class Status implements Comparable<Status> {
        int val;
        ListNode ptr;

        Status(int val, ListNode ptr) {
            this.val = val;
            this.ptr = ptr;
        }

        @Override
        public int compareTo(Status status2) {
            return this.val - status2.val;
        }
    }

    PriorityQueue<Status> queue = new PriorityQueue<Status>();

    public ListNode mergeKLists(ListNode[] lists) {
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(new Status(node.val, node));
            }
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (!queue.isEmpty()) {
            Status f = queue.poll();
            tail.next = f.ptr;
            tail = tail.next;
            if (f.ptr.next != null) {
                queue.offer(new Status(f.ptr.next.val, f.ptr.next));
            }
        }
        return head.next;
    }

}
