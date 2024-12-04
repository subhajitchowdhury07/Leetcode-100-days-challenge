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
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr = head;

        while(curr != null){
            ListNode next= curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode fMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            turtle =turtle.next;
            hare = hare.next.next;
        }

        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
     if(head == null || head.next== null){
        return true;
     }   

      ListNode middle = fMiddle(head);
      ListNode secHalfStart = reverse(middle.next);

      ListNode firstHalf = head;
      while(secHalfStart != null){
        if(firstHalf.val != secHalfStart.val){
            return false;
        }
        firstHalf = firstHalf.next;
        secHalfStart = secHalfStart.next;
      }

      return true;
    }
}