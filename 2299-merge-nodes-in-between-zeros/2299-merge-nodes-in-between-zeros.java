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
    public ListNode mergeNodes(ListNode head) {
        // ListNode dummy = new ListNode(-1);
        // dummy.next = head.next;
        // ListNode curr =head.next;

        // while(curr !=null){
        //      if(curr.next.val !=0){
        //         ListNode fast = curr.next;
        //         while(fast.next.val != 0){
        //         curr.val = curr.val+fast.val;
        //         // curr.next = curr.next.next;
        //        fast =fast.next;
        //         }
        //         curr.next = fast.next.next;
        //         // curr= curr.next.next;
        //      }else{
        //         curr.next = curr.next.next;
        //         curr= curr.next.next;
        //      }
        //     curr = curr.next;
        // }
        //      return dummy.next;

        ListNode dummy = new ListNode(-1);
        // dummy.next = head.next;

        ListNode newHead = dummy;
        ListNode curr =head.next;

        int sum=0;

        while(curr != null){
            if(curr.val !=0 ){
                sum += curr.val;
            }
            else{
                newHead.next = new ListNode(sum);
                newHead =  newHead.next;
                sum =0;
            }

            curr = curr.next;
        }
        return dummy.next;
    }
}