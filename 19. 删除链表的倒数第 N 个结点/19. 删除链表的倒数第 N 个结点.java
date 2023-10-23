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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = findToEnd(dummy, n+1);
        p.next = p.next.next;

        return dummy.next;
    }

    private ListNode findToEnd(ListNode head, int k){
        ListNode p1 = head, p2 = head;

        for(int i=0; i<k; i++){
            p1 = p1.next;
        }

        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}
