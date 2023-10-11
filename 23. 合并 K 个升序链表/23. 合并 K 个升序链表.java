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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //数组为空
        if(lists.length == 0){
            return null;
        }
        //虚拟头节点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        //优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            lists.length, (p1, p2) -> (p1.val - p2.val));
        //压入堆
        for(ListNode head : lists){
            if(head != null){
                pq.add(head);
            }
        }
        //主体操作，从最小堆里取最小的节点，放到p后面
        while(!pq.isEmpty()){
            //取出来的最小节点先放入临时节点，以便后面将取出节点的下一个节点放入最小堆
            ListNode temp = pq.poll();
            p.next = temp;
            if(temp.next != null){
                pq.add(temp.next);
            }
            p = p.next;
        }
        //返回合成的链表
        return dummy.next;
    }
}