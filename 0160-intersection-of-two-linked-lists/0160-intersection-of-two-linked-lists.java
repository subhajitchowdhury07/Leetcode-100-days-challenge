/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    private int findSize(ListNode head){
        int count =0;

        ListNode ptr = head;
        while(ptr!=null){
            ptr = ptr.next;
            count++;
        }

        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        int size1 = findSize(headA);
        int size2 = findSize(headB);

        ListNode ptr1=headA;
        ListNode ptr2=headB;

        int diff = size1 -size2;

        if(diff>0){   // if L1 is bigger 
            while(diff>0){
                ptr1 = ptr1.next;;
                diff--;
            }
        }else {  //L2 gratter size
            while(diff<0){
                ptr2 = ptr2.next;
                diff++;
            }
        }

        while(ptr1 != ptr2){
            ptr1 =ptr1.next;      
            ptr2 =ptr2.next;      
        }

        return ptr1;
    }
}