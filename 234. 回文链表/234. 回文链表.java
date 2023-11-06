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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        ListNode cur = head;
        while(cur != null){
            array.add(cur.val);
            cur = cur.next;
        }

        int left = 0;
        int right = array.size() - 1;
        while(left < right){
            // if(!array.get(left).equals(array.get(right))){
            //     return false;
            // }
            if(array.get(left) != array.get(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}