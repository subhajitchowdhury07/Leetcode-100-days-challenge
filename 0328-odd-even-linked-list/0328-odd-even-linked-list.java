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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }

        // head = reverse(head);
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp =curr;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while(curr != null && curr.next !=null){
            // temp = curr.val;
            // curr = curr.next;
            prev.next = prev.next.next;
            prev = prev.next;

            curr.next = curr.next.next;
            curr = curr.next;

            // ListNode tempu = new ListNode(temp);
            // dummy.next =tempu;
            // dummy= dummy.next;
        }
        prev.next = temp;

        return head;

    }

    // private ListNode reverse(ListNode head){
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while(curr != null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr =next;

    //     }
    //     return prev;

    // }
}