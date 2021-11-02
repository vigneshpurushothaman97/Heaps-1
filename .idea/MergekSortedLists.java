/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for(ListNode head: lists)
        {
            if(head!=null)
                pq.add(head);
        }
        while(!pq.isEmpty())
        {
            ListNode min = pq.poll();
            cur.next = min;
            cur = cur.next;
            if(min.next!=null)
                pq.add(min.next);
        }
        return dummy.next;
    }
}

//Time complexity is: nk logk
//Space complexity is: O(k) . At any point in time, there'll be only k elements.