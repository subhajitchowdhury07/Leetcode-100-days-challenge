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
    public ListNode doubleIt(ListNode head) {
        if(head == null){
            return head;
        }

        head = reverseList(head);

        int carry =0;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = head;
        while(ptr1 != null){

            int sum = ptr1.val+ptr1.val +carry;

            int d = sum%10;
            carry = sum/10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            ptr1 = ptr1.next;
        }

        if(carry>0){
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }

        return reverseList(ans.next);
    }

     // lets make a reverse Linkedlist 
     private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
       }
       return prev;
     }
}